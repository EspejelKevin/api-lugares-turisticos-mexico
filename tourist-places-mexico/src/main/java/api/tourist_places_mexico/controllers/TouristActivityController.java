package api.tourist_places_mexico.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.tourist_places_mexico.domain.dto.touristactivity.TouristActivityDTO;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/management-activity/api/v1")
public class TouristActivityController {
    
    @GetMapping("/activities")
    public String activities() {
        return "activities";
    }

    @GetMapping("/activities/{id}")
    public String activity(@PathVariable(required = true) Long id) {
        return "activity";
    }

    @GetMapping("/activities/place/{id}")
    public String activitiesByPlace(@PathVariable(required = true) Long id) {
        return "activities by place";
    }

    @PostMapping("/activities")
    public String createActivity(@Valid @RequestBody TouristActivityDTO payload) {
        return "activity created";
    }
    
    @PutMapping("/activities/{id}")
    public String updateActivity(@PathVariable(required = true) Long id, @Valid @RequestBody TouristActivityDTO payload) {
        return "activity updated";
    }

    @DeleteMapping("/activities/{id}")
    public String deleteActivity(@PathVariable(required = true) Long id) {
        return "activity deleted";
    }
}
