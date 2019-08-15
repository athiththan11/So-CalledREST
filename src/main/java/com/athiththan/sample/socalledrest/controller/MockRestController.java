package com.athiththan.sample.socalledrest.controller;

import com.athiththan.sample.socalledrest.service.JSONPlaceHolder;
import com.athiththan.sample.socalledrest.util.MockConstant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import feign.Feign;
import feign.gson.GsonDecoder;

@CrossOrigin
@RestController
@RequestMapping(value = "/mock")
public class MockRestController {

    static JSONPlaceHolder jHolder;
    static {
        jHolder = Feign.builder().decoder(new GsonDecoder()).target(JSONPlaceHolder.class,
                MockConstant.JSONPLACEHOLDER_USERS);
    }

    @GetMapping(path = "/users", produces = "application/json")
    public ResponseEntity<?> getUsers() {
        return new ResponseEntity<>(jHolder.users(), HttpStatus.OK);
    }
    
    @GetMapping(path = "/users/{id}", produces = "application/json")
    public ResponseEntity<?> getUser(@PathVariable("id") int id) {
        return new ResponseEntity<>(jHolder.users(id), HttpStatus.OK);
    }

}