package pl.aifer.manufacture.assembly;

import pl.aifer.manufacture.furniture.Chair;
import pl.aifer.manufacture.furniture.Color;

public class ChairBuilder {
    private String material;
    private int price;
    private String color;
    private boolean hasBackrest;
    private int seatHeight;

    public ChairBuilder withMaterial(String material) {
        this.material = material;
        return this;
    }

    public ChairBuilder withPrice(int price) {
        this.price = price;
        return this;
    }

    public ChairBuilder withColor(Color color) {
        this.color = color.name();
        return this;
    }

    public ChairBuilder hasBackrest(boolean hasBackrest) {
        this.hasBackrest = hasBackrest;
        return this;
    }

    public ChairBuilder withSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
        return this;
    }

    public Chair build() {
        var chair = new Chair();
        chair.setMaterial(this.material);
        chair.setHasBackrest(this.hasBackrest);
        chair.setColor(this.color);
        chair.setPrice(this.price);
        chair.setSeatHeight(this.seatHeight);
        return chair;
    }
}
