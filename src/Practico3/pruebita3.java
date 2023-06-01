package Practico3;

public class pruebita3 {
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

        public void insert(K key, V value) {
            root = insertN(root, key, value);
        }

        private Node insertN(Node node, K key, V value) {
            if (node == null) {
                return new Node(key, value);
            }

            int cmp = key.compareTo(node.key);
            if (cmp < 0) {
                node.left = insertN(node.left, key, value);
            } else if (cmp > 0) {
                node.right = insertN(node.right, key, value);
            } else {
                node.value = value;
            }

            return node;
        }

        public V find(K key) {
            Node node = findN(root, key);
            return node == null ? null : node.value;
        }

        private Node findN(Node node, K key) {
            if (node == null) {
                return null;
            }

            int cmp = key.compareTo(node.key);
            if (cmp < 0) {
                return findN(node.left, key);
            } else if (cmp > 0) {
                return findN(node.right, key);
            } else {
                return node;
            }
        }

        public void delete(K key) {
            root = deleteN(root, key);
        }

        private Node deleteN(Node node, K key) {
            if (node == null) {
                return null;
            }

            int cmp = key.compareTo(node.key);
            if (cmp < 0) {
                node.left = deleteN(node.left, key);
            } else if (cmp > 0) {
                node.right = deleteN(node.right, key);
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

        public void inOrder() {
            inOrderN(root);
        }

        private void inOrderN(Node node) {
            if (node != null) {
                inOrderN(node.left);
                System.out.println(node.key + ": " + node.value);
                inOrderN(node.right);
            }
        }

        public void preOrder() {
            preOrderN(root);
        }

        private void preOrderN(Node node) {
            if (node != null) {
                System.out.println(node.key + ": " + node.value);
                preOrderN(node.left);
                preOrderN(node.right);
            }
        }

        public void postOrder() {
            postOrderN(root);
        }

        private void postOrderN(Node node) {
            if (node != null) {
                postOrderN(node.left);
                postOrderN(node.right);
                System.out.println(node.key + ": " + node.value);
            }
        }
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.insert(5, "Apple");
        bst.insert(2, "Banana");
        bst.insert(7, "Orange");
        bst.insert(1, "Grape");
        bst.insert(4, "Mango");

        System.out.println(bst.find(5));
        System.out.println("In-Order Traversal:");
        bst.inOrder();
        System.out.println("Pre-Order Traversal:");
        bst.preOrder();
        System.out.println("Post-Order Traversal:");
        bst.postOrder();

    }
}
