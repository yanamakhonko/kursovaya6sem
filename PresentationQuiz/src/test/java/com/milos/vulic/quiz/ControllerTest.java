package com.milos.vulic.quiz;

import com.milos.vulic.quiz.controllers.QuestionController;
import com.milos.vulic.quiz.controllers.UserController;
import com.milos.vulic.quiz.models.Question;
import com.milos.vulic.quiz.models.User;
import com.milos.vulic.quiz.services.QuestionServiceImp;
import com.milos.vulic.quiz.services.UserServiceImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class ControllerTest {
    @Autowired
    private UserController userController;

    @Autowired
    private QuestionController questionController;

    @Test
    void checkLogin() {
        Assert.isTrue(userController.login().equals("home"));
    }

    @Test
    void checkRedirectToRegistrationForm() {
        Assert.isTrue(userController.redirectToRegistrationForm().equals("register"));
    }

    @Test
    void checkRedirectToQuestionsPage() {
        Assert.isTrue(questionController.redirectToQuestionsPage().equals("question-new"));
    }

    @Test
    void checkRedirectToAdminPage() {
        Assert.isTrue(userController.redirectToAdminPage().equals("admin"));
    }
}
