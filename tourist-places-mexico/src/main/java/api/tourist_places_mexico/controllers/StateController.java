package api.tourist_places_mexico.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.tourist_places_mexico.domain.dto.state.StateDTO;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/management-state/api/v1")
public class StateController {
    
    @GetMapping("/states")
    public String states() {
        return "states";
    }

    @GetMapping("/states/{id}")
    public String state(@PathVariable(required = true) Long id) {
        return "state";
    }

    @PostMapping("/states")
    public String createState(@Valid @RequestBody StateDTO payload) {
        return "state created";
    }
    
    @PutMapping("/states/{id}")
    public String updateState(@PathVariable(required = true) Long id, @Valid @RequestBody StateDTO payload) {
        return "state updated";
    }

    @DeleteMapping("/states/{id}")
    public String deleteState(@PathVariable(required = true) Long id) {
        return "state deleted";
    }
}
