package com.example.SpringBoot.SpringBootNTT.Controller;

import com.example.SpringBoot.SpringBootNTT.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    @Autowired
    private StudentService service;

    @GetMapping("/homePage")
    public String homePage(Model model){
        // model.addAllAttributes("students", );
        model.addAttribute("yoSoy", "Alexis");
        return"home";
    }


    @GetMapping("/listaAlumnos")
    public String listaAlumnos(Model model){
        // model.addAllAttributes("students", );
        model.addAttribute("students", service.getLista());
        return"alumnos";
    }



}
