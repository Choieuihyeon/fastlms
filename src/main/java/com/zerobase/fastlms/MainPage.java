package com.zerobase.fastlms;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPage {

    @RequestMapping("/")
    public String index() {
        return "Index Page";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response) {

        String msg = "<html>" +
                "<head>" +
                "</head>" +
                "<body>" +
                "<p>hello</p> <p>fastlms website!!!</p>" +
                "</body>" +
                "</html>";

        return msg;
    }
}
