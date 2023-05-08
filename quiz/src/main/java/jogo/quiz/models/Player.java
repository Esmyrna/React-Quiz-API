package jogo.quiz.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
  private String nome;
  private String githubUser;
  private Score score;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;
}
