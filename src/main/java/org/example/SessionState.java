package org.example;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class SessionState {
    String readNameLine = new Scanner(System.in).next();
    AtomicBoolean active;
    AtomicReference<String> textLine = new AtomicReference<>("All work and no play makes " + readNameLine + " a dull boy.\n");
//    Future<>
}
