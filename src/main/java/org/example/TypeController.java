package org.example;

import java.util.Scanner;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicReference;

public class TypeController implements Runnable {
    @Override
    public void run() {
        String readNameLine = new Scanner(System.in).next();
        while (true) {
            try {
//                AtomicReference<String> textLine = new AtomicReference<>("All work and no play makes " + readNameLine + " a dull boy.\n");
//                char[] chars = textLine.toCharArray();
                String textLine = "    All work and no play makes "+readNameLine+" a dull boy.\n"+
                        "    All work and no play makes "+readNameLine+" a dull boy.\n"+
                        "    All work and no pllay makes "+readNameLine+" a dull boy.\n"+
                        "    All work and no PLay makes "+readNameLine+" a dyll boy.\n"+
                        "    All work and no play mmakes "+readNameLine+" a dull boy.\n"+
                        "v   All work and no play m''kes "+readNameLine+" a dull boy.\n"+
                        "    All work and NO play makes "+readNameLine+" a dullboy.\n"+
                        "    All woRk and noplay makes "+readNameLine+" a dull boy.\n"+
                        "    All woRk and noplay makes "+readNameLine+" a dull boy."+
                        "All work and no play makes "+readNameLine+" a dull boy."+
                        "All work and no pllay makes "+readNameLine+" a dull boy."+
                        "All work and no PLay makes "+readNameLine+" a dyll boy."+
                        "All work and no play mmakes "+readNameLine+" a dull boy."+
                        "All work and no play m''kes "+readNameLine+" a dull boy."+
                        "All work and NO play makes "+readNameLine+" a dullboy."+
                        "All work and no play makes "+readNameLine+" a dull boy."+
                        "All work and no pllay makes "+readNameLine+" a dull boy."+
                        "All work and no PLay makes "+readNameLine+" a dyll boy."+
                        "All work and no play mmakes "+readNameLine+" a dull boy."+
                        "All work and no play m''kes "+readNameLine+" a dull boy."+
                        "All work and NO play makes "+readNameLine+" a dullboy."+
                        "All work and no play makes "+readNameLine+" a dull boy."+
                        "All work and no pllay makes "+readNameLine+" a dull boy."+
                        "All work and no PLay makes "+readNameLine+" a dyll boy."+
                        "All work and no play mmakes "+readNameLine+" a dull boy."+
                        "All work and no play m''kes "+readNameLine+" a dull boy."+
                        "All work and NO play makes "+readNameLine+" a dullboy."+
                        "All work and no play makes "+readNameLine+" a dull boy."+
                        "All work and no pllay makes "+readNameLine+" a dull boy."+
                        "All work and no PLay makes "+readNameLine+" a dyll boy."+
                        "All work and no play mmakes "+readNameLine+" a dull boy."+
                        "All work and no play m''kes "+readNameLine+" a dull boy."+
                        "All work and NO play makes "+readNameLine+" a dullboy."+
                        "All work and no play makes "+readNameLine+" a dull boy."+
                        "All work and no pllay makes "+readNameLine+" a dull boy."+
                        "All work and no PLay makes "+readNameLine+" a dyll boy."+
                        "All work and no play mmakes "+readNameLine+" a dull boy."+
                        "All work and no play m''kes "+readNameLine+" a dull boy."+
                        "All work and NO play makes "+readNameLine+" a dullboy."+
                        "All work and no play makes "+readNameLine+" a dull boy."+
                        "All work and no pllay makes "+readNameLine+" a dull boy."+
                        "All work and no PLay makes "+readNameLine+" a dyll boy."+
                        "All work and no play mmakes "+readNameLine+" a dull boy."+
                        "All work and no play m''kes "+readNameLine+" a dull boy."+
                        "All work and NO play makes "+readNameLine+" a dullboy."+
                        "All work and no play makes "+readNameLine+" a dull boy."+
                        "All work and no pllay makes "+readNameLine+" a dull boy."+
                        "All work and no PLay makes "+readNameLine+" a dyll boy."+
                        "All work and no play mmakes "+readNameLine+" a dull boy."+
                        "All work and no play m''kes "+readNameLine+" a dull boy."+
                        "All work and NO play makes "+readNameLine+" a dullboy."+
                        "All work and no play makes "+readNameLine+" a dull boy."+
                        "All work and no pllay makes "+readNameLine+" a dull boy."+
                        "All work and no PLay makes "+readNameLine+" a dyll boy."+
                        "All work and no play mmakes "+readNameLine+" a dull boy."+
                        "All work and no play m''kes "+readNameLine+" a dull boy."+
                        "All work and NO play makes "+readNameLine+" a dullboy."+
                        "All work and no play makes "+readNameLine+" a dull boy."+
                        "All work and no pllay makes "+readNameLine+" a dull boy."+
                        "All work and no PLay makes "+readNameLine+" a dyll boy."+
                        "All work and no play mmakes "+readNameLine+" a dull boy."+
                        "All work and no play m''kes "+readNameLine+" a dull boy."+
                        "All work and NO play makes "+readNameLine+" a dullboy."+
                        "All work and no play makes "+readNameLine+" a dull boy."+
                        "All work and no pllay makes "+readNameLine+" a dull boy."+
                        "All work and no PLay makes "+readNameLine+" a dyll boy."+
                        "All work and no play mmakes "+readNameLine+" a dull boy."+
                        "All work and no play m''kes "+readNameLine+" a dull boy."+
                        "All work and NO play makes "+readNameLine+" a dullboy."+
                        "All work and no play makes "+readNameLine+" a dull boy."+
                        "All work and no pllay makes "+readNameLine+" a dull boy."+
                        "All work and no PLay makes "+readNameLine+" a dyll boy."+
                        "All work and no play mmakes "+readNameLine+" a dull boy."+
                        "All work and no play m''kes "+readNameLine+" a dull boy."+
                        "All work and NO play makes "+readNameLine+" a dullboy."+
                        "All work and no play makes "+readNameLine+" a dull boy."+
                        "All work and no pllay makes "+readNameLine+" a dull boy."+
                        "All work and no PLay makes "+readNameLine+" a dyll boy."+
                        "All work and no play mmakes "+readNameLine+" a dull boy."+
                        "All work and no play m''kes "+readNameLine+" a dull boy."+
                        "All work and NO play makes "+readNameLine+" a dullboy."+
                        "All work and no play makes "+readNameLine+" a dull boy."+
                        "All work and no pllay makes "+readNameLine+" a dull boy."+
                        "All work and no PLay makes "+readNameLine+" a dyll boy."+
                        "All work and no play mmakes "+readNameLine+" a dull boy."+
                        "All work and no play m''kes "+readNameLine+" a dull boy."+
                        "All work and NO play makes "+readNameLine+" a dullboy."+
                        "All work and no play makes "+readNameLine+" a dull boy."+
                        "All work and no pllay makes "+readNameLine+" a dull boy."+
                        "All work and no PLay makes "+readNameLine+" a dyll boy."+
                        "All work and no play mmakes "+readNameLine+" a dull boy."+
                        "All work and no play m''kes "+readNameLine+" a dull boy."+
                        "All work and NO play makes "+readNameLine+" a dullboy."+
                        "All work and no play makes "+readNameLine+" a dull boy."+
                        "All work and no pllay makes "+readNameLine+" a dull boy."+
                        "All work and no PLay makes "+readNameLine+" a dyll boy."+
                        "All work and no play mmakes "+readNameLine+" a dull boy."+
                        "All work and no play m''kes "+readNameLine+" a dull boy."+
                        "All work and NO play makes "+readNameLine+" a dullboy."+
                        "All work and no play makes "+readNameLine+" a dull boy."+
                        "All work and no pllay makes "+readNameLine+" a dull boy."+
                        "All work and no PLay makes "+readNameLine+" a dyll boy."+
                        "All work and no play mmakes "+readNameLine+" a dull boy."+
                        "All work and no play m''kes "+readNameLine+" a dull boy."+
                        "All work and NO play makes "+readNameLine+" a dullboy."+
                        "All work and no play makes "+readNameLine+" a dull boy."+
                        "All work and no pllay makes "+readNameLine+" a dull boy."+
                        "All work and no PLay makes "+readNameLine+" a dyll boy."+
                        "All work and no play mmakes "+readNameLine+" a dull boy."+
                        "All work and no play m''kes "+readNameLine+" a dull boy."+
                        "All work and NO play makes "+readNameLine+" a dullboy."+
                        "All work and no play makes "+readNameLine+" a dull boy."+
                        "All work and no pllay makes "+readNameLine+" a dull boy."+
                        "All work and no PLay makes "+readNameLine+" a dyll boy."+
                        "All work and no play mmakes "+readNameLine+" a dull boy."+
                        "All work and no play m''kes "+readNameLine+" a dull boy."+
                        "All work and NO play makes "+readNameLine+" a dullboy."+
                        "All woRk and noplay makes "+readNameLine+" a dull boy.";
//                for (char c : chars) {
                for (int i = 0; i < textLine.length(); i++){
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