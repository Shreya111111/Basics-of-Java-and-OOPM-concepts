package com.company;
//set priority = range (0,10)
//max priority = 10
//min priority =1
//norm priority = 5
class mythread extends Thread{
    public mythread(String name){
        super(name);}
        public void run(){
        while(true){
            System.out.println(this.getName());
        }
    }
}

public class thread_priorities {
    public static void main(String[] args) {
        mythread t1 = new mythread("Java");
        mythread t2 = new mythread("c");
        mythread t3 = new mythread("c++");
        mythread t4 = new mythread("python");
        mythread t5 = new mythread("sql");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
