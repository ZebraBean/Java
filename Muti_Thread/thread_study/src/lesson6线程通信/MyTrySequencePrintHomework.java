package lesson6线程通信;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/8/13
 * Time: 22:11
 * Description: No Description
 */
public class MyTrySequencePrintHomework {
    private static String before = "C";
    private static int count = 0;
    private static int TIMES = 10;
    public static void main(String[] args) {
        Thread a = new Thread(new Task("A"));
        Thread b= new Thread(new Task("B"));
        Thread c = new Thread(new Task("C"));
        a.start();
        b.start();
        c.start();
    }
    public static class Task implements Runnable {
        private String name;
        private String rightBefore;

        public Task(String name) {
            this.name = name;
            if (name.equals("A"))
                this.rightBefore = "C";
            if (name.equals("B"))
                this.rightBefore = "A";
            if (name.equals("C"))
                this.rightBefore = "B";
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < TIMES; i++) {
                    synchronized (MyTrySequencePrintHomework.class) {
                        while (!before.equals(rightBefore)) {
                            MyTrySequencePrintHomework.class.wait();
                        }
                        System.out.print(name);
                        count++;
                        if (count % 3 == 0) {
                            System.out.println("");
                        }
                        before = name;
                        MyTrySequencePrintHomework.class.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
