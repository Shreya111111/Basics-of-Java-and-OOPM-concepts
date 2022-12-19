package com.company;

public class string_methods {
    public static void main(String[] args) {
        String name = "Hello";
        int value = name.length();
        System.out.println(value);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String nonTrimmedString = "   hello   ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());
        System.out.println(name.substring(3));
        //starts from the index 3
        System.out.println(name.substring(1,3));
        System.out.println(name.replace('e','t'));
        System.out.println(name.startsWith("H"));
        System.out.println(name.endsWith("hhh"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("e"));
        String modifiedName = "helllllooo";
        System.out.println(modifiedName.indexOf("el"));
        System.out.println(modifiedName.indexOf("ll",1));
        System.out.println(modifiedName.lastIndexOf('o'));
        System.out.println(name.equals("Heelo"));
        System.out.println(name.equalsIgnoreCase("HELL"));



    }
}
