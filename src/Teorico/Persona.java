package Teorico;
public class Persona {
    private int edad;
    private float cedula;
    public Persona(int edad, float cedula) {
        this.edad = edad;
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getCedula() {
        return cedula;
    }

    public void setCedula(float cedula) {
        this.cedula = cedula;
    }
}
