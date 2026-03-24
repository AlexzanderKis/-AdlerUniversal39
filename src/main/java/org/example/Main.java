package org.example;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Overlook hotel");
        String readNameLine = new Scanner(System.in).next();
        while (true) {
            try {
                String textLine = "All work and no play makes " + readNameLine + " a dull boy.\n";
                for (int i = 0; i < textLine.length(); i++) {
                    int rndDelay = ThreadLocalRandom.current().nextInt(0, 1000 + 1);
                    Thread.sleep(rndDelay);
                    System.out.print(textLine.charAt(i));
                }
            } catch (InterruptedException e) {
                e.fillInStackTrace();
            }
        }
    }
}