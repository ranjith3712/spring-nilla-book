package com.nila.book.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin")
public class AdminRestController
{

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String adminTest()
    {
        return "This is admin user";
    }

}
