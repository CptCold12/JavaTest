import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class DoctorView {
    private Patient[] patientList;
    public DoctorView(Patient ... patients){
        this.patientList = patients;
    }

    public void CreateUI(Patient patientL){
        JFrame frame = new JFrame("My Frame");
        frame.setSize(800,800);
        frame.setLayout(new BorderLayout());
        JLabel label = new JLabel();
        URL imageURL=null;
        for (Patient patient : patientList) {
            try {
                imageURL = new URL(patient.getPatURL());
            } catch (MalformedURLException e) {
                System.out.println(e.getMessage());
            }
            ImageIcon thisImageIcon = new ImageIcon(imageURL);
            label.setIcon(thisImageIcon);



        }
        frame.add(label);
        JLabel textLabel = new JLabel("<html>"+patientList[0].getName()+"<br>"+patientList[0].getAge()+"<br> MRI (Tesla): "+patientList[0].getMRIInfo().get(0)+"</html>");
        frame.add(textLabel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }


}
