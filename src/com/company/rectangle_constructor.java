package com.company;
 class rectangle{
     private int length;
     private int breadth;

     public rectangle() {
         this.length = 3;
         this.breadth = 8;
     }

     public rectangle(int length, int breadth) {
         this.length = length;
         this.breadth = breadth;
     }

     public int getLength() {
         return length;
     }

     public int getBreadth() {
         return breadth;
     }
 }
 //overloading a constructor
public class rectangle_constructor {
    public static void main(String[] args) {
        rectangle r = new rectangle(56,66);
        //using getters
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());

    }
}
