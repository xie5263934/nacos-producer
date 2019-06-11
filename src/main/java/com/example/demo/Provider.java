package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Provider {

    @RequestMapping(value = "/echo/{str}")
    public String hello(@PathVariable String str) {
        return "hello:" + str;
    }

    @RequestMapping(value = "/user")
    public User getUser(@RequestBody User user) {
        System.out.println(user);
        User u = new User();
        u.setName("sheldon");
        u.setAge(20);
        u.setAddress("幸福街");
        return u;
    }

}
