package com.codenotfound.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codenotfound.model.User;
import com.codenotfound.repository.UserRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import java.util.Random;
import java.util.UUID;

@Component
public class UserMutation implements GraphQLMutationResolver {

    @Autowired
    private UserRepository userRepository;

    public User newUser(String username, String password, String fullName, Integer validLogins) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setFullName(fullName);
        user.setValidLogins(validLogins);
        user.setId(UUID.randomUUID().toString());

        return userRepository.save(user);
    }
}

