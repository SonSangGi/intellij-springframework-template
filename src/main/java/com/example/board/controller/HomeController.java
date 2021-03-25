package com.example.board.controller;

import com.example.board.service.HelloService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @@author SonSangGi
 * @created 2020/06/15
 * Copyright © 2020 mqnic. All rights reserved.
 */
@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final HelloService helloService;

    @GetMapping(value = {"/", ""})
    public String index(Model model) {

        String message = helloService.hello();
        model.addAttribute("message", message);
        log.debug("Message: {}", message);

        return "index";
    }

}
