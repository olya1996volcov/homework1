package ru.otus.spring.service;

import ru.otus.spring.domain.Question;

import java.util.List;

public class IOServiceImpl implements IOService {
    private final CsvFileReader reader;

    IOServiceImpl(CsvFileReader reader) {
        this.reader = reader;
    }

    public void printQuestions() {
        List<Question> questionList = reader.readQuestions();
        for (Question q : questionList) {
            System.out.println(q.toString());
        }
    }
}
