package ru.otus.spring;

import ru.otus.spring.domain.Question;

import java.util.ArrayList;
import java.util.List;

public class DoEvrything {
    Reader reader = new Reader("src/main/resources/file1.csv");
    void print(){
        List<Question> questionList = new ArrayList<>();
        questionList = reader.read();
        for (Question q : questionList) {
            System.out.println(q.toString());
        }
    }
}
