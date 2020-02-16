package com.personal.training.conference.controller;

import com.personal.training.conference.model.User;
import com.personal.training.conference.model.forms.Registration;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {
    @GetMapping("user")
    public User getUser(@RequestParam(value = "firstname",defaultValue = "alexandre")String firstname) {
        User user = new User();
        user.setFirstname(firstname);
        user.setAge(12);
        user.setLastname("lloret");
        return user;
    }

    @PostMapping("/user")
    public User postUser(User user){
        return user;
    }
}
