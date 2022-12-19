package com.company;

class my_thread implements Runnable{
    @Override
    public void run() {
        int a = 1;
        while (a < 282) {
            System.out.println("Learning Java");
            a++;
        }
    }
}
class my_thread_01 implements Runnable{
    @Override
    public void run(){
    int b= 1;
    while(b<333){
        System.out.println("Learning Python");
        b++;}
    }
}

public class thread_runnable {
    public static void main(String[] args) {


        my_thread t_1 = new my_thread();
        Thread th1 = new Thread(t_1);
        my_thread_01 t_2 = new my_thread_01();
        Thread th2 = new Thread(t_2);
        th1.start();
        th2.start();
    }
}
