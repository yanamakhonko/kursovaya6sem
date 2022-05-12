package com.milos.vulic.quiz;

import com.milos.vulic.quiz.models.OfferedAnswer;
import com.milos.vulic.quiz.models.Question;
import com.milos.vulic.quiz.models.User;
import com.milos.vulic.quiz.models.UserQuestionAnswer;
import com.milos.vulic.quiz.services.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class ServicesTest {

    @Autowired
    private OfferedAnswerService offeredAnswerService;
    @Autowired
    private QuestionServiceImp questionServiceImp;
    @Autowired
    private UserQuestionAnswerImp userQuestionAnswerImp;
    @Autowired
    private UserServiceImp userServiceImp;

    @Test
    void checkOfferedAnswers() {
        List<OfferedAnswer> offeredAnswers = offeredAnswerService.getAllTrueOffers();
        Assert.isTrue(offeredAnswers.size() != 0);
    }

    @Test
    void checkQuestions() {
        List<Question> questions = questionServiceImp.getListOfQuestions();
        Assert.isTrue(questions.size() != 0);
    }

    @Test
    void checkUserQuestions() {
        List<UserQuestionAnswer> userQuestions = userQuestionAnswerImp.findAll();
        Assert.isTrue(userQuestions.size() != 0);
    }

    @Test
    void checkUsers() {
        List<User> users = userServiceImp.getAllUsers();
        Assert.isTrue(users.size() != 0);
    }

}
