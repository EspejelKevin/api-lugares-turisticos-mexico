package api.tourist_places_mexico.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import api.tourist_places_mexico.domain.dto.touristplace.PlaceFilters;
import api.tourist_places_mexico.domain.dto.touristplace.TouristPlaceDTO;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/management-place/api/v1")
public class TouristPlaceController {
    
    @GetMapping("/places")
    public String places(PlaceFilters filters) {
        return "places";
    }

    @GetMapping("/places/{id}")
    public String place(@PathVariable(required = true) Long id) {
        return "place";
    }

    @GetMapping("/places/state/{id}")
    public String placesByState(@PathVariable(required = true) Long id) {
        return "places by state";
    }

    @GetMapping("/places/category/{id}")
    public String placesByCategory(@PathVariable(required = true) Long id) {
        return "places by category";
    }

    @GetMapping("/places/search/{name}")
    public String placeByName(@PathVariable(required = true) String name) {
        return "place by name";
    }

    @PostMapping("/places")
    public String createPlace(@Valid @RequestPart TouristPlaceDTO payload, @RequestPart("file") MultipartFile file) {
        return "place created";
    }
    
    @PutMapping("/places/{id}")
    public String updatePlace(@PathVariable(required = true) Long id, @Valid @RequestBody TouristPlaceDTO payload) {
        return "place updated";
    }

    @PutMapping("/places/{id}/image")
    public String updateImagePlace(@PathVariable(required = true) Long id, @RequestPart("file") MultipartFile file) {
        return "image place updated";
    }

    @DeleteMapping("/places/{id}")
    public String deletePlace(@PathVariable(required = true) Long id) {
        return "place deleted";
    }
}
