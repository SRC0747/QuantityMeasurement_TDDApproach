package com.bridgelabz_quantitymeasurement;

/**
 * Calculate relation of Temparature(Centigrade and Fahrenheit) and convert into baseUnit(Centigrade)
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 3-11-2021
 */

public enum Temparature implements UnitConversion{

    CENTIGRADE(1), FAHRENHEIT(2.12);

    private final double baseUnitConversion;

    Temparature(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    /**
     * convertToBaseUnit is used to convert the given unit length into baseUnit(CENTIGRADE)
     * @param quantityMeasurement
     * @return value after converting into baseUnit
     */
    @Override
    public double convertToBaseUnit(QuantityMeasurement quantityMeasurement) {
        return quantityMeasurement.value * baseUnitConversion;
    }
}
