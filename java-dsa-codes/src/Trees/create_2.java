package Trees;

public class create_2 {

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
                root = add(root, value);
            }

            private Node add(Node root, int value) {
                if (root == null) {
                    return new Node(value);
                }
                if (value < root.value) {
                    root.left = add(root.left, value);
                } else if (value > root.value) {
                    root.right = add(root.right, value);
                }
                return root;
            }

            public void display() {
                displayed(root);
            }

            private void displayed(Node root) {
                if (root != null) {

                    System.out.print(root.value + " ");
                    displayed(root.left);
                    displayed(root.right);
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
            list.display();
        }
    }


