package jogo.quiz.DTOS;

import java.util.List;

public record DTOMultipleOptionsQuestion(String text, double points, String rightAnswer, List<String> answerList) {
}
