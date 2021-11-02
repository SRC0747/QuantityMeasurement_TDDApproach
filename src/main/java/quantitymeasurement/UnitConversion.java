package quantitymeasurement;


/**
 * Creating Interface to convert the feet,centimeter and yard int baseUnit(Inch)
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 31-10-2021
 */

public interface UnitConversion {
    double convertToBaseUnit(QuantityMeasurement quantityMeasurement);
}
