package com.company;
//interface in java cannot contain a constructor and acts as a collection of abstract methods
//it is the way to achieve abstraction in java
//it can contain default methods, constants and static methods
//implements as a keyword//
interface bicycle {
    int a =44;
    void applybrake(int decrement);
    void speedup(int increment);
}
interface hornbicycle {
    int x= 34;
    void blowhorn1();
    void blowhorn2();
}
class cycle implements bicycle,hornbicycle{
    void blowhorn(){
        System.out.println("Blowing horn");
    }
    public void applybrake(int decrement){
        System.out.println("applying brakes");
    }
    public void speedup(int increment){
        System.out.println("speeding up now...");
    }
    public void blowhorn1(){
        System.out.println("Blowing horn first time");
    }
     public void blowhorn2(){
        System.out.println("Blowing horn second time");
    }

}

public class interface_jav {
    public static void main(String[] args) {
        cycle obj = new cycle();
        obj.applybrake(4);
        System.out.println(obj.a);
        System.out.println(obj.x);
        obj.blowhorn1();
        obj.blowhorn();
        obj.blowhorn2();
    }
}
