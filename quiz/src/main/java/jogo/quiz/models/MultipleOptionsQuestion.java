package jogo.quiz.models;

import java.util.List;

public class MultipleOptionsQuestion extends Question {

    public MultipleOptionsQuestion(String text, double points, String rightAnswer, List<String> answerList) {
        super(text, points, rightAnswer, answerList);
    }
}
