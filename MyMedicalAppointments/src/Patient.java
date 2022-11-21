public class Patient extends User {
    // Atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    // Constructor
    Patient(String name, String email) {
        super(name, email);
    }

    // Getters y setters
    public String getWeight() {
        return this.weight + " Kg.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    // Vamos a sobreescribir el metodo toString que heredamos de la clase User para agregar mas campos que solo tiene paciente
    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + "\nWeight: "
                + getWeight() + "\nHeight" + getHeight() + "\nBlood: " + blood;
    }
}
