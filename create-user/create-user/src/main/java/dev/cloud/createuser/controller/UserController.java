package dev.cloud.createuser.controller;


import dev.cloud.createuser.model.User;
import org.springframework.web.bind.annotation.*;
import dev.cloud.createuser.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user){
        System.out.println(user.toString());
        return userService.createUser(user);
    }
}
