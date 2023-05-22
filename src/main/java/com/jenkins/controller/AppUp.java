package com.jenkins.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppUp {
    Logger log = LoggerFactory.getLogger(AppUp.class);
    @GetMapping("/")
    public String verifying() {
        log.info("Jenkins Application up");
        return ("Welcome to jenkins");
    }

}
