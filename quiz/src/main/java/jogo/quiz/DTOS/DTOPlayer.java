package jogo.quiz.DTOS;

import jogo.quiz.Models.Score;

public record DTOPlayer(String name, String githubUser, Score score) {
}
