package com.company;
class Circle{
    public int radius ;
    Circle(){
        System.out.println("Not a parameterised circle");

    }
    Circle(int r){
        System.out.println("I am a parametrised constructor ");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder1 extends Circle{
    public int height;
    cylinder1(int r, int h){
        super(r);
        this.height=h;
        System.out.println("I am parameterised constructor of cylinder ");
    }
  public double volume(){
     return Math.PI*this.radius*this.radius*this.height;
  }
}
public class applyingInheritance {
    public static void main(String[] args) {
        cylinder1 obj = new cylinder1(23,12);
        obj.volume();
        Circle ob = new Circle(34);
        ob.area();

    }
}
