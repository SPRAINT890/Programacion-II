package Practico3;

public interface MyBinarySearchTree<K, V>{
    V find(K key);
    void insert (K key, V data);
    void delete (K key);
}
