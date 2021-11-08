package com.bridgelabz_quantitymeasurement;

/**
 * Refactoring gallon, litre and millilitre in enum Weight
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 3-11-2021
 */

public enum Weight implements UnitConversion{
    GRAM(0.001), KILOGRAM(1), TONNE(1000);

    private final double baseUnitConversion;

    Weight(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    /**
     * convertToBaseUnit is used to convert the given unit length into baseUnit(GRAM)
     * @param quantityMeasurement
     * @return value after converting into baseUnit
     */
    @Override
    public double convertToBaseUnit(QuantityMeasurement quantityMeasurement) {
        return quantityMeasurement.value * baseUnitConversion;
    }
}
