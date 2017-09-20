package com.cymon.pygmalion.controllers;

import com.cymon.pygmalion.repositories.InterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by simon on 19/09/17.
 */

@RestController
public class InterestController {

    @Autowired
    InterestRepository ir;

    //More to come...

}
