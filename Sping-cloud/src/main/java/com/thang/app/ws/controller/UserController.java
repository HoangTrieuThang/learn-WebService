package com.thang.app.ws.controller;

import com.thang.app.ws.model.UserRest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") //http://localhost:8080/users
public class UserController {

    @GetMapping
    public String getUsers(@RequestParam(value = "page", defaultValue = "1")
                                       int page, @RequestParam(value = "limit", defaultValue = "50") int limit){
        return "Get user called with page = " + page + " and limit = " + limit;
    }

    @GetMapping(path = "/{userId}",
            produces = {MediaType.APPLICATION_XML_VALUE,
                        MediaType.APPLICATION_JSON_VALUE})
    public UserRest getUser(@PathVariable String userId){
        UserRest returnValue = new UserRest();
        returnValue.setEmail("test@gmail.com");
        returnValue.setUsername("Tom");
        returnValue.setPassword("123123");
        returnValue.setUserId("B17DCCN559");

        return returnValue;
    }

    @PostMapping
    public String creatUser(){
        return "Creat user called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "Delete user called";
    }

    @PutMapping
    public String updateUser(){
        return "Update user called";
    }
}
