package com.LightsApplication.Lightstring.service;

// BulbService.java

import com.LightsApplication.Lightstring.model.Bulb;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BulbService {

    private List<Bulb> bulbs;

    public BulbService() {
        bulbs = initializeBulbs();
    }

    public List<Bulb> getAllBulbs() {
        return bulbs;
    }

    public List<Bulb> turnOnBulbs(String color) {
        bulbs.stream()
                .filter(bulb -> bulb.getColor().equalsIgnoreCase(color))
                .forEach(bulb -> bulb.setOn(true));

        return bulbs;
    }

    private List<Bulb> initializeBulbs() {
        List<Bulb> initializedBulbs = new ArrayList<>();

        int numberOfBulbs = 100;
        for (int i = 0; i < numberOfBulbs; i++) {
            String color;
            if (i % 3 == 0) {
                color = "Green";
            } else if (i % 3 == 1) {
                color = "Red";
            } else {
                color = "Blue";
            }

            initializedBulbs.add(new Bulb(color, false));
        }

        return initializedBulbs;
    }
}

