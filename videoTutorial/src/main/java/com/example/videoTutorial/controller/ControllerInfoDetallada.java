package com.example.videoTutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerInfoDetallada {
    @Autowired

    @GetMapping("/InfoDetallada")
    public String mostrarInfoDetallada() {
        return "InfoDetallada";
    }
}