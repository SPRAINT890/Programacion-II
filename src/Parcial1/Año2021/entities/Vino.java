package Parcial1.Año2021.entities;

import java.util.Objects;

public class Vino {
    public Vino(String nombre, String variedad, String pais, int cosecha) {
        this.nombre = nombre;
        this.variedad = variedad;
        this.pais = pais;
        this.cosecha = cosecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVariedad() {
        return variedad;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vino vino = (Vino) o;
        return Objects.equals(nombre, vino.nombre);
    }

    public int getCosecha() {
        return cosecha;
    }

    private String nombre;
    private String variedad;
    private String pais;
    private int cosecha;
}
