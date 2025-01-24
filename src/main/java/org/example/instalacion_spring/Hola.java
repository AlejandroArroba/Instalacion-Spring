package org.example.instalacion_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hola {

    @GetMapping("/hola")
    public String holaMundo() {
        return "Hola Mundo";
    }
    
}
