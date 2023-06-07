package jogo.quiz.Controllers;

import jogo.quiz.DTOS.DTOQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jogo.quiz.Repositories.MultipleOptionsQuestionRepository;
import jogo.quiz.Models.MultipleOptionsQuestion;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/multiple-options-questions")
public class MultipleOptionsQuestionController {
    private final MultipleOptionsQuestionRepository questionRepository;

    @Autowired
    public MultipleOptionsQuestionController(MultipleOptionsQuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @GetMapping
    public List<MultipleOptionsQuestion> getAllQuestions() {
        return questionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<MultipleOptionsQuestion> getQuestionById(@PathVariable UUID id) {
        return questionRepository.findById(id);
    }

    @PostMapping
    public MultipleOptionsQuestion createQuestion(@RequestBody DTOQuestion questionDto) {
        MultipleOptionsQuestion question = new MultipleOptionsQuestion(questionDto);

        return questionRepository.save(question);
    }

    @PutMapping("/{id}")
    public void updateQuestion(@PathVariable UUID id, @RequestBody DTOQuestion updatedQuestionDto) {
        Optional<MultipleOptionsQuestion> questionOptional = questionRepository.findById(id);

        if (questionOptional.isPresent()) {
            MultipleOptionsQuestion question = questionOptional.get();

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
