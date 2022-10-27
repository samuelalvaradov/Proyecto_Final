package com.practica001.controller;

import com.practica001.dao.EstadoDao;
import com.practica001.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/")
    public String inicio(Model model) {
        
        var estados = estadoService.getEstados();
        
        model.addAttribute("estados", estados);
        
        return "index";
    }
}
