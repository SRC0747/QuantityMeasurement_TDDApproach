package quantitymeasurement;

import java.util.Objects;

/**
 * Refactoring Feet, Inch and Yard int enum Length
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 29-10-2021
 */

public class Length {

    private static final double FEET_TO_INCH = 12.0;
    private static final double YARD_TO_FEET = 3.0;
    private static final double YARD_TO_INCH = 36.0;
    private static final double INCH_TO_CENTIMETER = 2.5;

    enum Unit{ FEET, INCH, YARD, CENTIMETER };

    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * Comparing Two Entities of Same or Different Type for type Checking purpose
     * @param that object of Length
     * @return equals or not after comparing this and that entity
     */
    public boolean compare(Length that) {
        if(this.unit.equals(that.unit))
            return this.equals(that);
        //Calculate 1 Feet = 12 Inch
        if(this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value*FEET_TO_INCH, that.value) == 0;
        //Calculate 1 Yard = 3 Feet
        if(this.unit.equals(Unit.YARD) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value*YARD_TO_FEET, that.value) == 0;
        //Calculate 1 Yard = 36 Inch
        if(this.unit.equals(Unit.YARD) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value*YARD_TO_INCH, that.value) == 0;
        //Calculate 2 Inch = 5 Centimeter
        if(this.unit.equals(Unit.INCH) && that.unit.equals(Unit.CENTIMETER))
            return Double.compare(this.value*INCH_TO_CENTIMETER, that.value) == 0;
        return false;
    }

    /**
     * equals method overriding the parent class to check equality
     * @param obj of equals method
     * @return the passing parameterised object is equal or not with the given object
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Length length = (Length) obj;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}
