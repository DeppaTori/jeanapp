package com.deppatori.jeanapp.controller;

import com.deppatori.jeanapp.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public Message index(){
        return new Message("Hello Jean!");
    }
}
