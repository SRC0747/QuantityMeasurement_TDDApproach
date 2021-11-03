package quantitymeasurement;

/**
 * Refactoring gallon, litre and millilitre in enum Volume
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 3-11-2021
 */

public enum Volume implements UnitConversion{
    MILLI_LITER(0.001), LITER(1), GALLON(3.78);

    private final double baseUnitConversion;

    Volume(double baseUnitConversion) {
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
