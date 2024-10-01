package com.example.demo;

import com.example.demo.IdentityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentityController {

    private final IdentityService identityService;

    // Inyección de dependencias en el constructor
    public IdentityController(IdentityService identityService) {
        this.identityService = identityService;
    }

    // Endpoint para verificar si un CI existe
    @GetMapping("/verificar-ci")
    public String verificarCI(@RequestParam String ci) {
        return identityService.verificarCI(ci) ? "El CI existe." : "El CI no existe.";
    }
}