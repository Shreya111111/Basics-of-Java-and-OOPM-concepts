package com.company;
class myth extends Thread{
    public myth(String name){
        super(name);
    }
    public  void run(){
        int c = 23;
        while (c<25){
            System.out.println("The id of of Thread 1" + this.getId());
            c++;
        }
    }
}
//commonly used constructors
//1.thread
//2. thread(string)
//3. thread(runnable r, string name)
//4. thread(runnable r)

public class thread_constructor {
    public static void main(String[] args) {
        myth t1 = new myth("Carolina");
        myth t2 = new myth("Adelaide");
        t1.start();
        t2.start();
        int a =1 ;
        while(a<3){
        System.out.println(t2.getId());
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t2.getId());
        a++;
        }

    }
}
