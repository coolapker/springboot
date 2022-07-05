package com.mojospy.movies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author mojospy
 */
@Controller
public class IndexController {
    @RequestMapping({"/","/index","/index.html"})
    public String index(Model m) {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "index";
    }
}
