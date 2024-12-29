package com.parwez.quiz_service.controller;


import com.parwez.quiz_service.model.QuestionWrapper;
import com.parwez.quiz_service.model.QuizDto;
import com.parwez.quiz_service.model.Response;
import com.parwez.quiz_service.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestBody QuizDto quizDto) {
        return quizService.createQuiz(quizDto.getCategoryName(), quizDto.getNoOfQuestions(), quizDto.getTitle());
    }

    @GetMapping("get/{quizId}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer quizId){
        return quizService.getQuizQuestion(quizId);
    }

    @PostMapping("submit/{quizId}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer quizId, @RequestBody List<Response> responses){
        return quizService.calculateReuslt(quizId, responses);
    }
}
