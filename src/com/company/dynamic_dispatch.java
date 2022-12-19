package com.company;

import org.w3c.dom.ls.LSOutput;

class phone {
    public void greet(){
        System.out.println("Guten Morgen");
    }
    public void name(){
        System.out.println("iphone");
    }

}
class smartphone extends phone {
    @Override
    public void name(){
        System.out.println("iphone-13");
    }
    public void music(){
        System.out.println("Rolling in the deep");
    }

}

public class dynamic_dispatch {
    public static void main(String[] args) {
        phone obj = new smartphone();
       //cant be written as sub class (name) = new super class
        obj.name();
        obj.greet();
        //obj.music();-err
        smartphone ab = new smartphone();
        ab.music();

    }
}
