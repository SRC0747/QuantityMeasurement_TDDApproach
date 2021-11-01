package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNull_ShouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd0FeetFromDiffRef_ShouldReturnNotSameRef() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET, 0.0);
        Assertions.assertNotSame(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNull_ShouldReturnNotEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd0InchFromDiffRef_ShouldReturnNotSameRef() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH, 0.0);
        Assertions.assertNotSame(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 1.0);
        Assertions.assertNotEquals(feet1, inch1);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0FeetAnd1Inch_ShouldReturnNotEqualLength() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqualLength() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given12InchAnd1Feet_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 12.0);
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0YardAnd0Yard_ShouldReturnEqual() {
       QuantityMeasurement yard1 = new QuantityMeasurement(Length.YARD, 0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(Length.YARD, 0.0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    public void given0YardAnd1Yard_ShouldReturnNotEqual() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Length.YARD, 0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(Length.YARD, 1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0YardAndNull_ShouldReturnNotEqual() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Length.YARD, 0.0);
        QuantityMeasurement yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0YardAnd0YardFromDiffRef_ShouldReturnNotSameRef() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Length.YARD, 0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(Length.YARD, 0.0);
        Assertions.assertNotSame(yard1, yard2);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnTrue() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 3.0);
        QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnTrue() {
        QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnNotEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }


    @Test
    public void given1InchAnd1Yard_ShouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 1.0);
        QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnTrue() {
        QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnTrue() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 36.0);
        QuantityMeasurement yard = new QuantityMeasurement(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0CentimeterAnd0Centimeter_ShouldReturnEqual() {
        QuantityMeasurement centimeter1 = new QuantityMeasurement(Length.CENTIMETER, 0.0);
        QuantityMeasurement centimeter2 = new QuantityMeasurement(Length.CENTIMETER, 0.0);
        Assertions.assertEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimeterAnd1Centimeter_ShouldReturnNotEqual() {
        QuantityMeasurement centimeter1 = new QuantityMeasurement(Length.CENTIMETER, 0.0);
        QuantityMeasurement centimeter2 = new QuantityMeasurement(Length.CENTIMETER, 1.0);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimeterAndNull_ShouldReturnNotEqual() {
        QuantityMeasurement centimeter1 = new QuantityMeasurement(Length.CENTIMETER, 0.0);
        QuantityMeasurement centimeter2 = null;
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimeterAnd0CentimeterFromDiffRef_ShouldReturnNotSameRef() {
        QuantityMeasurement centimeter1 = new QuantityMeasurement(Length.CENTIMETER, 0.0);
        QuantityMeasurement centimeter2 = new QuantityMeasurement(Length.CENTIMETER, 0.0);
        Assertions.assertNotSame(centimeter1, centimeter2);
    }

    @Test
    public void given1InchAnd1Centimeter_ShouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 1.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(Length.CENTIMETER, 1.0);
        Assertions.assertNotEquals(inch, centimeter);
    }

    @Test
    public void given0InchAnd0Centimeter_ShouldReturnEqualLength() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(Length.CENTIMETER, 0.0);
        Assertions.assertEquals(inch, centimeter);
    }

    @Test
    public void given0InchAnd1Centimeter_ShouldReturnNotEqualLength() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(Length.CENTIMETER, 1.0);
        Assertions.assertNotEquals(inch, centimeter);
    }

    @Test
    public void given1InchAnd1Centimeter_ShouldReturnNotEqualLength() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 1.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(Length.CENTIMETER, 1.0);
        boolean compareCheck = inch.compare(centimeter);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given2InchAnd5Centimeter_ShouldReturnEqualLength() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(Length.CENTIMETER, 5.0);
        boolean compareCheck = inch.compare(centimeter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given5CmAnd2Inch_WhenCompared_ShouldReturnEqualLength() {
        QuantityMeasurement centimeter = new QuantityMeasurement(Length.CENTIMETER, 5.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
        boolean compareCheck = centimeter.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement expected_SumResult = new QuantityMeasurement(Length.INCH, 4.0);
        QuantityMeasurement actual_SumResult = inch1.sumOfQuantity(inch2, Length.INCH);
        Assertions.assertEquals(expected_SumResult, actual_SumResult);
    }

    @Test
    void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement expectedSum = new QuantityMeasurement(Length.INCH, 14.0);
        QuantityMeasurement actualSum = feet.sumOfQuantity(inch, Length.INCH);
        Assertions.assertEquals(expectedSum, actualSum);
    }
}