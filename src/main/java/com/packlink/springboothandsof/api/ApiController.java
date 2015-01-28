package com.packlink.springboothandsof.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("test")
    public String testApi(@RequestParam("word") String word){
        return word;
    }

    @RequestMapping(value = "user", method = RequestMethod.PUT)
    public User addUser(@RequestBody User user){
        return user;
    }
}
