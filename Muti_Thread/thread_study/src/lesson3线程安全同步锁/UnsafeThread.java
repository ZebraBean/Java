package lesson3线程安全同步锁;

public class UnsafeThread {

    private volatile static int COUNT = 0;

    //有一个变量COUNT=0;同时启动20个线程，每个线程循环1000次，每次循环COUNT++
    //等着20个子线程执行完毕之后，在main线程打印COUNT（预期20000）
    public static void main(String[] args) throws InterruptedException {
        //尽量同时启动，不让new Thread耗时影响
        Thread[] threads = new Thread[20];
        for(int i=0; i<20; i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j=0; j<1000; j++){
                        COUNT++;//1.从主存读取值 2.修改 3.写回主存
                    }
                }
            });
        }
        for(Thread t : threads){
            t.start();
        }
        //让main线程阻塞等待所有的20个子线程执行完毕
        for(Thread t : threads){
            t.join();
        }
        System.out.println(COUNT);
    }
}
