package compare;

import compare.unit.VolumeUnit;

//adds 2 Volume
public class Volume extends Measurement<Volume,VolumeUnit> {
    public Volume(double value, VolumeUnit unit) {
        super(value, unit);
    }

    @Override
    protected Volume createMeasurement(double sum, VolumeUnit resultUnit) {
        return new Volume(resultUnit.convertToThisUnit(sum), resultUnit);
    }
}
