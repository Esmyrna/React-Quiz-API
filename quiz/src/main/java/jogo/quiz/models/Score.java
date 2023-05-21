package jogo.quiz.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userId;
    private double points;
    private int rightAnswers;

    @OneToOne
    @JoinColumn(name = "player_id")
    private Player player;
}
