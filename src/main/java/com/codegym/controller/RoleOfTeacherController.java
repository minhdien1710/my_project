package com.codegym.controller;

import com.codegym.model.RoleOfTeacher;
import com.codegym.service.RoleOfTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teacher-role")
public class RoleOfTeacherController {
    @Autowired
    RoleOfTeacherService roleOfTeacherService;

    @GetMapping
    public ResponseEntity<List<RoleOfTeacher>> findAll() {
        List<RoleOfTeacher> roleList = (List<RoleOfTeacher>) roleOfTeacherService.findAll();
        if (roleList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(roleList,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<RoleOfTeacher> save(@RequestBody RoleOfTeacher roleOfTeacher) throws Exception{
        roleOfTeacherService.save(roleOfTeacher);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping
    public ResponseEntity<RoleOfTeacher> delete(@PathVariable Long id){
        Optional<RoleOfTeacher> roleOfTeacher = roleOfTeacherService.findById(id);
        if(roleOfTeacher.isPresent()){
            roleOfTeacherService.delete(id);
            return new ResponseEntity<>(roleOfTeacher.get(),HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
