package com.example.LetsGoToTheTheatreSpring.Controllers;

import com.example.LetsGoToTheTheatreSpring.entities.Location;
import com.example.LetsGoToTheTheatreSpring.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private LocationRepository locationRepository;

    @PostMapping("/create")
    public void  createLocation(@RequestBody Location location){
        locationRepository.saveAndFlush(location);
    }

}
