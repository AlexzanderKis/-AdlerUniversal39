package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Overlook hotel");
        TypeController typeController = new TypeController();
//        new Thread(new TypeController()).start(); // Start the background thread

        Thread typingThread = new Thread(typeController);
        typingThread.setDaemon(true); // Установка режима демона гарантирует завершение работы JVM после окончания основного потока (пользовательского потока).
        typingThread.start(); // Start the background thread

        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                typeController.setReadNameLine(input);
            }
        }
    }
}