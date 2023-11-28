package Investigations;

import java.time.LocalDate;

public class BPMeasurement extends Examination{

    private int systolicPressure;
    private int diastolicPressure;
    private String measurementType;

    public BPMeasurement(int year, int month, int dayOfMonth, int systolicPressure, int diastolicPressure, String measurementType){
        super(year, month, dayOfMonth);
        this.measurementType = measurementType;
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
    }

    public String getDiastolicPressure() {
        return Integer.toString(diastolicPressure);
    }

    public String getMeasurementType() {
        return measurementType;
    }

    public String getSystolicPressure() {
        return Integer.toString(systolicPressure);
    }
}
