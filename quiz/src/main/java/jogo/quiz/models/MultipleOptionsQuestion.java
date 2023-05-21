package jogo.quiz.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "MultipleOptionsQuestion")
public class MultipleOptionsQuestion extends Question {
  @Builder
  public MultipleOptionsQuestion(UUID id,
                                 String text,
                                 double points,
                                 String rightAnswer,
                                 List<String> answerList) {
    super(id, text, points, rightAnswer, answerList);
  }

  public MultipleOptionsQuestion() {

  }
}
