package jogo.quiz.DTOS;

import jogo.quiz.models.Score;

public record DTOPlayer(String nome, String githubUser, Score score) {
}
