package Trees;

public class Sum_Count {

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

        public void display(Node node) {
            if (node != null) {
                display(node.left);
                System.out.print(node.value + " ");
                display(node.right);
            }
        }

        public int countNodes() {
            return countNodesHelper(root);
        }

        private int countNodesHelper(Node node) {
            if (node == null) {
                return 0;
            }
            return 1 + countNodesHelper(node.left) + countNodesHelper(node.right);
        }
        public int sumNodes() {
            return sumNodesHelper(root);
        }

        private int sumNodesHelper(Node node) {
            if (node == null) {
                return 0;
            }
            return node.value + sumNodesHelper(node.left) + sumNodesHelper(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(4);
        tree.insert(7);
        tree.insert(2);
        tree.insert(9);
        tree.insert(10);
        tree.insert(12);
        tree.insert(5);

        tree.display(tree.root);

        int nodeCount = tree.countNodes();
        System.out.println("\nNumber of nodes: " + nodeCount);

        int nodeSum = tree.sumNodes();
        System.out.println("\nSum of all nodes: " + nodeSum);
    }
}
