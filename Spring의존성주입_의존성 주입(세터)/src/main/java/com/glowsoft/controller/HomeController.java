package com.glowsoft.controller;

import com.glowsoft.service.MembrerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class HomeController {


   private MembrerService membrerService;

   @Autowired
    //  private final MembrerService membrerService;
   // membrerService 를 final로 선언해도 돌아가기는 하나 , 보안 정책상 올바르지 않음. 상위버전에서는 막혀있을 가능성이 큼.
   public void setMembrerService(MembrerService membrerService){
       this.membrerService = membrerService;
   }

    @RequestMapping("/")
    public String index(Model model) {
        membrerService.selectList();
        model.addAttribute("data", "Hello, Spring from IntelliJ! :)");
        return "index";
    }
}
