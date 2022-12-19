package com.company;

class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2*3.14*radius*radius + 2*3.14*radius*height;
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }


}
//using constructors
public class construc {
    public static void main(String[] args) {
        cylinder ss =new cylinder(33,7);
        //s.setHeight(34);
        System.out.println(ss.getHeight());
        //ss.setRadius(2377);
        System.out.println(ss.getRadius());
        System.out.println(ss.surfaceArea());
        System.out.println(ss.volume());

    }
}
