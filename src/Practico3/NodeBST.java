package Practico3;

import java.util.Objects;

public class NodeBST<K extends Comparable<K>, V> {
    private K key;

    private V value;

    private NodeBST<K, V> leftChild;

    private NodeBST<K, V> rightChild;

    public K getKey() {
        return key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NodeBST<?, ?> node = (NodeBST<?, ?>) o;
        return Objects.equals(key, node.key);
    }

    public NodeBST<K, V> getLeftChild() {
        return leftChild;
    }
    public NodeBST(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setLeftChild(NodeBST<K, V> leftChild) {
        this.leftChild = leftChild;
    }

    public NodeBST<K, V> getRightChild() {
        return rightChild;
    }

    public void setRightChild(NodeBST<K, V> rightChild) {
        this.rightChild = rightChild;
    }
}
