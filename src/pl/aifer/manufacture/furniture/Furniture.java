package pl.aifer.manufacture.furniture;

public abstract class Furniture implements Printable {
    private String material;
    private int price;
    private String color;

    public abstract void assemble();

    public abstract void disassemble();

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
