package com.codenotfound.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codenotfound.model.User;
import com.codenotfound.repository.UserRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class UserQuery implements GraphQLQueryResolver {

    @Autowired
    private UserRepository userRepository;

    public User getUser(String id) {
        return userRepository.find(id);
    }
}
