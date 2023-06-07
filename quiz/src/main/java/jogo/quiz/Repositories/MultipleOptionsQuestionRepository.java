package jogo.quiz.Repositories;

import jogo.quiz.Models.MultipleOptionsQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MultipleOptionsQuestionRepository extends JpaRepository<MultipleOptionsQuestion, UUID> {
}
