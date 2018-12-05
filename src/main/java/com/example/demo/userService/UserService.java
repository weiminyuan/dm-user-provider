package com.example.demo.userService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
    private Logger logger = LoggerFactory.getLogger(UserService.class);

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("count") int count) throws Exception {
        logger.info("access provider 8080 as "+count);
        return "用户1号已登录";
    }
}
