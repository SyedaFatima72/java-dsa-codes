package Assignment;

public class Traversal {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static class BinaryTree {
        Node root;

        BinaryTree() {
            this.root = null;
        }

        public void insert(int value) {
            Node newNode = new Node(value);
            Node current = root;
            if (root == null) {
                root = newNode;

            } else {
                while (true) {
                    if (value < current.value) {
                        if (current.left == null) {
                            current.left = newNode;
                            break;
                        } else {
                            current = current.left;
                        }
                    } else {
                        if (current.right == null) {
                            current.right = newNode;
                            break;
                        } else {
                            current = current.right;
                        }
                    }
                }
            }
        }

        public void Preorder(Node node) {
            if (node != null) {
                System.out.print(node.value + " ");
                Preorder(node.left);
                Preorder(node.right);
            }
        }

        public void Inorder(Node node) {
            if (node != null) {
                Inorder(node.left);
                System.out.print(node.value + " ");
                Inorder(node.right);
            }
        }

        public void Postorder(Node node) {
            if (node != null) {
                Postorder(node.left);
                Postorder(node.right);
                System.out.print(node.value + " ");
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree list = new BinaryTree();
        list.insert(4);
        list.insert(7);
        list.insert(2);
        list.insert(9);
        list.insert(10);
        list.insert(12);
        list.insert(5);
        System.out.println("Pre Order");
        list.Preorder(list.root);
        System.out.println();
        System.out.println("In Order");
        list.Inorder(list.root);
        System.out.println();
        System.out.println("Post Order");
        list.Postorder(list.root);
    }
}
