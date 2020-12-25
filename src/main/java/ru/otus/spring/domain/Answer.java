package ru.otus.spring.domain;

public class Answer {
    private String answer;
    private int id;
    private boolean isRight;

    public Answer() {
        isRight = false;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }ngvykfckghc

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    @Override
    public String toString() {
        return id + ")" + answer + "\t\t";
    }
}
