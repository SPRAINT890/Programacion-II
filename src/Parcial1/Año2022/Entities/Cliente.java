package Parcial1.Año2022.Entities;

import java.util.Objects;

public class Cliente {

    private long ci;

    public Cliente(long ci) {
        this.ci = ci;
    }

    public long getCi() {
        return ci;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return ci == cliente.ci;
    }
}
