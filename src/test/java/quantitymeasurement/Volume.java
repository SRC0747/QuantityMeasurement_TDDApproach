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
     * convertToBaseUnit is used to convert the given unit length into baseUnit(MILLI_LITER)
     * @param quantityMeasurement
     * @return value after converting into baseUnit
     */
    @Override
    public double convertToBaseUnit(QuantityMeasurement quantityMeasurement) {
        return quantityMeasurement.value * baseUnitConversion;
    }
}
