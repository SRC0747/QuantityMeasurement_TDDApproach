package quantitymeasurement;


/**
 * Inch class to convert entity int inch unit
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 31-10-2021
 */

public class Inch {
    private final double value;

    public Inch(double value) {
        this.value = value;
    }

    /**
     * equals method overriding the parent class to check equality
     * @param obj of equals method
     * @return the passing parameterised object is equal or not with the given object
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Inch inch = (Inch) obj;
        return Double.compare(inch.value,value) == 0;
    }
}
