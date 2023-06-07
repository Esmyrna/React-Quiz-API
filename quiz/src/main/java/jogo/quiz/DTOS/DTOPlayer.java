package jogo.quiz.DTOS;

import jogo.quiz.Models.Score;

public record DTOPlayer(String nome, String githubUser, Score score) {
}
