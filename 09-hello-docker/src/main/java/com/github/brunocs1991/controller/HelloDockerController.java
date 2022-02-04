package com.github.brunocs1991.controller;

import com.github.brunocs1991.model.HelloDocker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {
    @RequestMapping("/hello-docker")
    private HelloDocker greeting() {
        var hostname = System.getenv("HOSTNAME");
        return new HelloDocker("Hello Docker", hostname);
    }
}
