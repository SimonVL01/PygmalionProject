package com.cymon.pygmalion.controllers;

import com.cymon.pygmalion.repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vdabcursist on 19/09/2017.
 */

@RestController
public class BrandController {

    @Autowired
    BrandRepository br;

    //More to come...

}
