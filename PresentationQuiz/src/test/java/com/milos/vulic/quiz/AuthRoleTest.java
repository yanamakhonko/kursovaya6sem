package com.milos.vulic.quiz;

import com.milos.vulic.quiz.models.Role;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class AuthRoleTest {

    @Test
    void testRolePARTICIPANT() {
        Role role = Role.PARTICIPANT;
        Assert.isTrue(Role.valueOf("PARTICIPANT") == role);
    }

    @Test
    void testRoleADMIN() {
        Role role = Role.ADMIN;
        Assert.isTrue(Role.valueOf("ADMIN") == role);
    }

}
