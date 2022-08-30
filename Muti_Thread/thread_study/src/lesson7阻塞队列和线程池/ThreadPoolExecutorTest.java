package lesson7阻塞队列和线程池;

import java.util.concurrent.*;

public class ThreadPoolExecutorTest {

    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                5,//核心线程数--->正式员工
                10,//最大线程数--->正式员工+临时工（临时工主要用于业务繁忙的时候雇过来用一下的）
                60,//时间的数值，下面是时间的单位，idle也就时临时线程最大的存活时间
                TimeUnit.SECONDS,//idle线程的空闲时间：临时工最大的存活时间，超过时间就解雇
                new LinkedBlockingQueue<>(50),//阻塞队列：任务存放的地方（快递仓库）
                //这里阻塞队列的容量可以不给，默认大小是Integer.MAXVALUE
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {//线程池中定义的任务类r
                        //默认是返回的r对象，调用的是r对象里面的run方法，所以我们需要自己new一个Thread，然后返回
                        return new Thread(new Runnable() {
                            @Override
                            public void run() {
                                System.out.println(Thread.currentThread().getName()+"开始执行了");
                                //r对象是线程池内部封装过的工作任务类（Worker），会一直循环等待的方式从阻塞队列中取任务来执行
                                //这里我们不需要自己再去调用r.run，他自己会去循环调用
                             r.run();
                            }
                        });
                    }
                },//创建线程的工厂类：线程池创建线程时，调用该工厂的方法创建线程--->招聘员工的标准
                new ThreadPoolExecutor.AbortPolicy()
                /**
                 * 拒绝策略：达到最大线程数且阻塞队列已满，采取的拒绝策略（四种选一种，默认是第一个）
                 * AbortPolicy：直接抛RejectedExecutionException（不提供handler时的默认策略）
                 * CallerRunsPolicy：谁（某个线程）交给我（线程池）任务，我拒绝执行，由谁自己执行
                 * DiscardPolicy：交给我的任务，直接丢弃掉
                 * DiscardOldestPolicy：丢弃阻塞队列中最旧的任务
                 */
        );//线程池创建以后，只要有任务就自动执行
        for(int i=0; i<20; i++){
            final int j = i;
            //线程池执行任务：execute、submit--->提交执行一个任务
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"开始执行了");
                    System.out.println(j);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        //线程池有4个快捷创建方式（实际工作不使用，作为面试要了解）
        //阿里java开发手册，说明不能直接使用以下方式创建线程池
        //实际工作需要使用ThreadPoolExecutor，构造参数自己指定，甚至有时候需要自己写一个拒绝策略的类
        //主要原因是LinkedBlockingQueue最大容量是Integer.MAXVALUE（2^31到2^31-1)，要是直接用下面的可能会造成内存炸掉，
        //线程的个数和任务的个数不可控制，需要自己调整参数，调整线程的最大数量和存储队列的最大容量。

        ExecutorService pool2 = Executors.newSingleThreadExecutor();//单线程池
        ExecutorService pool3 = Executors.newCachedThreadPool();//缓存的线程池
        ExecutorService pool5 = Executors.newFixedThreadPool(4);//固定大小线程池
        ScheduledExecutorService pool4 = Executors.newScheduledThreadPool(4);//计划任务线程池
//        pool4.schedule(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("hello");
//            }
//        }, 2, TimeUnit.SECONDS);
        pool4.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        }, 2, 1, TimeUnit.SECONDS); //延迟两秒钟，然后开始每1秒钟执行一次。
    }
}
