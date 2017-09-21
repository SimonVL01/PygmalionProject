package com.cymon.pygmalion.controllers;

import com.cymon.pygmalion.repositories.WebdeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vdabcursist on 20/09/2017.
 */

@RestController
public class WebdeviceController {

    @Autowired
    WebdeviceRepository wr;
}
