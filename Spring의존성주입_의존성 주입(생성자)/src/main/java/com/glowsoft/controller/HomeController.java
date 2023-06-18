package com.glowsoft.controller;

import com.glowsoft.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class HomeController {

   private final MemberService memberService;



//   @Autowired
//   생성자 주입방식은 스프링 4.3.x 이상부터 Autowired 생략 가능.
//    생성자 주입은 파이널 필드로 입력 가능.
   public HomeController(MemberService memberService){
       this.memberService = memberService;
   }

    @RequestMapping("/")
    public String index(Model model) {
        memberService.selectList();
        model.addAttribute("data", "Hello, Spring from IntelliJ! :)");
        return "index";
    }
}
