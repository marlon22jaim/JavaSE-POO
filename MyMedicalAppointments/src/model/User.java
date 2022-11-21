package model;

public abstract class User {
    // Atributos
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    //Constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 10) {
            System.out.println("El numero telefonico debe de ser de 10 digitos");
        } else {
            this.phoneNumber = phoneNumber;
        }

    }

    // vamos a sobreescribir el metodo toString de la clase object para imprimir de forma personalizada los datos
    @Override
    public String toString() {
        return "model.User: " + name + ", Email: " + email + "\nAddress: " + address + ". Phone: " + phoneNumber;
    }

    public abstract void showDataUser();
}
