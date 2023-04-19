package Practico1.GenericsLinkedListDobleRecursivo;

public interface ListaInterfazSimple <V>{
    void addLast(V value);

    void remove (int index);

    void addFirst(V value);
    int length();
    boolean exist(V data);

    V get (int index);
}
