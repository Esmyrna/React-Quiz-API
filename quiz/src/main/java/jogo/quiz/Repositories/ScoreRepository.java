package jogo.quiz.Repositories;

import jogo.quiz.models.Score;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ScoreRepository extends JpaRepository<Score, UUID> {
}
