package com.brunofelixoliveira.cvportfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AppController {

    public String index() {
        return "index";
    }

}
