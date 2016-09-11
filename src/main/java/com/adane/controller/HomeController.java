package com.adane.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by agebrem on 9/10/16.
 */

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Das Boot, requesting for duty!";
    }
}
