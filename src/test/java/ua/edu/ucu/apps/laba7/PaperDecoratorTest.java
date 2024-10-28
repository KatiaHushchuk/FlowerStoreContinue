package ua.edu.ucu.apps.laba7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.edu.flower.flower.store.Flower;
import ua.edu.flower.flower.store.FlowerBucket;
import ua.edu.flower.flower.store.FlowerPack;
import ua.edu.flower.flower.store.Item;
import ua.edu.flower.flower.store.PaperDecorator;

public class PaperDecoratorTest {
    @Test
    public void testGetPriceWithPaperDecorator() {
        Flower flower = new Flower();
        flower.setPrice(50.0);
        
        FlowerPack flowerPack = new FlowerPack(flower, 1);
        Item item = new Item();
        item.setFlowerBucket(new FlowerBucket());
        item.getFlowerBucket().add(flowerPack);
        
        Item decoratedItem = new PaperDecorator(item);
        
        assertEquals(57.0, decoratedItem.getPrice(), 0.01);
    }

    @Test
    public void testGetDescriptionWithPaperDecorator() {
        Flower flower = new Flower();
        flower.setPrice(50.0);
        
        FlowerPack flowerPack = new FlowerPack(flower, 1);
        Item item = new Item();
        item.setFlowerBucket(new FlowerBucket());
        item.getFlowerBucket().add(flowerPack);
        
        Item decoratedItem = new PaperDecorator(item);
        
        assertEquals("Simple Item, wrapped in paper", decoratedItem.getDescription());
    }
}
