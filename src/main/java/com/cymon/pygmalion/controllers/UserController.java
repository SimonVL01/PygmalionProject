package com.cymon.pygmalion.controllers;

import com.cymon.pygmalion.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vdabcursist on 19/09/2017.
 */

@RestController
public class UserController {

    @Autowired
    UserRepository ur;

    //More to come...
}
