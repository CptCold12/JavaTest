package Investigations;

import java.net.URL;

public class MRIScan extends Examination{

    private String scanURL;
    private int fieldStrength;

    public MRIScan(int year, int month, int dayOfMonth, String scanURL, int fieldStrength){
        super(year, month, dayOfMonth);
        this.scanURL = scanURL;
        this.fieldStrength = fieldStrength;

    }

    public String getFieldStrength() {
        String fieldStrengthStr = Integer.toString(fieldStrength);
        return fieldStrengthStr;
    }

    public String getScanURL() {
        return scanURL;
    }

}
