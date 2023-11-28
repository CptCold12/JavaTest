import Investigations.*;

import java.net.URL;
import java.util.ArrayList;

public class Patient {

    private String name;
    private String patURL;
    private int age;
    private Examination[] patExams;
    private String[] examInfo;
    private MRIScan MRI;
    private BPMeasurement BP;

    public Patient(String name, int age, String patURL, MRIScan MRI, BPMeasurement BP){

        this.name = name;
        this.age = age;
        this.patURL = patURL;
        this.MRI = MRI;
        this.BP = BP;



    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPatURL() {
        return patURL;
    }

    public Examination[] getPatExams(){
        return patExams;
    }

    public ArrayList<Object> getMRIInfo(){
        ArrayList<Object> examInfoMRI = new ArrayList <Object>();
        examInfoMRI.add(MRI.getFieldStrength());
        examInfoMRI.add(MRI.getTestDate());
        examInfoMRI.add(MRI.getScanURL());
        return examInfoMRI;
    }

    public ArrayList<Object> getBPInfo(){
        ArrayList<Object> examInfoBP = new ArrayList <Object>();
        examInfoBP.add(BP.getDiastolicPressure());
        examInfoBP.add(BP.getSystolicPressure());
        examInfoBP.add(BP.getMeasurementType());
        examInfoBP.add(BP.getTestDate());
        return examInfoBP;
    }
}
