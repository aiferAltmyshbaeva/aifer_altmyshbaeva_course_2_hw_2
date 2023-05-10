package pl.aifer.manufacture.furniture;

public class Table extends Furniture {
    private int numberOfLegs;
    private boolean isExtendable;

    @Override
    public void print() {
        String format = String.format("""
                        Table: material is %s, price is %s, color is %s,
                        table has %s legs and is %s extendable
                        """,
                getMaterial(),
                getPrice(),
                getColor(),
                numberOfLegs,
                isExtendable ? "" : "not");
        System.out.println(format);
    }

    @Override
    public void assemble() {
        System.out.println("Table was assembled");
    }

    @Override
    public void disassemble() {
        System.out.println("Table was disassembled");
    }

    public void extend() {
        if (isExtendable) {
            System.out.println("Table was extended");
        }
    }

    public void collapse() {
        if (isExtendable) {
            System.out.println("Table was collapsed");
        }
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isExtendable() {
        return isExtendable;
    }

    public void setExtendable(boolean extendable) {
        isExtendable = extendable;
    }
}
