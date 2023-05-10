package pl.aifer.manufacture.furniture;

public class Chair extends Furniture {
    private boolean hasBackrest;
    private int seatHeight;

    @Override
    public void print() {
        String format = String.format("""
                        Chair: material is %s, price is %s, color is %s,
                        chair's seat height is %s and has %s backrest
                        """,
                getMaterial(),
                getPrice(),
                getColor(),
                seatHeight,
                hasBackrest ? "" : "not");
        System.out.println(format);
    }

    @Override
    public void assemble() {
        System.out.println("Chair was assembled");
    }

    @Override
    public void disassemble() {
        System.out.println("Chair was disassembled");
    }

    public void adjustSeatHeight() {
        System.out.println("Chair's seat height was adjusted");
    }

    public boolean isHasBackrest() {
        return hasBackrest;
    }

    public void setHasBackrest(boolean hasBackrest) {
        this.hasBackrest = hasBackrest;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
}
