package com.xd.controller;

import com.xd.service.SyMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/SyMenu")
public class SyMenuController {
    @Autowired
    @Qualifier("SyMenu")
    private SyMenuService sms;
}
