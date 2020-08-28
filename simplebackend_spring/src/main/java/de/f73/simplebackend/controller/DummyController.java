package de.f73.simplebackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DummyController
 */
@RestController
public class DummyController {

    @GetMapping("/")
    public ResponseEntity<String> justSlash() {
        return new ResponseEntity<>("Danke Hendrik",HttpStatus.OK);
    }
    
}