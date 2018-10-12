package com.codenotfound.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.codenotfound.model.User;

@Component
public class UserRepository {

    private Map<String, User> greetings;

    public UserRepository() {
        greetings = new HashMap<>();
    }

    public User save(User greeting) {
        String id = UUID.randomUUID().toString();

        greetings.put(id, greeting);
        greeting.setId(id);

        return greeting;
    }

    public User find(String id) {
        return greetings.get(id);
    }
}

