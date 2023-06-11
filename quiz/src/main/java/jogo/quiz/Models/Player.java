package jogo.quiz.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "Player")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
  private String name;
  private String githubUser;

  @Embedded
  private Score score;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  public Player(String name, String githubUser, Score score) {
    this.name = name;
    this.githubUser = githubUser;
    this.score = score;
  }
}

