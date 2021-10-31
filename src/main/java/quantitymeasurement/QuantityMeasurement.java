package quantitymeasurement;

/**
 * Refactoring QuantityMeasurement by comparing same and different units and converting into baseUnit
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 31-10-2021
 */

public class QuantityMeasurement {
    private final UnitConversion unit;
    public double value;
    

    public QuantityMeasurement(UnitConversion unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(QuantityMeasurement that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        return Double.compare(this.unit.convertToBaseUnit(this), that.unit.convertToBaseUnit(that)) == 0;
    }

    /**
     * equals method overriding the parent class to check equality
     * @param that of equals method
     * @return the passing parameterised object is equal or not with the given object
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        QuantityMeasurement length = (QuantityMeasurement) that;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}
