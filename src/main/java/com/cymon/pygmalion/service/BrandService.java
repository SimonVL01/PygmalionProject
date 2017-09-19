package com.cymon.pygmalion.service;

import com.cymon.pygmalion.repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vdabcursist on 19/09/2017.
 */

@Service
public class BrandService {

    @Autowired
    BrandRepository br;
}
