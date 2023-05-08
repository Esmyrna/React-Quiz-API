package jogo.quiz.models;
import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.util.List;

@Entity
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class Question {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  UUID id;
  String text;
  double points;
  protected String rightAnswer;
  protected List<String> answerList;
}
