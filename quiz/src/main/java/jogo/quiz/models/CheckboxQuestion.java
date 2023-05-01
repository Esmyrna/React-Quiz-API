package jogo.quiz.models;

import java.util.List;

public class CheckboxQuestion extends Question{
    private List<String> rightAnswer;
    public CheckboxQuestion(String text, double pointer, String rightAnswer, List list) {
        super(text, pointer, list);
    }



}
