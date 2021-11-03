package quantitymeasurement;

import java.util.Objects;

/**
 * Refactoring Feet, Inch and Yard in enum Length
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 3-11-2021
 */

public enum Length implements UnitConversion {

    INCH(1), CENTIMETER(1 / 2.5), FEET(12), YARD(36);

    private final double baseUnitConversion;

    Length(double baseUnitConversion){
        this.baseUnitConversion = baseUnitConversion;
    }

    /**
     * equals method overriding the parent class to check equality
     * @param quantityMeasurement of QuantityMeasurement of equals method
     * @return the value by converting into proper unit by baseUnitConversion
     */
    @Override
    public double convertToBaseUnit(QuantityMeasurement quantityMeasurement) {
        return quantityMeasurement.value * baseUnitConversion;
    }
}
