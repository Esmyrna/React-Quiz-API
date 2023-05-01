package jogo.quiz.models;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Entity
@Data public abstract class Question{
    String text;
    double points;

    protected String rightAnswer;
    protected List<String> answerList;


    public Question(String text, double points, String rightAnswer, List<String> answerList) {
        this.text = text;
        this.points = points;
        this.rightAnswer = rightAnswer;
        this.answerList = answerList;
    }
}
