package com.cymon.pygmalion.controllers;

import com.cymon.pygmalion.domain.Brand;
import com.cymon.pygmalion.domain.Interest;
import com.cymon.pygmalion.domain.User;
import com.cymon.pygmalion.repositories.BrandRepository;
import com.cymon.pygmalion.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 19/09/2017.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository ur;

    @Autowired
    BrandRepository br;

    @RequestMapping(method = RequestMethod.GET, path = "/all", produces = "application/json")
    public List<User> findAll() { return ur.findAll(); }

    @RequestMapping(method = RequestMethod.GET, value="/{uid}", produces = "application/json")
    public User getById(@PathVariable("uid") String firstname) {
        return ur.findByFirstname(firstname);
    }

    @RequestMapping(method = RequestMethod.GET, value="/{uid}/interest", produces = "application/json")
    public List<Interest> getUserById(@PathVariable("uid") Integer id) {
        Brand brand = br.findById(id);
        List<Interest> uList = new ArrayList<>();
        for (User u : brand.getTargetAudience()) {
            uList = u.getInterest();
        }
        return uList;
    }
}


