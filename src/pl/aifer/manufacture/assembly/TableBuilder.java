package pl.aifer.manufacture.assembly;

import pl.aifer.manufacture.furniture.Color;
import pl.aifer.manufacture.furniture.Table;

public class TableBuilder {
    private String material;
    private int price;
    private String color;
    private int numberOfLegs;
    private boolean isExtendable;

    public TableBuilder withMaterial(String material) {
        this.material = material;
        return this;
    }

    public TableBuilder withPrice(int price) {
        this.price = price;
        return this;
    }

    public TableBuilder withColor(Color color) {
        this.color = color.name();
        return this;
    }

    public TableBuilder withNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
        return this;
    }

    public TableBuilder isExtendable(boolean isExtendable) {
        this.isExtendable = isExtendable;
        return this;
    }

    public Table build() {
        var table = new Table();
        table.setMaterial(this.material);
        table.setColor(this.color);
        table.setPrice(this.price);
        table.setExtendable(this.isExtendable);
        table.setNumberOfLegs(this.numberOfLegs);
        return table;
    }
}
