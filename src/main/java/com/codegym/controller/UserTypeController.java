package com.codegym.controller;

import com.codegym.model.UserType;
import com.codegym.service.UserTypeService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/type")
public class UserTypeController {
    @Autowired
    private UserTypeService userTypeService;
    @GetMapping
    public ResponseEntity<List<UserType>> findAllType(){
        List<UserType> types = (List<UserType>) userTypeService.findAll();
        if (types.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(types, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<UserType> save(@RequestBody UserType userType){
        UserType userType1 = userType;
        userTypeService.save(userType);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
