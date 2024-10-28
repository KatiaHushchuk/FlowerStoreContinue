package ua.edu.ucu.apps.laba7;

import org.junit.jupiter.api.Test;

import ua.edu.flower.flower.store.Flower;
import ua.edu.flower.flower.store.FlowerBucket;
import ua.edu.flower.flower.store.FlowerPack;
import ua.edu.flower.flower.store.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {

    @Test
    public void testGetPriceWithFlowerBucket() {
        Flower flower = new Flower();
        flower.setPrice(50.0);

        FlowerPack flowerPack = new FlowerPack(flower, 2);
       
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
        
        Item item = new Item();
        item.setFlowerBucket(flowerBucket);
        
        assertEquals(100.0, item.getPrice(), 0.01);
    }

    @Test
    public void testGetPriceWithoutFlowerBucket() {
        Item item = new Item();
        assertEquals(0.0, item.getPrice(), 0.01);
    }

    @Test
    public void testGetDescription() {
        Item item = new Item();
        assertEquals("Simple Item", item.getDescription());
    }
    
}
