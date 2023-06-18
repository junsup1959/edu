package com.glowsoft.controller;

import com.glowsoft.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

   @Autowired
   @Qualifier("memberS")
   private MemberService memberService;

    @RequestMapping("/")
    public String index(Model model) {
        memberService.selectList();
        model.addAttribute("data", "Hello, Spring from IntelliJ! :)");
        return "index";
    }
}
