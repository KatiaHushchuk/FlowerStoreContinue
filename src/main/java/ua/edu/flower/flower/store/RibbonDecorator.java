package ua.edu.flower.flower.store;

public class RibbonDecorator extends Item {

    private Item item;

    public  RibbonDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 10;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + "Item with ribbon";
    }
    
}
