package com.company;
class thread1 extends Thread{
    public void run(){
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException a){
            a.printStackTrace();
        }
        System.out.println("Finish");
    }
}
class thread2 extends Thread{
    public void run(){
        System.out.println("Second Thread");
    }
}

public class thread_delay {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}
