package Practico3;

public class prueba2 {
    public static class BinarySearchTree<K extends Comparable<K>, V> {

        private Node root;

        private class Node {
            private K key;
            private V value;
            private Node left;
            private Node right;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        public void put(K key, V value) {
            root = put(root, key, value);
        }

        private Node put(Node node, K key, V value) {
            if (node == null) {
                return new Node(key, value);
            }

            int cmp = key.compareTo(node.key);
            if (cmp < 0) {
                node.left = put(node.left, key, value);
            } else if (cmp > 0) {
                node.right = put(node.right, key, value);
            } else {
                node.value = value;
            }

            return node;
        }

        public V get(K key) {
            Node node = get(root, key);
            return node == null ? null : node.value;
        }

        private Node get(Node node, K key) {
            if (node == null) {
                return null;
            }

            int cmp = key.compareTo(node.key);
            if (cmp < 0) {
                return get(node.left, key);
            } else if (cmp > 0) {
                return get(node.right, key);
            } else {
                return node;
            }
        }

        public void delete(K key) {
            root = delete(root, key);
        }

        private Node delete(Node node, K key) {
            if (node == null) {
                return null;
            }

            int cmp = key.compareTo(node.key);
            if (cmp < 0) {
                node.left = delete(node.left, key);
            } else if (cmp > 0) {
                node.right = delete(node.right, key);
            } else {
                if (node.left == null) {
                    return node.right;
                } else if (node.right == null) {
                    return node.left;
                } else {
                    Node minNode = min(node.right);
                    node.key = minNode.key;
                    node.value = minNode.value;
                    node.right = deleteMin(node.right);
                }
            }

            return node;
        }

        private Node min(Node node) {
            if (node.left == null) {
                return node;
            }
            return min(node.left);
        }

        private Node deleteMin(Node node) {
            if (node.left == null) {
                return node.right;
            }
            node.left = deleteMin(node.left);
            return node;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(5, "Apple");
        bst.put(2, "Banana");
        bst.put(7, "Orange");
        bst.put(1, "Grape");
        bst.put(4, "Mango");

        System.out.println(bst.get(2)); // Output: "Banana"
        System.out.println(bst.get(7)); // Output: "Orange"

        bst.delete(2);
        System.out.println(bst.get(2)); // Output: null
    }
}
