package com.ddori.configclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConfigClientService {

    @Value("${who.am.i}")
    private String myName;

    public String getMyName() {
        return myName;
    }
}
