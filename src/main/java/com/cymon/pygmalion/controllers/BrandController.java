package com.cymon.pygmalion.controllers;

import com.cymon.pygmalion.domain.Brand;
import com.cymon.pygmalion.repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vdabcursist on 19/09/2017.
 */

@RestController
public class BrandController {

    @Autowired
    BrandRepository br;

    @RequestMapping(method = RequestMethod.GET, path = "api/brand/all", produces = "application/json")
    public List<Brand> findAll() { return br.findAll(); }

    @RequestMapping(method = RequestMethod.GET, path = "api/brand/{bid}", produces = "appliction/json")
    public Brand findMostPopularUserAge(@PathVariable("bid") int id) {
        return br.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST, path = "api/brand", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Brand> create(@RequestBody Brand brand) {
        if (brand.getId() != null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        br.save(brand);
        return new ResponseEntity<>(brand, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "api/brand", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Brand> update(@RequestBody Brand input) {
        if (input.getId() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        br.save(input);
        return new ResponseEntity<>(input, HttpStatus.OK);
    }

    //More to come...

}
