import java.util.Date;

import static ui.UiMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();

        Doctor myDoctor = new Doctor("Marlon", "Tegnología");
        myDoctor.addAvailableAppotintment(new Date(), "4pm");
        myDoctor.addAvailableAppotintment(new Date(), "10am");
        myDoctor.addAvailableAppotintment(new Date(), "1pm");

        for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        Patient patient = new Patient("Artico", "artico@hotmail.com");
        Patient patient2 = new Patient("Marlon", "marlon@hotmail.com");


    }

}