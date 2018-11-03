package com.xd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplatesController {
    @RequestMapping("/templates")
    public String templates(String tp) {
        return tp;
    }
}
