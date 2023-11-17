package com.LightsApplication.Lightstring.controller;

import com.LightsApplication.Lightstring.model.Bulb;
import com.LightsApplication.Lightstring.service.BulbService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bulbs")
public class BulbController {

    private final BulbService bulbService;

    public BulbController(BulbService bulbService) {
        this.bulbService = bulbService;
    }

    @GetMapping
    public List<Bulb> getAllBulbs() {
        return bulbService.getAllBulbs();
    }

    @PutMapping("/{color}")
    public List<Bulb> turnOnBulbs(@PathVariable String color) {
        return bulbService.turnOnBulbs(color);
    }
}