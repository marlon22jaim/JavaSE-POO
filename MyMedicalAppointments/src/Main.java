import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();

        Doctor myDoctor = new Doctor("Marlon", "marlon@mail.com");
        myDoctor.addAvailableAppotintment(new Date(), "4pm");
        myDoctor.addAvailableAppotintment(new Date(), "10am");
        myDoctor.addAvailableAppotintment(new Date(), "1pm");

        // usando propiedades abstractas de la clase abstracta User
        User user = new Doctor("marliton", "correito@mail.com");
        user.showDataUser();

        User userPa = new Patient("marlitonPA", "correitoPA@mail.com");
        userPa.showDataUser();

        // clases anonimas
        User user1 = new User("artico", "artico@mail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Aun no se sabe el rol de este usuario");
            }
        };
        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };
        /*System.out.println("model.Doctor:\n" + myDoctor);*/
        /*
        for (model.Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        */
        Patient patient = new Patient("Artico", "artico@mail.com");
        /*System.out.println("\nmodel.Patient" + patient);*/


    }

}