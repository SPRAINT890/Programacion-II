package Parcial1.entities;

import StackQueue.src.linkedlist.MyLinkedListImpl;
import StackQueue.src.linkedlist.MyList;
import StackQueue.src.queue.MyQueue;

public class Usuario {

    private int cedula;
    private MyQueue<Recomendacion> recomendaciones = new MyLinkedListImpl<>();
    private MyList<Vino> meGusta = new MyLinkedListImpl<>();
    private MyList<Vino> meRecomendaron = new MyLinkedListImpl<>();
    public Usuario(int cedula) {
        this.cedula = cedula;
    }

    public int getCedula() {
        return cedula;
    }
    public void setRecomendaciones(MyLinkedListImpl<Recomendacion> recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public MyList<Vino> getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(MyLinkedListImpl<Vino> meGusta) {
        this.meGusta = meGusta;
    }

    public MyList<Vino> getMeRecomendaron() {
        return meRecomendaron;
    }

    public void setMeRecomendaron(MyLinkedListImpl<Vino> meRecomendaron) {
        this.meRecomendaron = meRecomendaron;
    }

    public MyQueue<Recomendacion> getRecomendaciones() {
        return recomendaciones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return cedula == usuario.cedula;
    }
}
