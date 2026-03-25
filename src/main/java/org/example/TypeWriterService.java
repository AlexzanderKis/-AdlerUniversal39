package org.example;

import java.util.concurrent.ConcurrentHashMap;

public class TypeWriterService {
    ConcurrentHashMap<String, SessionState> stringConcurrentHashMap = new ConcurrentHashMap<>();
}
