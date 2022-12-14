package lesson6线程通信;

public class SequencePrint {

    public static void main(String[] args) {
        //有三个线程，每个线程只能打印A或B或C
        //要求：同时执行三个线程，按CBA顺序打印
        Thread c = new Thread(new PrintTask("C", null));
        Thread b = new Thread(new PrintTask("B", c));
        Thread a = new Thread(new PrintTask("A", b));
        a.start();
        b.start();
        c.start();
        //进阶作业：有三个线程，每个线程只能打印A或B或C
        //要求：同时执行三个线程，按ABC顺序打印，依次打印10次，abc换行abc换行abc
        //考察知识点：代码设计，多线程通信
    }

    private static class PrintTask implements Runnable{
        private String content;
        private Thread joinTask;

        public PrintTask(String content, Thread joinTask) {
            this.content = content;
            this.joinTask = joinTask;
        }

        @Override
        public void run() {
            try {
                if(joinTask != null)
                    joinTask.join();
                System.out.println(content);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
