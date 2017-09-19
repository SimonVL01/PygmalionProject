package com.cymon.pygmalion.service;

import com.cymon.pygmalion.domain.User;
import com.cymon.pygmalion.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vdabcursist on 19/09/2017.
 */

@Service
public class UserService {

    public UserService() {
        System.out.println("FlightService gemaakt.");
    }

    @Autowired
    UserRepository ur;

    public List<User> findAll() {
        System.out.println("User Service wordt gedelegeerd");
        List<User> u = ur.findAll();
        return u;
    }

}
