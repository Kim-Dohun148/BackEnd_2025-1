package com.example.bcsd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/introduce")
    public String introduce() {
        return "introduce";
    }

    @ResponseBody
    @GetMapping(value = "/introduce", params = "name") // 파라미터 구분
    public String introduce2(@RequestParam("name") String myName) { // name 입력받기
        return "안녕하세요 제 이름은" + myName + "입니다!";
    }

    @ResponseBody
    @GetMapping("/json")
    public User json() {
        User person = new User("1", 23, "김도훈");
        return person;
    }
}
