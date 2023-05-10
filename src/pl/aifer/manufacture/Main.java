package pl.aifer.manufacture;

import pl.aifer.manufacture.assembly.AssemblyRoom;
import pl.aifer.manufacture.furniture.FurnitureRange;
import pl.aifer.manufacture.furniture.Printable;

public class Main {
    public static void main(String[] args) {
        Printable[] furnitureArray = createFurnitureArray();
        printInfo(furnitureArray);
    }

    private static Printable[] createFurnitureArray() {
        return createFurnitureByRange(FurnitureRange.CHAIR, FurnitureRange.TABLE, FurnitureRange.SOFA);
    }

    private static Printable[] createFurnitureByRange(FurnitureRange... furnitureRanges) {
        Printable[] furnitureArray = new Printable[furnitureRanges.length];
        for (int i = 0; i < furnitureRanges.length; i++) {
            furnitureArray[i] = AssemblyRoom.createFurniture(furnitureRanges[i]);
        }
        return furnitureArray;
    }

    private static void printInfo(Printable[] furnitureArray) {
        for (Printable item : furnitureArray) {
            item.print();
        }
    }
}