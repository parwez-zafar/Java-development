package com.parwez.quizzapp.service;

import com.parwez.quizzapp.dao.QuestionDao;
import com.parwez.quizzapp.dao.QuizDao;
import com.parwez.quizzapp.model.Question;
import com.parwez.quizzapp.model.QuestionWrapper;
import com.parwez.quizzapp.model.Quiz;
import com.parwez.quizzapp.model.Response;
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
    QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String category, int noOfQuestions, String title) {
        Quiz quiz = new Quiz();
        List<Question> questions = questionDao.findRandomQuestionsByCategory(category, noOfQuestions);
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);
        System.out.println(quizDao.findAll());
        return new ResponseEntity<>("Quiz Created", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(Integer id){
        Optional<Quiz> quiz = quizDao.findById(id);
        List<Question> questionsFromDB = quiz.get().getQuestions();
        List<QuestionWrapper> questionsForUser = new ArrayList<>();

        for(Question q : questionsFromDB)
        {
            QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getQuestionTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
            questionsForUser.add(qw);
        }

        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateReuslt(Integer quizId, List<Response> responses) {

        Quiz quiz = quizDao.findById(quizId).get();
        List<Question> questions = quiz.getQuestions();
        int result = 0;
        for(Response response : responses){
            for(Question q : questions)
            {
                if(q.getId().equals(response.getId()) && response.getResponse().equals(q.getRightAnswer())){
                    result += 1;
                }
            }
        }

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
