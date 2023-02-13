package com.zerobase.fastlms.member.controller;

import com.zerobase.fastlms.member.model.MemberInput;
import com.zerobase.fastlms.member.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class MemberController {

    private final MemberService memberService;

    //@GetMapping("/member/register")
    //@RequestMapping(value = "/member/register", method = RequestMethod.GET)
    @GetMapping("/member/register")
    public String register() {

        return "member/register";
    }

    // request WEB -> SERVER
    // response SERVER -> WEB
    //@RequestMapping(value = "member/register", method = RequestMethod.POST)
    @PostMapping("/member/register")
    public String registerSubmit(Model model, HttpServletRequest request, HttpServletResponse response, MemberInput parameter) {

        /*
        String userId = request.getParameter("userId");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");

        System.out.println("userId = " + userId);
        System.out.println("userName = " + userName);
        System.out.println("password = " + password);
        System.out.println("phone = " + phone);
         */

        boolean result = memberService.register(parameter);
        model.addAttribute("result", result);

        return "member/register_complete";
    }

    // http://www.naver.com/news/list.do?id=123&key=124&text=쿼리
    // 프로토콜://도메인(IP)/news/list.do?쿼리스트림(파라미터)

    @GetMapping("/member/email-auth")
    public String emailAuth(Model model, HttpServletRequest request) {

        String uuid = request.getParameter("id");
        System.out.println(uuid);

        boolean result = memberService.emailAuth(uuid);
        model.addAttribute("result", result);


        return "member/email_auth";
    }





}
