package com.parwez.question_service.controller;


import com.parwez.question_service.model.Question;
import com.parwez.question_service.model.QuestionWrapper;
import com.parwez.question_service.model.Response;
import com.parwez.question_service.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @Autowired
    Environment environment;


    @GetMapping("/allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    // generate
    @GetMapping("generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String category,
                                                             @RequestParam Integer noOfQuestions) {
        return questionService.getQuestionsForQuiz(category, noOfQuestions);
    }

    // getQuestions (questionId)
    @PostMapping("getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionFromId(@RequestBody List<Integer> questionsIds) {
        return questionService.getQuestionsFromId(questionsIds);
    }

    // getScore
    @PostMapping("getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses){
        System.out.println(environment.getProperty("local.server.port"));
        return questionService.getScore(responses);
    }
}
