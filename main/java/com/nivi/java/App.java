package com.nivi.java;

public class App {

    public static String message = "Hello Nivethitha!";
    
    public App() {}
    public static void main(String[] args) {
        String a = displayMessage();
        System.out.println(a);
    }

    public static String displayMessage()
    {
        return message;
    }
}
