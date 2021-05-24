package com.example.demo3;

import com.example.demo3.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Demo3Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Demo3Application.class, args);
    }

    @Autowired
    private UserMapper userMapper;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = userMapper.findUsers();
        System.out.println(users);
    }
}
