package com.sushant.git.actions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GitController {
    @GetMapping("/welcome")
    public String welcome()
    {
        return "welcome again";
    }
}
