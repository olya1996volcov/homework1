package ru.otus.spring;

import ru.otus.spring.domain.Question;

import java.util.List;

public class WriteAll {
    WriteAll(List<Question> allQuestions){
        for (Question q : allQuestions) {
            System.out.println(q.toString());
        }
    }

}
