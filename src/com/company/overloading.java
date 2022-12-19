package com.company;
//overloading
public class overloading {
    public int mul(int x,int y){
        return (x*y);
    }
    public int mul(int x,int y,int z){
        return (x*y*z);
    }
    public double mul(double x,double y){
        return (x*y);
    }

//driver class
public static void main(String[] args) {
    overloading m =new overloading();
    System.out.println(m.mul(23,23));
    System.out.println(m.mul(23,23,999));
    System.out.println(m.mul(23.988,23.8));
}}