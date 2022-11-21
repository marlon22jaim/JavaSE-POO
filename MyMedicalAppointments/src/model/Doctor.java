package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributos
    private String speciality;

    // Constructor
    public Doctor(String name, String email) {
        super(name, email);
        System.out.println("El nombre del doctor asignado es: " + name);

    }

    // Getters y setters
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Comportamientos
    //creamos una lista de tipo AvailableAppointment (es un objeto que tiene atributos)
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    /**
     * Descripción: addAvailableAppotintment Metodo que pide 2 parametros y luego los añade a la lista availableAppointments
     * creando un objeto a partir del constructor AvailableAppointment
     *
     * @param date: Es la fecha para la cita
     * @param time: Es la hora de la cita
     */
    public void addAvailableAppotintment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    /**
     * Descripción: Metodo del tipo Arraylist de la clase o tipo AvailableAppointment
     *
     * @return availableAppointments Retorna el contenido de la lista de citas
     */
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerología");

    }

    // clase aninada
    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        // Constructor
        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        // Getters y Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "\nAvailable Appointmets \nDate: " + date + "\nTime: " + time;
        }
    }

}
