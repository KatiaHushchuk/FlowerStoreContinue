package ua.edu.flower.flower.store;

public class BasketDecorator extends Item {

    private Item item;

    public BasketDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 20;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + ", in a basket";
    }
}