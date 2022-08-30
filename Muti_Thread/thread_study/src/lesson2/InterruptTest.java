package lesson2;

public class InterruptTest {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                //中断以后，停止程序
                try {
                    //...执行任务，执行时间可能比较长
                    for(int i=0; i<10000 && !Thread.currentThread().isInterrupted(); i++){
                        /*这个地方不能直接使用t.isInterrupted,因为这段代码是作为传入参数给t的，
                        这个时候t还没有被创建出来，这里可以使用Thread.currentThread方法来获取
                        当前代码行所在的线程*/

                        //这个判断条件表示，当前线程被中断后，标志位为true，不进入循环
                        System.out.println(i);
                        //模拟中断线程
                        Thread.sleep(1000);
                        //通过标志位自行实现，无法解决线程阻塞导致无法中断
//                        Thread.sleep(100000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //中断以后，继续执行
                //...执行任务，执行时间可能比较长
//                for(int i=0; i<10000 && !Thread.currentThread().isInterrupted(); i++){
//                    System.out.println(i);
//                    //模拟中断线程
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
                //中断抛出异常后捕获，然后打印堆栈信息，线程继续执行。
//                        e.printStackTrace();
//                    }
//                }
            }
        });
        t.start();//线程启动，中断标志位=false
        System.out.println("t start");
        //模拟，t执行了5秒，还没有结束，要中断，停止t线程
        Thread.sleep(5000);
        //告诉t线程，要中断（设置t线程的中断标志位为true），由t的代码自行决定是否中断
        //如果t线程处于阻塞状态，即t线程处于休眠的1s内，会抛出InterruptedException，并且重置t线程的中断标志位
        t.interrupt();
        System.out.println("t stop");
    }
}
