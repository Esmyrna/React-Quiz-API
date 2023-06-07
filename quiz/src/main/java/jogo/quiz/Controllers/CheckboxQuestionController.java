package jogo.quiz.Controllers;

import jogo.quiz.DTOS.DTOQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jogo.quiz.Repositories.CheckboxQuestionRepository;
import jogo.quiz.Models.CheckboxQuestion;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/checkbox-questions")
public class CheckboxQuestionController {
    private final CheckboxQuestionRepository questionRepository;

    @Autowired
    public CheckboxQuestionController(CheckboxQuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @GetMapping
    public List<CheckboxQuestion> getAllQuestions() {
        return questionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CheckboxQuestion> getQuestionById(@PathVariable UUID id) {
        return questionRepository.findById(id);
    }

    @PostMapping
    public CheckboxQuestion createQuestion(@RequestBody DTOQuestion questionDto) {
        CheckboxQuestion question = new CheckboxQuestion(questionDto);

        return questionRepository.save(question);
    }

    @PutMapping("/{id}")
    public void updateQuestion(@PathVariable UUID id, @RequestBody DTOQuestion updatedQuestionDto) {
        Optional<CheckboxQuestion> questionOptional = questionRepository.findById(id);

        if (questionOptional.isPresent()) {
            CheckboxQuestion question = questionOptional.get();

            question.setText(updatedQuestionDto.text());
            question.setPoints(updatedQuestionDto.points());
            question.setRightAnswer(updatedQuestionDto.rightAnswer());
            question.setAnswerList(updatedQuestionDto.answerList());

            questionRepository.save(question);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable UUID id) {
        questionRepository.deleteById(id);
    }
}
