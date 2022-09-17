package com.chrisodum.ll.wapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rcodum")
public class AboutMeController {

    @GetMapping
    public String getAboutMe() {

        return "rcodum.html";
    }

}
