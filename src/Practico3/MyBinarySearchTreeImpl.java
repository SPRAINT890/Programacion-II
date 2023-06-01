package Practico3;

public class MyBinarySearchTreeImpl<K extends Comparable<K>, V> implements MyBinarySearchTree<K, V> {
    NodeBST<K, V> root;

    @Override
    public V find(K key) {
        return this.findN(key, root);
    }
    private V findN(K key, NodeBST<K, V> nodo) {
        if (key == nodo.getKey()){
            return nodo.getValue();
        }
        if (key.equals(nodo.getKey())){
            return this.findN(key, nodo.getLeftChild());
        }
        return this.findN(key, nodo.getRightChild());
    }
    @Override
    public void insert(K key, V data) {
        NodeBST<K, V> newNodo = new NodeBST<>(key, data);
        if (root == null){
            root = newNodo;
        }else{
            insertN(root, newNodo);
        }
    }
    private void insertN(NodeBST<K, V> nodo, NodeBST<K, V> newNodo){

    }

    @Override
    public void delete(K key) {

    }

    public MyBinarySearchTreeImpl(NodeBST<K, V> root) {
        this.root = root;
    }
}
