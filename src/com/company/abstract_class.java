package com.company;
abstract class phone1 {
    abstract void on();
    abstract void off();
}
class smartphone1 extends phone1{
    void on(){
        System.out.println("turning on");
    }
    void off(){
        System.out.println("Turning off");
    }

//abstract classes are used to achieve high security and it can include both abstract and non abstract methods
    //abstract methods are not instantiated


    public static void main(String[] args) {
        phone1 obj = new smartphone1();
        obj.on();
        obj.off();
    }}