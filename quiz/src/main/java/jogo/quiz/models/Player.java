package jogo.quiz.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data public class Player {

  private  String nome;
  private  String github;
  private Score score;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;

  public Player(String nome, String github, Score score, UUID id) {
    this.nome = nome;
    this.github = github;
    this.score = score;
    this.id = id;
  }
}
