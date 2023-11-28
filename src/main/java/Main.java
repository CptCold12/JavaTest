import Investigations.*;

public class Main {
    public static void main(String[] args) {
        MRIScan MRI1 = new MRIScan(2023, 9, 14, "https://martinh.netfirms.com/BIOE60010/mri1.jpg", 2 );
        BPMeasurement BP1 = new BPMeasurement(2023,9,15,130,70,"ST");
        MRIScan MRI2 = new MRIScan(2023,11,19, "https://martinh.netfirms.com/BIOE60010/mri2.jpg", 4);
        BPMeasurement BP2 = new BPMeasurement(2023,11,20,150,80,"VST");

        Patient patient1 = new Patient("Daphne Von Oram", 62, "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg",MRI1, BP1);
        Patient patient2 = new Patient("Sebastian Crompton", 31, "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg", MRI2, BP2);

        AdminView admin1 = new AdminView(patient1, patient2);
        admin1.dispInfo();

        DoctorView doctor1 = new DoctorView(patient1);
        doctor1.CreateUI(patient1);

    }

}
