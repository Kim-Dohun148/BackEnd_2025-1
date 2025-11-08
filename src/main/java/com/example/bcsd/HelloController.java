package com.example.bcsd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!!!!!";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "hello";
    }

    @ResponseBody
    @GetMapping("/introduce")
    public String introduce() { return "안녕하세요 제 이름은 김도훈입니다!"; }
}
