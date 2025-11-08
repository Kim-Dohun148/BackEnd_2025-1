package com.example.bcsd;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
public class CRUD_API {
    private Map<String, User> userMap;

    @PostConstruct
    public void init() {
        userMap = new HashMap<String, User>();
        userMap.put("1", new User("1", 23, "김도훈"));
        userMap.put("2", new User("2", 24, "도훈"));
        userMap.put("3", new User("3", 25, "훈도김"));
    }

    @GetMapping("/user/{id}")
    public User user(@PathVariable("id")  String id) {
        return userMap.get(id);
    }

    @PutMapping("/user/{id}")
    public void setUser(
            @PathVariable("id") String id,
            @RequestParam("age") int age,
            @RequestParam("name") String name)
    {
        User user = new User(id, age, name);
        userMap.put(id, user);
    }

}
