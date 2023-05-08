package jogo.quiz.models;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class CheckboxQuestion extends Question{
    @Builder
    public CheckboxQuestion(UUID id,
                            String text,
                            double points,
                            String rightAnswer,
                            List<String> answerList) {
        super(id, text, points, rightAnswer, answerList);
    }
}
