package com.ddori.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConfigClientRestController {
    @Value("${who.am.i}")
    private String myName;

    @Autowired
    private ConfigClientService configClientService;
    @GetMapping("/hello")
    public String hello() {
        return myName;
    }
}
