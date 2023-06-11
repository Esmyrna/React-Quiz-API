package jogo.quiz.Controllers;

import jogo.quiz.Models.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jogo.quiz.Repositories.PlayerRepository;
import jogo.quiz.DTOS.DTOPlayerForCreation;
import jogo.quiz.Models.Player;

import java.util.List;
import java.util.Optional;
import  java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    private final PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @PostMapping
    public Player addNewPlayer(@RequestBody DTOPlayerForCreation playerDto) {
        Player player = new Player(playerDto.name(), playerDto.githubUser(), new Score(0, 0));

        playerRepository.save(player);

        return  player;
    }

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @GetMapping("/leaderboard")
    public List<Player> getPlayersByPointsAndAnswers() {
        return playerRepository.findAllByOrderByScorePointsDescScoreRightAnswersDesc();
    }

    @GetMapping("/{id}")
    public Optional<Player> getPlayerById(@PathVariable UUID id) {
        return playerRepository.findById(id);
    }

    @PutMapping("/{id}")
    public void editPlayer(@PathVariable UUID id, @RequestBody Player updatedPlayer) {
        Optional<Player> playerOptional = playerRepository.findById(id);

        if (playerOptional.isPresent()) {
            Player player = playerOptional.get();

            player.setName(updatedPlayer.getName());
            player.setGithubUser(updatedPlayer.getGithubUser());
            player.setScore(updatedPlayer.getScore());

            playerRepository.save(player);
        }
    }

    @DeleteMapping("/{id}")
    public void deletePlayer (@PathVariable UUID id){
        playerRepository.deleteById(id);
    }
}
