package jogo.quiz.Controllers;

import jogo.quiz.DTOS.DTOQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jogo.quiz.Repositories.DualChoiceQuestionRepository;
import jogo.quiz.Models.DualChoiceQuestion;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/dual-choice-questions")
public class DualChoiceQuestionController {
    private final DualChoiceQuestionRepository questionRepository;

    @Autowired
    public DualChoiceQuestionController(DualChoiceQuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @GetMapping
    public List<DualChoiceQuestion> getAllQuestions() {
        return questionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DualChoiceQuestion> getQuestionById(@PathVariable UUID id) {
        return questionRepository.findById(id);
    }

    @PostMapping
    public DualChoiceQuestion createQuestion(@RequestBody DTOQuestion questionDto) {
        DualChoiceQuestion question = new DualChoiceQuestion(questionDto);

        return questionRepository.save(question);
    }

    @PutMapping("/{id}")
    public void updateQuestion(@PathVariable UUID id, @RequestBody DTOQuestion updatedQuestionDto) {
        Optional<DualChoiceQuestion> questionOptional = questionRepository.findById(id);
        if (questionOptional.isPresent()) {
            DualChoiceQuestion question = questionOptional.get();
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

