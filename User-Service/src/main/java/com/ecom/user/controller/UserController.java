package com.ecom.user.controller;

import com.ecom.user.dto.UserDTO;
import com.ecom.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users", produces = "application/json")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @PostMapping
    UserDTO saveUser(@RequestBody UserDTO user) {
        return userService.saveUser(user);
    }

    @GetMapping
    List<UserDTO> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    UserDTO findById(@PathVariable long id) {
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    boolean deleteUser(@PathVariable long id) {
        return userService.deleteUser(id);
    }
}
