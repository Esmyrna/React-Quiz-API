package jogo.quiz.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "DualChoiceQuestion")
public class DualChoiceQuestion extends Question {
  @Builder
  public DualChoiceQuestion(UUID id,
                            String text,
                            double points,
                            String rightAnswer,
                            List<String> answerList) {
    super(id, text, points, rightAnswer, answerList);
  }

  public DualChoiceQuestion() {

  }
}
