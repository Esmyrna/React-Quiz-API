package jogo.quiz.Repositories;
import jogo.quiz.Models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PlayerRepository extends JpaRepository<Player, UUID> {
    List<Player> findAllByOrderByScorePointsDescScoreRightAnswersDesc();
}
