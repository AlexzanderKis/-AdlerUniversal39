package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TypeController implements Runnable {
    @Override
    public void run() {
        String readNameLine = new Scanner(System.in).next();
        String textLine = "All work and no play makes " + readNameLine + " a dull boy.\n"; // строка с текстом и именем которое вводит пользователь
        while (true) { // цикл печати
            try {
                for (int i = 0; i < textLine.length(); i++) { // цикл с рандомной задержкой печати
                    int rndDelay = ThreadLocalRandom.current().nextInt(30, 500 + 1);
                    Thread.sleep(rndDelay);
                    System.out.print(randomMistypingGen(textLine));
                }
            } catch (InterruptedException e) {
                e.fillInStackTrace();
            }
        }
    }

    public String randomMistypingGen(String textLine) {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
//        String pool = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm[];,./{}:'<>?";
//        int index = random.nextInt(stringBuilder.length());
        char[] chars = textLine.toCharArray();
        for (char c : chars) {
            int chance = random.nextInt(100); // Генерирует от 0 до 99
            if (chance >= 98.5) { // % на ошибку
                int errorType = random.nextInt(2); // типы ошибок
                switch (errorType) {
                    case 0 -> stringBuilder.insert(c, c); // TODO: Двойное нажатие (например, 'k' превращается в 'kk')
                    case 1 -> stringBuilder.append(c); // TODO: Пропуск буквы (буква просто не печатается)
                }
            } else {
                stringBuilder.append(c); // Добавляем правильную букву
            }
        }
        return stringBuilder.toString();
    }
}