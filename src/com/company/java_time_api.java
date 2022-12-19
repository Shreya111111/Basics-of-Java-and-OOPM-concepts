package com.company;
import java.time.*;


public class java_time_api extends Thread{
    public static void main(String[] args) {
        Clock cl = Clock.systemDefaultZone();
        System.out.println(cl.getZone());
        Clock c= Clock.systemUTC();
        System.out.println(c.instant());
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalDate D = LocalDate.parse("2021-05-23");
        System.out.println(D.withYear(2001));
        System.out.println(d.equals(D));

    }
}
