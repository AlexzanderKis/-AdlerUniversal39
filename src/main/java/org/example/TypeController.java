package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TypeController implements Runnable {
    @Override
    public void run() {
        String readNameLine = new Scanner(System.in).next();
        while (true) { // цикл печати
            try {
//                AtomicReference<String> textLine = new AtomicReference<>("All work and no play makes " + readNameLine + " a dull boy.\n");
//                char[] chars = textLine.toCharArray();
                String textLine = "All work and no play makes "+readNameLine+" a dull boy.\n"; // строка с текстом и именем которое вводит пользователь
//                StringBuilder stringBuilder = new StringBuilder(textLine);
//                Random random = new Random();
//                String pool = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm[];,./{}:'<>?";
//                for (int j = 0; j < 4; j++){
//                    int index = random.nextInt(stringBuilder.length());
//                    char rndChar = pool.charAt(random.nextInt(pool.charAt(index)));
//                    stringBuilder.setCharAt(index, rndChar);
//                }

//                char[] chars = textLine.toCharArray();
//                for (char c : chars) {
//                    int rndDelay = ThreadLocalRandom.current().nextInt(30, 500 + 1);
//                    Thread.sleep(rndDelay);
//                    System.out.print(textLine.charAt(c));
//                }

                for (int i = 0; i < textLine.length(); i++){ // цикл с рандомной задержкой печати
                    int rndDelay = ThreadLocalRandom.current().nextInt(30, 500 + 1);
                    Thread.sleep(rndDelay);
                    System.out.print(textLine.charAt(i));
                }
            } catch (InterruptedException e) {
                e.fillInStackTrace();
            }
        }
    }
}