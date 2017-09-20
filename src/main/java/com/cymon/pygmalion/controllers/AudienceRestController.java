package com.cymon.pygmalion.controllers;

import com.cymon.pygmalion.domain.User;
import com.cymon.pygmalion.repositories.BrandRepository;
import com.cymon.pygmalion.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by vdabcursist on 20/09/2017.
 */

/*@RestController
public class AudienceRestController {

    Autowired
    UserRepository br;

    @RequestMapping(method = RequestMethod.GET, path ="api/user/all", produces = "application/json")
    public List<User> findAll() {
        return br.findAll();
    }
}*/
