package jogo.quiz.models;

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
  private String nome;
  private String githubUser;

  @OneToOne(mappedBy = "player", cascade = CascadeType.ALL)
  private Score score;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  public Player(String nome, String githubUser) {
    this.nome = nome;
    this.githubUser = githubUser;
  }
}
