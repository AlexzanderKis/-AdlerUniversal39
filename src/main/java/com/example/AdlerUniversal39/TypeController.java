package com.example.AdlerUniversal39;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class TypeController {

    // получить доступ к TypewriterService, мы передаем его через конструктор контроллера
    private final TypewriterService typewriterService;

    // Конструктор для внедрения зависимости
    // Если конструктор один, аннотация @Autowired необязательна
    public TypeController(TypewriterService typewriterService) {
        this.typewriterService = typewriterService;
    }

    @PostMapping(value = "/api/name") // принимает новое имя
    public String getString(@RequestParam String readNameLine) {
        typewriterService.setReadNameLine(readNameLine);
        return "Name updated";
    }

    @GetMapping(value = "/api/stream") // выдаёт печать
    public SseEmitter streamText() {
        SseEmitter sseEmitter = new SseEmitter(-1L); // эмиттер без таймаута (-1L), чтобы соединение не закрывалось автоматически
        new Thread(() -> {
            while (true) { // цикл печати
                String textLine = "All work and no play makes " + typewriterService.getReadNameLine() + " a dull boy.\n"; // строка с текстом и именем которое вводит пользователь
                try {
                    for (int i = 0; i < textLine.length(); i++) { // цикл с рандомной задержкой печати
                        int rndDelay = ThreadLocalRandom.current().nextInt(30, 200 + 1);
                        Thread.sleep(rndDelay);
                        sseEmitter.send(typewriterService.randomMistypingGen(String.valueOf(textLine.charAt(i)))); // вместо sout
                    }
                } catch (Exception e) {
                    sseEmitter.completeWithError(e);
                    break;
                }
            }
        }).start();
        return sseEmitter;
    }
}