package compare.unit;

public interface MeasurementUnit {
    double convertToBase(double value);

    double convertToThisUnit(double value);
}
