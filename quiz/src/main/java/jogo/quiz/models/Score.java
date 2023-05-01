package jogo.quiz.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity

@Data public class Score {
    public double points;
    private int rightAnswers;

    public Score(double points, int rightAnswers) {
        this.points = points;
        this.rightAnswers = rightAnswers;
    }


}
