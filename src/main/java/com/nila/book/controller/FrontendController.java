package com.nila.book.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontendController
{

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView testPage()
    {
        ModelAndView modelView = new ModelAndView();
        modelView.setViewName("test");
        return modelView;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView loginPage(@RequestParam(value = "error", required = false) String error, @RequestParam(value = "logout", required = false) String logout)
    {
        ModelAndView modelView = new ModelAndView();

        if (error != null)
        {
            modelView.addObject("error", error);
        }
        else if (logout != null)
        {
            modelView.addObject("error", logout);
        }

        modelView.setViewName("login");
        return modelView;
    }

    @RequestMapping(value = "/user/home", method = RequestMethod.GET)
    public ModelAndView homePage(@RequestParam(value = "notallowed", required = false) String isAllowed)
    {
        ModelAndView modelView = new ModelAndView();
        System.out.println(isAllowed);
        modelView.addObject("isAllowed", isAllowed);
        modelView.setViewName("user");
        return modelView;
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "/admin/", method = RequestMethod.GET)
    public ModelAndView adminPage()
    {
        ModelAndView modelView = new ModelAndView();
        modelView.setViewName("admin");
        return modelView;
    }

}
