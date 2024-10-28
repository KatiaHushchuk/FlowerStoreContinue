package ua.edu.ucu.apps.laba7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.edu.flower.flower.store.Flower;
import ua.edu.flower.flower.store.FlowerBucket;
import ua.edu.flower.flower.store.FlowerPack;
import ua.edu.flower.flower.store.Item;
import ua.edu.flower.flower.store.RibbonDecorator;

public class RibbonDecoratorTest {
    @Test
    public void testGetPriceWithRibbonDecorator() {
        Flower flower = new Flower();
        flower.setPrice(50.0);
        
        FlowerPack flowerPack = new FlowerPack(flower, 1);
        Item item = new Item();
        item.setFlowerBucket(new FlowerBucket());
        item.getFlowerBucket().add(flowerPack);
        
        Item decoratedItem = new RibbonDecorator(item);
        
        assertEquals(60.0, decoratedItem.getPrice(), 0.01);
    }

    @Test
    public void testGetDescriptionWithRibbonDecorator() {
        Flower flower = new Flower();
        flower.setPrice(50.0);
        
        FlowerPack flowerPack = new FlowerPack(flower, 1);
        Item item = new Item();
        item.setFlowerBucket(new FlowerBucket());
        item.getFlowerBucket().add(flowerPack);
        
        Item decoratedItem = new RibbonDecorator(item);
        
        assertEquals("Simple ItemItem with ribbon", decoratedItem.getDescription());
    }
    
}
