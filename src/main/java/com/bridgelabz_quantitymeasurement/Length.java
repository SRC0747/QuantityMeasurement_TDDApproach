package com.bridgelabz_quantitymeasurement;

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
     * convertToBaseUnit is used to convert the given unit length into baseUnit(INCH)
     * @param quantityMeasurement
     * @return value after converting into baseUnit
     */
    @Override
    public double convertToBaseUnit(QuantityMeasurement quantityMeasurement) {
        return quantityMeasurement.value * baseUnitConversion;
    }
}
