package com.cymon.pygmalion.service;

import com.cymon.pygmalion.repositories.WebdeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vdabcursist on 20/09/2017.
 */

@Service
public class WebdeviceService {

    @Autowired
    WebdeviceRepository wr;

}
