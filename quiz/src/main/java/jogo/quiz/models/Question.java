package jogo.quiz.models;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.util.List;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
public abstract class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  UUID id;

  String text;
  double points;
  protected String rightAnswer;

  @ElementCollection
  @CollectionTable(name = "question_answers",
          joinColumns = @JoinColumn(name = "question_id"))
  @Column(name = "answer")
  protected List<String> answerList;

  public Question(UUID id, String text, double points, String rightAnswer, List<String> answerList) {
  }
}
