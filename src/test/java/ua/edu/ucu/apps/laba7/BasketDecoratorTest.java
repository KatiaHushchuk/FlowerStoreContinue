package ua.edu.ucu.apps.laba7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ua.edu.flower.flower.store.BasketDecorator;
import ua.edu.flower.flower.store.Flower;
import ua.edu.flower.flower.store.FlowerBucket;
import ua.edu.flower.flower.store.FlowerPack;
import ua.edu.flower.flower.store.Item;

public class BasketDecoratorTest {
    @Test
    public void testGetPriceWithBasketDecorator() {

        Flower flower = new Flower();
        flower.setPrice(50.0);
        
        FlowerPack flowerPack = new FlowerPack(flower, 1);
        Item item = new Item();
        item.setFlowerBucket(new FlowerBucket());
        item.getFlowerBucket().add(flowerPack);
        
        Item decoratedItem = new BasketDecorator(item);
        assertEquals(70.0, decoratedItem.getPrice(), 0.01);
    }

    @Test
    public void testGetDescriptionWithBasketDecorator() {
        Flower flower = new Flower();
        flower.setPrice(50.0);
        
        FlowerPack flowerPack = new FlowerPack(flower, 1);
        Item item = new Item();
        item.setFlowerBucket(new FlowerBucket());
        item.getFlowerBucket().add(flowerPack);
        
        Item decoratedItem = new BasketDecorator(item);
        assertEquals("Simple Item, in a basket", decoratedItem.getDescription());
    }
    
}
