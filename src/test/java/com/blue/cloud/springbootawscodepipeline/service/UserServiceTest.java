package com.blue.cloud.springbootawscodepipeline.service;

import com.blue.cloud.springbootawscodepipeline.model.User;
import com.blue.cloud.springbootawscodepipeline.repository.UserRespository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@SpringBootTest(properties = "spring.profiles.active:test")
@ExtendWith(SpringExtension.class)
public class UserServiceTest
{
    @Autowired
    private UserService userService;

    @Autowired
    private UserRespository userRepository;

    @Test
    public void test_saveUser()
    {
        User user = new User();
        user.setName("Test-name");
        user.setUsername("un-1");

        userService.saveUser(user);

        List<User> users = userRepository.findAll();

        Assertions.assertThat(users).hasSize(1);
    }
}