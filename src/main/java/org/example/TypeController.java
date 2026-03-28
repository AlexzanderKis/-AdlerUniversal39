package org.example;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class TypeController implements Runnable {
    //    public volatile String readNameLine = "Jack";
    String readNameLine = new Scanner(System.in).next();

    @Override
    public void run() {
//        String readNameLine = new Scanner(System.in).next();
        String textLine = "All work and no play makes " + readNameLine + " a dull boy.\n"; // строка с текстом и именем которое вводит пользователь
        while (true) { // цикл печати
            try {
                for (int i = 0; i < textLine.length(); i++) { // цикл с рандомной задержкой печати
                    int rndDelay = ThreadLocalRandom.current().nextInt(30, 200 + 1);
                    Thread.sleep(rndDelay);
                    System.out.print(randomMistypingGen(String.valueOf(textLine.charAt(i))));
                }
            } catch (InterruptedException e) { e.fillInStackTrace(); }
        }
    }

    public String randomMistypingGen(String textLine) {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        Map<Character, String> qwertyMap = getCharacterStringMap();
        char[] chars = textLine.toCharArray();
        for (char c : chars) { // проходим по массиву из букв
            double errorChance = random.nextInt(1, 100); // Генерирует от 0 до 99
            if (errorChance >= 98) { // % на ошибку
                int errorType = random.nextInt(4); // типы ошибок

                switch (errorType) {
                    case 0 -> { // Двойное нажатие (например, 'k' превращается в 'kk')
                        if (Character.isLetter(c)) {
                            stringBuilder.repeat(c, 2); // before Java 21 -> stringBuilder.append(c).append(c);
                        } else {
                            stringBuilder.append(c);
                        }
                    }

                    case 1 -> { // Пропуск буквы (буква просто не печатается)
                        if (!stringBuilder.isEmpty() && Character.isLetter(c) || Character.isSpaceChar(c) && !Character.isTitleCase(c)) // проверка если stringBuilder не пустой
                        { /* empty body */ } else {
                            stringBuilder.append(c);
                        }
                    }

                    case 2 -> { // Переводит рандомную букву в заглавную
                        if (Character.isLetter(c)) {
                            stringBuilder.append(Character.toUpperCase(c));
                        } else {
                            stringBuilder.append(c);
                        }
                    }

                    case 3 -> {
                        if (Character.isLetter(c) && qwertyMap.containsKey(c)) {
                            int rndMapValCharPos = random.nextInt(qwertyMap.get(c).length()); // values = qwertyMap.get(c);
                            stringBuilder.append(qwertyMap.get(c).charAt(rndMapValCharPos));
                        } else {
                            stringBuilder.append(c);
                        }
                    }
                }
            } else {
                stringBuilder.append(c);
            } // Добавляем правильную букву

/** // % на другие ошибки

 if (errorChance >= 99) { // % на ошибку
 int errorType = random.nextInt(4); // типы ошибок
 switch (errorType) {
 case 0 -> { // Двойное нажатие (например, 'k' превращается в 'kk')
 if (Character.isLetter(c)) {
 stringBuilder.repeat(c, 2); // before Java 21 -> stringBuilder.append(c).append(c);
 } else { stringBuilder.append(c); } }
 }
 }
 */

        }
        return stringBuilder.toString();
    }

    private static Map<Character, String> getCharacterStringMap() {
        Map<Character, String> qwertyMap = new HashMap<>();
        qwertyMap.put('a', "sw");
        qwertyMap.put('b', "vn ");
        qwertyMap.put('c', "xvf");
        qwertyMap.put('d', "fse");
        qwertyMap.put('e', "rtw");
        qwertyMap.put('o', "ip[");
        qwertyMap.put('k', "jl;");
        qwertyMap.put('n', "bm,");
        qwertyMap.put('p', "o[r");
        qwertyMap.put('s', "adf");
        qwertyMap.put('u', "yij");
        qwertyMap.put('w', "qd");
        qwertyMap.put('A', "SD");
        qwertyMap.put('B', "VN ");
        qwertyMap.put('C', "XVF");
        qwertyMap.put('D', "FSE");
        qwertyMap.put('E', "RTW");
        qwertyMap.put('O', "IP{");
        qwertyMap.put('K', "JL:");
        qwertyMap.put('N', "BM<");
        qwertyMap.put('P', "OR_");
        qwertyMap.put('S', "ADF");
        qwertyMap.put('U', "YIJ");
        return qwertyMap;
    }
}