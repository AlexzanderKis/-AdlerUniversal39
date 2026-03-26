package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Overlook hotel");
//        TypeController typeController = new TypeController();
        new Thread(new TypeController()).start();
    }
}