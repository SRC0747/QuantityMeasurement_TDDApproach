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
    public void given5CmAnd2Inch_WhenCompared_ShouldReturnEqualLength() {
        QuantityMeasurement centimeter = new QuantityMeasurement(Length.CENTIMETER, 5.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
        boolean compareCheck = centimeter.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement expected_SumResult = new QuantityMeasurement(Length.INCH, 4.0);
        QuantityMeasurement actual_SumResult = inch1.sumOfQuantity(inch2, Length.INCH);
        Assertions.assertEquals(expected_SumResult, actual_SumResult);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        QuantityMeasurement feet = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement expectedSum = new QuantityMeasurement(Length.INCH, 14.0);
        QuantityMeasurement actualSum = feet.sumOfQuantity(inch, Length.INCH);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Length.FEET, 1.0);
        QuantityMeasurement expectedSum = new QuantityMeasurement(Length.INCH, 24.0);
        QuantityMeasurement actualSum = feet1.sumOfQuantity(feet2, Length.INCH);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given2InchAnd2$5Cm_WhenAdded_ShouldReturn3Inch() {
        QuantityMeasurement inch = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(Length.CENTIMETER, 2.5);
        QuantityMeasurement expected_SumOutput = new QuantityMeasurement(Length.INCH, 3.0);
        QuantityMeasurement actual_SumOutput = inch.sumOfQuantity(centimeter, Length.INCH);
        Assertions.assertEquals(expected_SumOutput, actual_SumOutput);
    }

    @Test
    public void given0GallonAnd0Gallon_ShouldReturnEqualVolume() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonAnd1Gallon_ShouldReturnNotEqualVolume() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonAndNull_ShouldReturnNotEqualVolume() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
        QuantityMeasurement gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void given0GallonAnd0GallonFromDiffRef_ShouldReturnNotSameRef() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Volume.GALLON, 0.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Volume.GALLON, 0.0);
        Assertions.assertNotSame(gallon1, gallon2);
    }

    @Test
    public void given0LitreAnd0Litre_ShouldReturnEqualVolume() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITER, 0.0);
        QuantityMeasurement litre2 = new QuantityMeasurement(Volume.LITER, 0.0);
        Assertions.assertEquals(litre1, litre2);
    }

    @Test
    public void given0LitreAnd1Litre_ShouldReturnNotEqualVolume() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITER, 0.0);
        QuantityMeasurement litre2 = new QuantityMeasurement(Volume.LITER, 1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void given0LitreAndNull_ShouldReturnNotEqualVolume() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITER, 0.0);
        QuantityMeasurement litre2 = null;
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void given0LitreAnd0LitreFromDiffRef_ShouldReturnNotSameRef() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Volume.LITER, 0.0);
        QuantityMeasurement litre2 = new QuantityMeasurement(Volume.LITER, 0.0);
        Assertions.assertNotSame(litre1, litre2);
    }

    @Test
    public void given0GallonAnd0Liter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 0.0);
        QuantityMeasurement liter = new QuantityMeasurement(Volume.LITER, 0.0);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd1Liter_WhenCompared_ShouldReturnNotEqualVolume() {
        QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
        QuantityMeasurement liter = new QuantityMeasurement(Volume.LITER, 1.0);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1GallonAnd3$78Liter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
        QuantityMeasurement liter = new QuantityMeasurement(Volume.LITER, 3.78);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given3$78LiterAnd1Gallon_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurement liter = new QuantityMeasurement(Volume.LITER, 3.78);
        QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
        boolean compareCheck = liter.compare(gallon);
        Assertions.assertTrue(compareCheck);
    }


    @Test
    public void given1LiterAnd1000MilliLiter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurement liter = new QuantityMeasurement(Volume.LITER, 1.0);
        QuantityMeasurement ml = new QuantityMeasurement(Volume.MILLI_LITER, 1000.0);
        boolean compareCheck = liter.compare(ml);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1000MilliLiterAnd1Liter_WhenCompared_ShouldReturnEqualVolume() {
        QuantityMeasurement ml = new QuantityMeasurement(Volume.MILLI_LITER, 1000.0);
        QuantityMeasurement liter = new QuantityMeasurement(Volume.LITER, 1.0);
        boolean compareCheck = ml.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3$78Liter_WhenAdded_ShouldReturn7$56Liter() {
        QuantityMeasurement gallon = new QuantityMeasurement(Volume.GALLON, 1.0);
        QuantityMeasurement liter = new QuantityMeasurement(Volume.LITER, 3.78);
        QuantityMeasurement expected_SumResult = new QuantityMeasurement(Volume.LITER, 7.56);
        QuantityMeasurement actual_SumResult = gallon.sumOfQuantity(liter, Volume.LITER);
        Assertions.assertEquals(expected_SumResult, actual_SumResult);
    }

    @Test
    public void given1LiterAnd1000MilliLiter_WhenAdded_ShouldReturn2Liter() {
        QuantityMeasurement liter = new QuantityMeasurement(Volume.LITER, 1.0);
        QuantityMeasurement milliliter = new QuantityMeasurement(Volume.MILLI_LITER, 1000.0);
        QuantityMeasurement expected_SumResult = new QuantityMeasurement(Volume.LITER, 2.0);
        QuantityMeasurement actual_SumResult = liter.sumOfQuantity(milliliter, Volume.LITER);
        Assertions.assertEquals(expected_SumResult, actual_SumResult);
    }

    @Test
    public void given0GramAnd0Gram_ShouldReturnEqualWeight() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Weight.GRAM, 0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    public void given0GramAnd1Gram_ShouldReturnNotEqualWeight() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Weight.GRAM, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given0GramAndNull_ShouldReturnNotEqualWeight() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement gram2 = null;
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given0GramAnd0GramFromDiffRef_ShouldReturnNotEqualWeight() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Weight.GRAM, 0.0);
        Assertions.assertNotSame(gram1, gram2);
    }

    @Test
    public void given0KilogramAnd0Kilogram_ShouldReturnEqualWeight() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.KILOGRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Weight.KILOGRAM, 0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    public void given0KilogramAnd1Kilogram_ShouldReturnNotEqualWeight() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.KILOGRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Weight.KILOGRAM, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given0KilogramAndNull_ShouldReturnNotEqualWeight() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.KILOGRAM, 0.0);
        QuantityMeasurement gram2 = null;
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void given0KilogramAnd0KilogramFromDiffRef_ShouldReturnNotEqualWeight() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Weight.KILOGRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Weight.KILOGRAM, 0.0);
        Assertions.assertNotSame(gram1, gram2);
    }

    @Test
    public void given0TonneAnd0Tonne_ShouldReturnEqualWeight() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Weight.TONNE, 0.0);
        QuantityMeasurement tonne2 = new QuantityMeasurement(Weight.TONNE, 0.0);
        Assertions.assertEquals(tonne1, tonne2);
    }

    @Test
    public void given0TonneAnd1Tonne_ShouldReturnNotEqualWeight() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Weight.TONNE, 0.0);
        QuantityMeasurement tonne2 = new QuantityMeasurement(Weight.TONNE, 1.0);
        Assertions.assertNotEquals(tonne1, tonne2);
    }


    @Test
    public void given0TonneAndNull_ShouldReturnNotEqualWeight() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Weight.TONNE, 0.0);
        QuantityMeasurement tonne2 = null;
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    @Test
    public void given0TonneAnd0TonneFromDiffRef_ShouldReturnNotEqualWeight() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Weight.TONNE, 0.0);
        QuantityMeasurement tonne2 = new QuantityMeasurement(Weight.TONNE, 0.0);
        Assertions.assertNotSame(tonne1, tonne2);
    }

    @Test
    public void given0KilogramAnd0Gram_WhenCompared_ShouldReturnEqualWeight() {
        QuantityMeasurement kilogram = new QuantityMeasurement(Weight.KILOGRAM, 0.0);
        QuantityMeasurement gram = new QuantityMeasurement(Weight.GRAM, 0.0);
        boolean compareCheck = kilogram.compare(gram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1KilogramAnd1Gram_WhenCompared_ShouldReturnNotEqualWeight() {
        QuantityMeasurement kilogram = new QuantityMeasurement(Weight.KILOGRAM, 1.0);
        QuantityMeasurement gram = new QuantityMeasurement(Weight.GRAM, 1.0);
        boolean compareCheck = kilogram.compare(gram);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given0KilogramAnd0Tonne_WhenCompared_ShouldReturnEqualWeight() {
        QuantityMeasurement kilogram = new QuantityMeasurement(Weight.KILOGRAM, 0.0);
        QuantityMeasurement tonne = new QuantityMeasurement(Weight.TONNE, 0.0);
        boolean compareCheck = kilogram.compare(tonne);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1KilogramAnd1Tonne_WhenCompared_ShouldReturnNotEqualWeight() {
        QuantityMeasurement kilogram = new QuantityMeasurement(Weight.KILOGRAM, 1.0);
        QuantityMeasurement tonne = new QuantityMeasurement(Weight.TONNE, 1.0);
        boolean compareCheck = kilogram.compare(tonne);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given0GramAnd0Tonne_WhenCompared_ShouldReturnEqualWeight() {
        QuantityMeasurement gram = new QuantityMeasurement(Weight.GRAM, 0.0);
        QuantityMeasurement tonne = new QuantityMeasurement(Weight.TONNE, 0.0);
        boolean compareCheck = gram.compare(tonne);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1GramAnd1Tonne_WhenCompared_ShouldReturnNotEqualWeight() {
        QuantityMeasurement gram = new QuantityMeasurement(Weight.GRAM, 1.0);
        QuantityMeasurement tonne = new QuantityMeasurement(Weight.TONNE, 1.0);
        boolean compareCheck = gram.compare(tonne);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1KilogramAnd1000Gram_WhenCompared_ShouldReturnEqualWeight() {
        QuantityMeasurement kilogram = new QuantityMeasurement(Weight.KILOGRAM, 1.0);
        QuantityMeasurement gram = new QuantityMeasurement(Weight.GRAM, 1000.0);
        boolean compareCheck = kilogram.compare(gram);
        Assertions.assertTrue(compareCheck);
    }


    @Test
    public void given1000GramAnd1Kilogram_WhenCompared_ShouldReturnEqualWeight() {
        QuantityMeasurement gram = new QuantityMeasurement(Weight.GRAM, 1000.0);
        QuantityMeasurement kilogram = new QuantityMeasurement(Weight.KILOGRAM, 1.0);
        boolean compareCheck = gram.compare(kilogram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Kilogram_WhenCompared_ShouldReturnEqualWeight() {
        QuantityMeasurement tonne = new QuantityMeasurement(Weight.TONNE, 1.0);
        QuantityMeasurement kilogram = new QuantityMeasurement(Weight.KILOGRAM, 1000.0);
        boolean compareCheck = tonne.compare(kilogram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1000KilogramAnd1Tonne_WhenCompared_ShouldReturnEqualWeight() {
        QuantityMeasurement kilogram = new QuantityMeasurement(Weight.KILOGRAM, 1000.0);
        QuantityMeasurement tonne = new QuantityMeasurement(Weight.TONNE, 1.0);
        boolean compareCheck = kilogram.compare(tonne);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Gram_WhenAdded_ShouldReturn1001KG() {
        QuantityMeasurement tonne = new QuantityMeasurement(Weight.TONNE, 1.0);
        QuantityMeasurement gram = new QuantityMeasurement(Weight.GRAM, 1000.0);
        QuantityMeasurement expected_SumResult = new QuantityMeasurement(Weight.KILOGRAM, 1001.0);
        QuantityMeasurement actual_SumResult = tonne.sumOfQuantity(gram, Weight.KILOGRAM);
        Assertions.assertEquals(expected_SumResult, actual_SumResult);
    }

    @Test
    public void given0DegCAnd0DegC_ShouldReturnEqualTemperature() {
        QuantityMeasurement centigrade1 = new QuantityMeasurement(Temparature.CENTIGRADE, 0.0);
        QuantityMeasurement centigrade2 = new QuantityMeasurement(Temparature.CENTIGRADE, 0.0);
        Assertions.assertEquals(centigrade1, centigrade2);
    }

    @Test
    public void given0DegCAnd1DegC_ShouldReturnNotEqualTemperature() {
        QuantityMeasurement centigrade1 = new QuantityMeasurement(Temparature.CENTIGRADE, 0.0);
        QuantityMeasurement centigrade2 = new QuantityMeasurement(Temparature.CENTIGRADE, 1.0);
        Assertions.assertNotEquals(centigrade1, centigrade2);
    }
}