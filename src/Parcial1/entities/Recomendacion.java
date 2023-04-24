package Parcial1.entities;

public class Recomendacion {
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
