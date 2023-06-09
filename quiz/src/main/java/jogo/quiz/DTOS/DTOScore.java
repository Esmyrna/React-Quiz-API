package jogo.quiz.DTOS;

import jogo.quiz.Models.Player;

import java.util.UUID;

public record DTOScore(double points, int rightAnswers, UUID playerId) {
}
