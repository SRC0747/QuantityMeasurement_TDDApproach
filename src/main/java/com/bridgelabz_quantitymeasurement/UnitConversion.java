package com.bridgelabz_quantitymeasurement;


/**
 * Convert the different units(Length,Weight,Volume,Temparature) into baseUnit(Inch)
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 3-11-2021
 */

public interface UnitConversion {
    double convertToBaseUnit(QuantityMeasurement quantityMeasurement);
}
