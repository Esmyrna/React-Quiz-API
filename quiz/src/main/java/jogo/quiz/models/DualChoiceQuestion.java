package jogo.quiz.models;

import java.util.List;

public class DualChoiceQuestion extends Question{

    public DualChoiceQuestion(String rightAnswer, String text, double pointer, List list) {
        super(rightAnswer, text, pointer, list);
    }

    public String Answers(){
        return "dual choice questions";
    }

}
