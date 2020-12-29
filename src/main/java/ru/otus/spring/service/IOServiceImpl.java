package ru.otus.spring.service;

import ru.otus.spring.domain.Question;

import java.util.List;

public class IOServiceImpl implements IOService {
    private final CsvFileReader reader;

    IOServiceImpl(CsvFileReader reader) {
        this.reader = reader;
    }

    public void print() {
        List<Question> questionList = reader.read();
        for (Question q : questionList) {
            System.out.println(q.toString());
        }
    }
}
