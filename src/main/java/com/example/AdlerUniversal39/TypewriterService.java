package com.example.AdlerUniversal39;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class TypewriterService {
    String readNameLine = "Jack"; // дефолтное имя

    public void setReadNameLine(String readNameLine) {
        this.readNameLine = readNameLine;
    }

    public String randomMistypingGen(String textLine) { // Метод ошибок в тексте
        StringBuilder stringBuilder = new StringBuilder();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        char[] chars = textLine.toCharArray();
        for (char c : chars) { // проходим по массиву из букв
            double errorChance = random.nextDouble(1, 100); // Генерирует от 1 до 100
            if (errorChance >= 98.5) { // % на ошибку
                int errorType = random.nextInt(7); // типы ошибок

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

                    case 3 -> { // Опечатка на соседнюю букву
                        if (Character.isLetter(c) && qwertyMap.containsKey(c)) {
                            int rndMapValCharPos = random.nextInt(qwertyMap.get(c).length()); // values = qwertyMap.get(c);
                            stringBuilder.append(qwertyMap.get(c).charAt(rndMapValCharPos));
                        } else {
                            stringBuilder.append(c); // TODO: дополнить qwertyMap всеми буквами и убрать это
                        }
                    }
                }
            } else {
                stringBuilder.append(c); // Добавляем правильную букву
            }
        }
        return stringBuilder.toString();
    }

    private static final HashMap<Character, String> qwertyMap = getCharacterStringMap(); // чтобы мапа создавалась только один раз

    private static HashMap<Character, String> getCharacterStringMap() {
        HashMap<Character, String> qwertyMap = new HashMap<>();
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