package jogo.quiz.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jogo.quiz.Repositories.ScoreRepository;
import jogo.quiz.DTOS.DTOScore;
import jogo.quiz.models.Score;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/scores")
public class ScoreController {
    private final ScoreRepository scoreRepository;

    @Autowired
    public ScoreController(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    @PostMapping
    public void addNewScore(@RequestBody DTOScore scoreDto) {
        Score score = new Score(scoreDto.userId(),
                                scoreDto.points(),
                                scoreDto.rightAnswers());
        scoreRepository.save(score);
    }

    @GetMapping
    public List<Score> getAllScores() {
        return scoreRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Score> getScoreById(@PathVariable UUID id) {
        return scoreRepository.findById(id);
    }

    @PutMapping("/{id}")
    public void editScore(@PathVariable UUID id, @RequestBody DTOScore updatedScore) {
        Optional<Score> scoreOptional = scoreRepository.findById(id);

        if (scoreOptional.isPresent()) {
            Score score = scoreOptional.get();

            score.setPoints(updatedScore.points());
            score.setRightAnswers(updatedScore.rightAnswers());

            scoreRepository.save(score);
        }
    }
}
