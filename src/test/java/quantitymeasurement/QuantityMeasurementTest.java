package quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test Cases to check the Equality, Nulity and Reference Check and Comparing Same and different entities and Calculate Feet_To_Inch,Feet_To_Yard and Yard_To_Inch conversions.
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 29-10-2021
 */

class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNull_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd0FeetFromDiffRef_ShouldReturnNotSameRef() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assertions.assertNotSame(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNull_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd0InchFromDiffRef_ShouldReturnNotSameRef() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        Assertions.assertNotSame(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Assertions.assertNotEquals(feet1, inch1);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        boolean compareCheckLength = feet1.compare(inch1);
        Assertions.assertTrue(compareCheckLength);
    }

    @Test
    public void given0FeetAnd1Inch_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheckLength = feet1.compare(inch1);
        Assertions.assertFalse(compareCheckLength);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheckLength = feet1.compare(inch1);
        Assertions.assertFalse(compareCheckLength);
    }

    @Test
    public void given1FeetAnd12Inch_ShouldReturnEqual() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0YardAnd0Yard_ShouldReturnEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = new Length(Length.Unit.YARD, 0.0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    public void given0YardAnd0Yard_ShouldReturnNotEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = new Length(Length.Unit.YARD, 1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0YardAndNull_ShouldReturnNotEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0YardAnd0YardFromDiffRef_ShouldReturnNotSameRef() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = new Length(Length.Unit.YARD, 0.0);
        Assertions.assertNotSame(yard1, yard2);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET, 3.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnNotEqual() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertFalse(compareCheck);
    }


    @Test
    public void given1InchAnd1Yard_ShouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnTrue() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length inch = new Length(Length.Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0CentimeterAnd0Centimeter_ShouldReturnEqual() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length centimeter2 = new Length(Length.Unit.CENTIMETER, 0.0);
        Assertions.assertEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimeterAnd1Centimeter_ShouldReturnNotEqual() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length centimeter2 = new Length(Length.Unit.CENTIMETER, 1.0);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimeterAndNull_ShouldReturnNotEqual() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length centimeter2 = null;
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    public void given0CentimeterAnd0CentimeterFromDiffRef_ShouldReturnNotSameRef() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length centimeter2 = new Length(Length.Unit.CENTIMETER, 0.0);
        Assertions.assertNotSame(centimeter1, centimeter2);
    }

    @Test
    public void given1InchAnd1Centimeter_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 1.0);
        Assertions.assertNotEquals(inch1, centimeter1);
    }

    @Test
    public void given0InchAnd0Centimeter_ShouldReturnEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        boolean compareCheckLength = inch1.compare(centimeter1);
        Assertions.assertTrue(compareCheckLength);
    }

    @Test
    public void given0InchAnd1Centimeter_ShouldReturnNotEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 1.0);
        boolean compareCheckLength = inch1.compare(centimeter1);
        Assertions.assertFalse(compareCheckLength);
    }

    @Test
    public void given1InchAnd1Centimeter_ShouldReturnNotEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 1.0);
        boolean compareCheckLength = inch1.compare(centimeter1);
        Assertions.assertFalse(compareCheckLength);
    }
}