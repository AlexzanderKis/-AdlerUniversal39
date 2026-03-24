package org.example;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello and welcome to Overlook hotel!");
        String readScan = new Scanner(System.in).next();
        while (true) {
            int rndInt = ThreadLocalRandom.current().nextInt(200, 2000 + 1);
            System.out.println("All work and no play makes " + readScan + " a dull boy. " + rndInt+"ms "+rndInt+1252+" rndNum "+rndInt+150032+" rnd seed");
            try {
                Thread.sleep(rndInt);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}