package com.example.SpringBoot.SpringBootNTT.Controller;

import com.example.SpringBoot.SpringBootNTT.Entity.Student;
import com.example.SpringBoot.SpringBootNTT.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public void addStudent(@RequestBody Student student) {
    service.addStudent(student);
    }


    @GetMapping("/{nombre}")
    public String holaMundo(@PathVariable String nombre) {
        return "Hola Mundo " + nombre;
    }

    @GetMapping("/porNombre/{nombreVariable}")
    public Student getStudentByName(@PathVariable("nombreVariable") String name){

        return service.getStudent(name);
    }






}
