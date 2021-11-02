package quantitymeasurement;

/**
 * Refactoring Celsius and Fahrenheit in enum Temmparature
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 2-11-2021
 */

public enum Temparature implements UnitConversion{

    CENTIGRADE(1), FAHRENHEIT(2.12);

    private final double baseUnitConversion;

    Temparature(double baseUnitConversion) {
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