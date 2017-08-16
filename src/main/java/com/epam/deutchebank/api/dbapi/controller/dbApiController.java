package com.epam.deutchebank.api.dbapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/db-api")
public class dbApiController {

    @RequestMapping("/token")
    public String getAuthToken(){
        return "Token will be here";
    }
}
