package com.iq.rest.webservice.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    //GET
    //URI - /hellow-world
    //method -"Hello World"
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    //hello-world-bean
    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World Bean");
    }

    //hello-world-bean
    @GetMapping("/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name ));
    }
}
