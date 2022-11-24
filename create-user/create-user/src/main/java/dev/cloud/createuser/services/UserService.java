package dev.cloud.createuser.services;

import dev.cloud.createuser.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserService(){ }

    public User createUser(User user) {
        user.setId("example-id");
        return user;
    }
}
