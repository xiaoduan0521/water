package com.xd.controller;

import com.xd.service.SyCosttypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/SyCosttype")
public class SyCosttypeController {

    @Autowired
    @Qualifier("SyCosttype")
    private SyCosttypeService scs;
}
