package com.parwez.quiz_service.service;

import com.parwez.quiz_service.dao.QuizDao;
import com.parwez.quiz_service.feign.QuizInterface;
import com.parwez.quiz_service.model.QuestionWrapper;
import com.parwez.quiz_service.model.Quiz;
import com.parwez.quiz_service.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;

    @Autowired
    QuizInterface quizInterface;

    public ResponseEntity<String> createQuiz(String category, int noOfQuestions, String title) {
        // call the generate URL - RestTemplate http://localhost:8080/question/generate

        List<Integer> questions = quizInterface.getQuestionsForQuiz(category, noOfQuestions).getBody();
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionIds(questions);
        quizDao.save(quiz);
        return new ResponseEntity<>("Quiz Created", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(Integer id){
        Quiz quiz = quizDao.findById(id).get();
        List<Integer> questionIds = quiz.getQuestionIds();
        ResponseEntity<List<QuestionWrapper>> questions = quizInterface.getQuestionFromId(questionIds);
        return questions;
    }

    public ResponseEntity<Integer> calculateReuslt(Integer quizId, List<Response> responses) {

//        Quiz quiz = quizDao.findById(quizId).get();
//        List<Question> questions = quiz.getQuestions();
        int result = quizInterface.getScore(responses).getBody();
//        for(Response response : responses){
//            for(Question q : questions)
//            {
//                if(q.getId().equals(response.getId()) && response.getResponse().equals(q.getRightAnswer())){
//                    result += 1;
//                }
//            }
//        }

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
