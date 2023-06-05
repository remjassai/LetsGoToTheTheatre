package com.example.LetsGoToTheTheatreSpring.Controllers;

import com.example.LetsGoToTheTheatreSpring.entities.LiveShow;
import com.example.LetsGoToTheTheatreSpring.repositories.LiveShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/liveshow")
public class LiveShowController {
    @Autowired
    private LiveShowRepository liveshowrepository;


    @PostMapping("/create")
    public void createShow(@RequestBody LiveShow liveshow){
        liveshowrepository.saveAndFlush(liveshow);
    }
}
