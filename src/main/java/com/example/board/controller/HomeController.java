package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @@author SonSangGi
 * @created 2020/06/15
 * Copyright © 2020 mqnic. All rights reserved.
 */
@Controller
public class HomeController {
    @RequestMapping(value = {"/", ""})
    public String index() {
        return "index";
    }
}
