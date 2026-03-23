package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner readScan = new Scanner(System.in);
        System.out.println("Hello and welcome to Overlook hotel!");

        while (!readScan.hasNext("q")) {
            for (int i = 0; i <= 1; i++) {
                System.out.println("All work and no play makes Jack a dull boy.");
            }
        }
        System.out.println("DAAAAANNYYY");
    }
}