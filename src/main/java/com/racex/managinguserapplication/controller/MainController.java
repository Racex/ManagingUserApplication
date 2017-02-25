package com.racex.managinguserapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Maciek on 2017-02-25.
 */

@RestController
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mainPage() {
        return "Witaj na głównej stronie";
    }
}
