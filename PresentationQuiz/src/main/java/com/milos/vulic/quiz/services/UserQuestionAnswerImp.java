package com.milos.vulic.quiz.services;

import com.milos.vulic.quiz.models.UserQuestionAnswer;
import com.milos.vulic.quiz.repositories.UserQuestionAnswerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserQuestionAnswerImp implements UserQuestionAnswerService {

    private final UserQuestionAnswerRepository userQuestionAnswerRepository;

    public UserQuestionAnswerImp(UserQuestionAnswerRepository userQuestionAnswerRepository) {
        Singleton.getInstance().addPrWriteFile("Произошел поиск в таблице UserQuestionAnswer");
        this.userQuestionAnswerRepository = userQuestionAnswerRepository;
    }

    @Override
    public void insertUserQuestionAnswer(UserQuestionAnswer userQuestionAnswer) {
        Singleton.getInstance().addPrWriteFile("Произошло изменение в таблице UserQuestionAnswer");
        userQuestionAnswerRepository.save(userQuestionAnswer);
    }

    @Override
    public UserQuestionAnswer findByQuestionIdAndUserId(Long questionId, Long userId) {
        Singleton.getInstance().addPrWriteFile("Произошел поиск в таблице UserQuestionAnswer");
        return userQuestionAnswerRepository.findByQuestion_QuestionIdAndUser_UserId(questionId, userId);
    }

    @Override
    public void updateUserQuestionAnswer(UserQuestionAnswer userQuestionAnswer) {
        Singleton.getInstance().addPrWriteFile("Произошло изменение в таблице UserQuestionAnswer");
        userQuestionAnswerRepository.save(userQuestionAnswer);
    }

    @Override
    public List<UserQuestionAnswer> findallByUserId(Long userId) {
        Singleton.getInstance().addPrWriteFile("Произошел поиск в таблице UserQuestionAnswer");
        return userQuestionAnswerRepository.findAllByUser_UserId(userId);
    }

    @Override
    public List<UserQuestionAnswer> findAll() {
        Singleton.getInstance().addPrWriteFile("Произошел поиск в таблице UserQuestionAnswer");
        return userQuestionAnswerRepository.findAll();
    }
}
