package com.ana.coronavirustracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Ana on 8/11/2020
 */

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
