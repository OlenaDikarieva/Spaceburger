package de.fastfood.Spaceburger.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("/")
    public ResponseEntity getUsers(){
        try {return ResponseEntity.ok("Server work");}
        catch (Exception e) {
            return ResponseEntity.badRequest().body("Error getUsers");
        }


    }
}

