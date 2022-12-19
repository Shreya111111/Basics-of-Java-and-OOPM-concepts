package com.company;
class parent{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("Set the value of x");
        this.x = x;
    }
}
//inheritance

class child extends parent{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        //creating the object of parent
        parent p=new parent();
        p.setX(3287);
        System.out.println(p.getX());

        //creating the object of child
        child c =new child();
        c.setX(329);
        System.out.println(c.getX());

        //setting the value of y
        child t =new child();
        t.setY(3299);
        System.out.println("Set the value of y");
        System.out.println(t.getY());



    }
}
