package quantitymeasurement;


/**
 * Refactoring gallon, litre and millilitre in enum Weight
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 2-11-2021
 */

public enum Weight implements UnitConversion{
    GRAM(0.001), KILOGRAM(1), TONNE(1000);

    private final double baseUnitConversion;

    Weight(double baseUnitConversion) {
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
