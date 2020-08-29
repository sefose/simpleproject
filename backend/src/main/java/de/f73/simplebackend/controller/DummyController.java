package de.f73.simplebackend.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.f73.simplebackend.DTO.DummyDto;
import de.f73.simplebackend.service.DummyService;

/**
 * DummyController
 */
@RestController
public class DummyController {

    @Autowired
    DummyService dummyService;
    
    @GetMapping("/")
    public ResponseEntity<String> justSlash() {
        return new ResponseEntity<>("Danke Hendrik",HttpStatus.OK);
    }
    @PostMapping("/dummy")
    public ResponseEntity<DummyDto> createDummy(@RequestBody DummyDto dummyDTO) {
        DummyDto returnDummyDTO = dummyService.save(dummyDTO);
        return new ResponseEntity<>(returnDummyDTO, HttpStatus.CREATED);
    }

    @GetMapping("/dummy")
    public ResponseEntity<Collection<DummyDto>> getDummies() {
        return new ResponseEntity<>(dummyService.findAll(), HttpStatus.OK);
    }

    
}