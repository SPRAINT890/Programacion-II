package Teorico;

import java.util.Objects;

public class Persona {
    private int edad;
    private float cedula;
    public Persona(int edad, float cedula) {
        this.edad = edad;
        this.cedula = cedula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Float.compare(persona.cedula, cedula) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(edad, cedula);
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
