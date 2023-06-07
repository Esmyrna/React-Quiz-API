package jogo.quiz.Repositories;

import jogo.quiz.Models.CheckboxQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CheckboxQuestionRepository extends JpaRepository<CheckboxQuestion, UUID> {
}
