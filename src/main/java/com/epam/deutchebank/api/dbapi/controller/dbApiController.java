package com.epam.deutchebank.api.dbapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/db-api")
public class dbApiController {

    @RequestMapping("/token")
    public void getAuthToken(){
        System.out.println("Token will be here");
    }
}
