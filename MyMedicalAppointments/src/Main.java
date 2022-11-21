import java.util.Date;

import static ui.UiMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();

        Doctor myDoctor = new Doctor("Marlon", "marlon@mail.com");
        myDoctor.addAvailableAppotintment(new Date(), "4pm");
        myDoctor.addAvailableAppotintment(new Date(), "10am");
        myDoctor.addAvailableAppotintment(new Date(), "1pm");

        System.out.println("Doctor:\n" + myDoctor);
        /*
        for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        */
        Patient patient = new Patient("Artico", "artico@mail.com");
        System.out.println("\nPatient" + patient);


    }

}