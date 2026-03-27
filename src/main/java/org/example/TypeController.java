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
                    int rndDelay = ThreadLocalRandom.current().nextInt(30, 200 + 1);
                    Thread.sleep(rndDelay);
                    System.out.print(randomMistypingGen(String.valueOf(textLine.charAt(i))));
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
//        char[] poolChars = pool.toCharArray();
//        for (char p : poolChars) {
//        int index = random.nextInt(poolChars.length);
        char[] chars = textLine.toCharArray();
        for (char c : chars) { // проходим по массиву из букв
            int errorChance = random.nextInt(1,100); // Генерирует от 0 до 99
            if (errorChance >= 50) { // % на ошибку
                int errorType = random.nextInt(4); // типы ошибок
                switch (errorType) {
                    case 0 -> { // Двойное нажатие (например, 'k' превращается в 'kk')
                        if (textLine.equals(" ") || textLine.equals(".") || textLine.equals("\n")) {
                            stringBuilder.append(c);
                        } else { stringBuilder.repeat(c, 2); } }
                    case 1 -> { // Пропуск буквы (буква просто не печатается)
                        if (!stringBuilder.isEmpty() || textLine.equals(".")) { // проверка если stringBuilder не пустой
                            int charPos = random.nextInt(textLine.length()); // берём рандомную букву на всей длине stringBuilder
                            stringBuilder.deleteCharAt(charPos); // удаляем букву на рандомной позиции
                        } else { stringBuilder.append(c); } }
                    case 3 -> { // Переводит рандомную букву в заглавную
                        if (!stringBuilder.isEmpty() && Character.isLetter(c) != textLine.equals(" ") || textLine.equals(".") || textLine.equals("\n")) {
                            int charPos = random.nextInt(textLine.length());
                            stringBuilder.setCharAt(charPos, Character.toUpperCase(c));
                        } stringBuilder.append(c); }
                    }
            } else {
                stringBuilder.append(c); // Добавляем правильную букву
            }
        }
        return stringBuilder.toString();
    }
}