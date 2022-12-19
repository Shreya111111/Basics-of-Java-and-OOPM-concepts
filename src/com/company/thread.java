package com.company;
//creating a thread by extending a thread class
class mythread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<3000922){
            System.out.println("I am chatting with my thread ");
            System.out.println("I am cooking with my thread ");
            i++;
        }
    }
}
class mythread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<723723){
            System.out.println("I am texting ");
            System.out.println("I am texting --Thread 2");
            i++;
        }
    }
}
public class thread {
    public static void main(String[] args) {
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();
        t1.start();
        t2.start();
    }
}
