package com.company;

class Base1{
    Base1() {
        System.out.println("Constructor"); //constructor
    }
    Base1(int x){
        System.out.println("Overloaded constructor with value a"+x);
    }
        public int x;



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class derived_1 extends Base1 {
    derived_1() {
        super(23);
        System.out.println("Derived class constructor");
    }

    public int y;

    derived_1(int a, int b) {
        System.out.println("overloaded constructor " + a + " " + b);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
    class chDerived extends derived_1 {
        chDerived() {
            super(43, 433);

            System.out.println("I am the child of derived constructor");
        }

        chDerived(int x, int y, int z) {
            System.out.println(x + " " + y + " " + z);
        }

    }
public class constructor_inheritance {
    public static void main(String[] args) {
        Base1 b = new Base1();
        System.out.println("Derived class constructor");
        derived_1 d = new derived_1(387,443);
        chDerived ss = new chDerived();
    }
}
