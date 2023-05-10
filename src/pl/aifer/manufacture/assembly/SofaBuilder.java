package pl.aifer.manufacture.assembly;

import pl.aifer.manufacture.furniture.Color;
import pl.aifer.manufacture.furniture.Sofa;

public class SofaBuilder {
    private String material;
    private int price;
    private String color;
    private int numberOfSeats;
    private boolean isConvertible;

    public SofaBuilder withMaterial(String material) {
        this.material = material;
        return this;
    }

    public SofaBuilder withPrice(int price) {
        this.price = price;
        return this;
    }

    public SofaBuilder withColor(Color color) {
        this.color = color.name();
        return this;
    }

    public SofaBuilder withNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        return this;
    }

    public SofaBuilder isConvertible(boolean isConvertible) {
        this.isConvertible = isConvertible;
        return this;
    }

    public Sofa build() {
        var sofa = new Sofa();
        sofa.setMaterial(this.material);
        sofa.setColor(this.color);
        sofa.setPrice(this.price);
        sofa.setNumberOfSeats(this.numberOfSeats);
        sofa.setConvertible(this.isConvertible);
        return sofa;
    }
}
