package Parcial1.entities;

import java.util.Objects;

public class Recomendacion {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recomendacion that = (Recomendacion) o;
        return Objects.equals(vinoARecomendar, that.vinoARecomendar);
    }


    private Vino vinoARecomendar;
    private Usuario usuario;

    public Recomendacion(Vino vinoARecomendar, Usuario usuario) {
        this.vinoARecomendar = vinoARecomendar;
        this.usuario = usuario;
    }
    public Vino getVinoARecomendar() {
        return vinoARecomendar;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
