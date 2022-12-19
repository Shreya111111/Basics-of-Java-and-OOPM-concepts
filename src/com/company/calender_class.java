package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class calender_class extends Thread{
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        //Adding
        System.out.println(c.getTime());
        c.add(Calendar.YEAR,22);
        System.out.println(c.getTime());
        c.add(Calendar.MONTH,3);
        System.out.println("The time after adding month "+c.getTime());
        }
    }

