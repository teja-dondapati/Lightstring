// BulbService.java

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BulbService {
    private List<Bulb> bulbs;

    public BulbService() {
        // Initialize bulbs with 100 bulbs in the required pattern
        // ...

        // For simplicity, assuming the bulbs list is initialized with the required pattern
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
}
