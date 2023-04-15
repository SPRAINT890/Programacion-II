package Practico1.GenericsLinkedlistSimple;

public interface ListaInterfazSimple <V>{
    void addLast(V value);

    void remove (int index);

    V get (int index);
}
