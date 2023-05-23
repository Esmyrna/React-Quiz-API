package jogo.quiz.Repositories;

import jogo.quiz.models.DualChoiceQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DualChoiceQuestionRepository extends JpaRepository<DualChoiceQuestion, UUID> {
}
