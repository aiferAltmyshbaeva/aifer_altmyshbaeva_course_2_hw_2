package pl.aifer.manufacture.furniture;

public class Sofa extends Furniture {
    private int numberOfSeats;
    private boolean isConvertible;

    @Override
    public void print() {
        String format = String.format("""
                        Sofa: material is %s, price is %s, color is %s,
                        sofa has %s seats and is %s convertible
                        """,
                getMaterial(),
                getPrice(),
                getColor(),
                numberOfSeats,
                isConvertible ? "" : "not");
        System.out.println(format);
    }

    @Override
    public void assemble() {
        System.out.println("Sofa was assembled");
    }

    @Override
    public void disassemble() {
        System.out.println("Sofa was disassembled");
    }

    public void convert() {
        if (isConvertible) {
            System.out.println("Sofa was converted");
        }
    }

    public void recline() {
        System.out.println("Sofa's backrest was reclined");
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }
}
