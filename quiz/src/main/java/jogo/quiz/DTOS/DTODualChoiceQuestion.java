package jogo.quiz.DTOS;

import java.util.List;

public record DTODualChoiceQuestion(String text, double points, String rightAnswer, List<String> answerList) {}

