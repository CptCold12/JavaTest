import Investigations.*;

import java.sql.Array;
import java.util.ArrayList;


public class AdminView {

    private Patient[] patientList;


    public AdminView(Patient ... patients){
        this.patientList = patients;
    }

    private ArrayList<String> concatInfo(Patient[] patientList){
        String patientListStr;
        ArrayList<String> patientListArray = new ArrayList<>();
        for (Patient patient : patientList){
            patientListStr = patient.getName() + ": MRI: " + patient.getMRIInfo().get(0) + " Tesla, " + patient.getMRIInfo().get(1) + ": BP: " + patient.getBPInfo().get(2) + ", Diastolic: " + patient.getBPInfo().get(0) + " mmHG, Systolic: " + patient.getBPInfo().get(1) + "mmHG, " + patient.getBPInfo().get(3);
            patientListArray.add(patientListStr);
            patientListStr = "";
        }
        return patientListArray;
    }

    public void dispInfo(){
        ArrayList<String> myPatientList= new ArrayList<String>(concatInfo(patientList));
        for(int i = 0; i < myPatientList.size(); i++){
            System.out.println(myPatientList.get(i));
        }
    }


}
