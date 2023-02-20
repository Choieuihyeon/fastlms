package com.zerobase.fastlms.main.controller;

import com.zerobase.fastlms.components.MailComponents;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final MailComponents mailComponents;

    @RequestMapping("/")
    public String index() {

        /*
        String email = "ceh201312@gmail.com";
        String subject = "안녕하세요. 제로베이스입니다.";
        String text = "<p>안녕하세요.</p><p>반갑습니다.</p>";

        mailComponents.sendMail(email, subject, text);
         */

        return "index";
    }

    // 스프링 -> MVC (View -> 템플릿엔진 화면에 내용을 출력(html))
    // .NET -> MVC (View -> 출력)
    // Python django -> MTV(Template -> 화면출력)
    // 백엔드과정 -> V(화면에 보여지는 부분) -> 프론트엔드과정
    // V -> HTML ==> 웹페이지
    // V -> json ==> API


    // request -> WEB -> SERVER
    // response -> SERVER -> WEB
    @RequestMapping("/hello")
    public void hello(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter printWriter = response.getWriter();

        String msg = "<html>" +
                "<head>" +
                "<meta charset='UTF-8'>" +
                "</head>" +
                "<body>" +
                "<p>hello</p>" +
                "<p>fastlms website!!!</p>" +
                "<p> 안녕하세요!!! ====> </p>" +
                "</body>" +
                "</html>";

        printWriter.write(msg);
        printWriter.close();
    }

    @RequestMapping("/error/denied")
    public String errorDenied() {



        return "error/denied";
    }


}
