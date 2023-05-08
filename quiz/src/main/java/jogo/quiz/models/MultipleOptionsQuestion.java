package jogo.quiz.models;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class MultipleOptionsQuestion extends Question {
  @Builder
  public MultipleOptionsQuestion(UUID id,
                                 String text,
                                 double points,
                                 String rightAnswer,
                                 List<String> answerList) {
    super(id, text, points, rightAnswer, answerList);
  }
}
