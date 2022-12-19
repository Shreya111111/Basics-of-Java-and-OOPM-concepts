package com.company;
import java.lang.Thread;
import java.io.*;

public class Thread_sleep {
    public static void main(String[] args) {
        try {
            for (int i =1 ; i<= 10; i++){
            Thread.sleep(1000);
                System.out.println(2*i);
        }}
            catch(Exception e){
                System.out.println(e);
            }
    }
}
