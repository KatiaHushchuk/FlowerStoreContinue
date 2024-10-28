package ua.edu.flower.flower.store;

public class PaperDecorator extends Item {

    private Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 7;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + ", wrapped in paper";
    }
}
