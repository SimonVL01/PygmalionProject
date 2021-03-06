package com.cymon.pygmalion.controllers;

import com.cymon.pygmalion.domain.Brand;
import com.cymon.pygmalion.domain.User;
import com.cymon.pygmalion.repositories.BrandRepository;
import com.cymon.pygmalion.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vdabcursist on 19/09/2017.
 */

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    BrandRepository br;

    @RequestMapping(method = RequestMethod.GET, path = "/all", produces = "application/json")
    public List<Brand> findAll() { return br.findAll(); }

    @RequestMapping(method = RequestMethod.POST, path="/all", consumes = "application/json", produces = "application/json")
    public Brand create(@RequestBody Brand brand) {
        br.save(brand);

        return brand;
    }

    @RequestMapping(method = RequestMethod.GET, value="/{bid}", produces = "application/json")
    public Brand getById(@PathVariable("bid") Integer id) {
        return br.findById(id);
    }

    /*@RequestMapping(method = RequestMethod.GET, value="/user/all", produces = "application/json")
    public List<User> getUserById(Integer id) {
        Brand brand = br.findById(id);
        List<User> uList = brand.getTargetAudience();
        return uList;
    }*/

    @RequestMapping(method = RequestMethod.GET, value="/{bid}/users", produces = "application/json")
    public List<User> getUserById(@PathVariable("bid") Integer id) {
        Brand brand = br.findById(id);
        List<User> uList = brand.getTargetAudience();
        return uList;
    }


    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public ResponseEntity<Brand> update(@RequestBody Brand input) {
        if (input.getId() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        br.save(input);
        return new ResponseEntity<>(input, HttpStatus.OK);
    }

    //More to come...

}
