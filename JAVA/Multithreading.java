import java.lang.*;

public class Multithreading extends Thread {
    public void run() {
        System.out.println("Inside the run() method");
    }

    public static void main(String[] args) throws Exception {
        Multithreading th1 = new Multithreading();
        Multithreading th2 = new Multithreading();
        Multithreading th3 = new Multithreading();
        System.out.println("Priority of the thread th1 is : " + th1.getPriority());
        System.out.println("Priority of the thread th2 is : " + th2.getPriority());
        System.out.println("Priority of the thread th3 is : " + th3.getPriority());
        th1.setPriority(MIN_PRIORITY);
        th2.setPriority(MAX_PRIORITY);
        System.out.println("Priority of the thread th1 is : " + th1.getPriority());
        System.out.println("Priority of the thread th2 is : " + th2.getPriority());
        System.out.println("Priority of the thread th3 is : " + th3.getPriority());
        th1.start();  
        th2.start();
        th3.start();
        th1.yield();
        th3.suspend();
        th2.join();
        th3.resume();
    }
}