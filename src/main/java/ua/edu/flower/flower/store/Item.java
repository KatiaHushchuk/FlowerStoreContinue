package ua.edu.flower.flower.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

    private FlowerBucket flowerBucket;

    public double getPrice() {
        return flowerBucket != null ? flowerBucket.getPrice() : 0;
    }

    public String getDescription() {
        return "Simple Item";
    }
    
}
