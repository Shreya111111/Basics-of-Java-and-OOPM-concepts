package com.company;
class mythrd extends Thread{
    public void run(){

        while (true){
            System.out.println("Thread");
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException a){
                a.printStackTrace();
            }
        }
    }
}
class mythrd1 extends Thread{
    public void run(){
        System.out.println("Thread 2");
    }
}
public class thread_interrupt {
    public static void main(String[] args) {
        mythrd t1 = new mythrd();
        mythrd1 t2 = new mythrd1();
        t1.start();
        t2.start();

    }
}
