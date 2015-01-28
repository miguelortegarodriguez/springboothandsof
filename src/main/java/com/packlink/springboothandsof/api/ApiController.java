package com.packlink.springboothandsof.api;

import com.packlink.springboothandsof.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class ApiController {

    @Autowired
    private UserRepository repository;

    @RequestMapping("test")
    public String testApi(@RequestParam("word") String word){
        return word;
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public User addUser(@RequestBody User user){
        repository.save(user);
        return user;
    }

    @RequestMapping("s/")
    public List<User> list(){
        List<User> users = new ArrayList<User>();
        for(User user : repository.findAll()){
            users.add(user);
        }

        return users;
    }
}
