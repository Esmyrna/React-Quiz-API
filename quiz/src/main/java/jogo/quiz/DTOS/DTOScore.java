package jogo.quiz.DTOS;

import java.util.UUID;

public record DTOScore(UUID userId, double points, int rightAnswers) {
}
