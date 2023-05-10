package pl.aifer.manufacture.assembly;

import pl.aifer.manufacture.furniture.Color;
import pl.aifer.manufacture.furniture.Furniture;
import pl.aifer.manufacture.furniture.FurnitureRange;

public class AssemblyRoom {
    public static Furniture createFurniture(FurnitureRange range) {
        return switch (range) {
            case CHAIR -> new ChairBuilder()
                    .withMaterial("Wood")
                    .withColor(Color.BLACK)
                    .withPrice(100)
                    .withSeatHeight(90)
                    .hasBackrest(true)
                    .build();
            case TABLE -> new TableBuilder()
                    .withMaterial("Wood")
                    .withColor(Color.WHITE)
                    .withPrice(100)
                    .withNumberOfLegs(4)
                    .isExtendable(true)
                    .build();
            case SOFA -> new SofaBuilder()
                    .withMaterial("Wood")
                    .withColor(Color.BROWN)
                    .withPrice(100)
                    .withNumberOfSeats(4)
                    .isConvertible(false)
                    .build();
        };
    }
}
