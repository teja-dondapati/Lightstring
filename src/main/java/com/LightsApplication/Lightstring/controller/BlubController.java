package Lights.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

// Import Bulb and BulbService
import Lights.model.Bulb;
import Lights.service.BulbService;

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
