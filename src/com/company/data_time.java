package com.company;

import java.util.Date;

public class data_time {


    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/(24*3600*365*1000));
        Date d =new Date();
        System.out.println("The current date :"+d);
        System.out.println(d.getSeconds());
        System.out.println(d.getHours());
        System.out.println(d.getTime());

    }
}