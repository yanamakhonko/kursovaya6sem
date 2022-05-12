package com.milos.vulic.quiz;

import com.milos.vulic.quiz.models.OfferedAnswer;
import com.milos.vulic.quiz.models.Question;
import com.milos.vulic.quiz.models.User;
import com.milos.vulic.quiz.models.UserQuestionAnswer;
import com.milos.vulic.quiz.services.OfferedAnswerService;
import com.milos.vulic.quiz.services.QuestionServiceImp;
import com.milos.vulic.quiz.services.UserQuestionAnswerImp;
import com.milos.vulic.quiz.services.UserServiceImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class ModelsTest {
    @Autowired
    private QuestionServiceImp questionServiceImp;
    @Autowired
    private UserServiceImp userServiceImp;

    @Test
    void checkQuestions() {
        List<Question> questions = questionServiceImp.getListOfQuestions();
        for (Question question : questions) {
            Assert.isTrue(!question.toString().equals(""));
        }
    }

    @Test
    void checkUsers() {
        List<User> users = userServiceImp.getAllUsers();
        for (User user : users) {
            Assert.isTrue(!user.toString().equals(""));
        }
    }

}
