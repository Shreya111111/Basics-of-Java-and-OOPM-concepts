package com.company;

class A{
    //public int a;
    public int harry(){
    return 4;}

public void meth3(){
    System.out.println("I am meth3 of class A");
}
}
class B extends A{
    //overriding
    @Override
    public void meth3(){
        System.out.println("I am meth3 of class B");
    }
    public void meth4(){
        System.out.println("I am meth4 of class B");
    }
}
public class overidding {
    public static void main(String[] args) {
        A classes = new A();
        classes.meth3();
        B classe = new B();
        classe.meth3();
    }
}
