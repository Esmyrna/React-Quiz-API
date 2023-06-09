package jogo.quiz.Models;
import jakarta.persistence.*;
import jogo.quiz.DTOS.DTOQuestion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "MultipleOptionsQuestion")
@AllArgsConstructor
@NoArgsConstructor
public class MultipleOptionsQuestion{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public UUID id;

  public String text;
  public double points;
  public String rightAnswer;

  @ElementCollection
  @CollectionTable(name = "multiOptionsQuestionAnswers",
          joinColumns = @JoinColumn(name = "question_id"))
  @Column(name = "answer")
  public List<String> answerList;

  public MultipleOptionsQuestion(DTOQuestion question) {
    this.text = question.text();
    this.points = question.points();
    this.rightAnswer = question.rightAnswer();
    this.answerList = question.answerList();
  }
}
