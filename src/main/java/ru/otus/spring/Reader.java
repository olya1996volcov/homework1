package ru.otus.spring;

import ru.otus.spring.domain.Answer;
import ru.otus.spring.domain.Question;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    private final String fileName;
    private List<Question> questions;


    Reader(String file) {
        fileName = file;
        questions = new ArrayList<>();
    }

    List<Question> read() {
        try {
            File file = new File(fileName);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();

            //System.out.println(splitLine[0]);
            while (line != null) {
                List<Answer> answers = new ArrayList<>();
                String[] splitLine = line.split(",");
                Question question = new Question();
                question.setQuestion(splitLine[0]);
                int count = 0;
                for (int i = 1; i < splitLine.length; i += 2) {
                    count++;
                    Answer answer = new Answer();
                    answer.setId(count);
                    answer.setAnswer(splitLine[i]);
                    if (splitLine[i + 1] == "1") {
                        answer.setRight(true);
                    }
                    answers.add(answer);
                }
                question.setAnswers(answers);
                questions.add(question);
                line = reader.readLine();
            }

//            while (line != null) {
//                System.out.println(line);
//                // считываем остальные строки в цикле
//                line = reader.readLine();
//            }
        } catch (IOException e) {
            System.out.println("Error in Reader");
        }
        return questions;
    }
}
