class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    public void run() {
        // No printing here
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {

        // Create three threads
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        MyThread t3 = new MyThread("Thread 3");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        // Print output in exact required order
        System.out.println(t1.getName() + " Priority: " + t1.getPriority());
        System.out.println(t2.getName() + " Priority: " + t2.getPriority());
        System.out.println(t3.getName() + " Priority: " + t3.getPriority());
    }
}
