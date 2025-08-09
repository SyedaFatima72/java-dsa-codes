package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Built_in {

    static class create {
        int value;
        create left;
        create right;

        public create(int value) {
            this.value = value;
        }
    }

    static class Binary_Tree {

        create root;

        public Binary_Tree() {
            root = null;
        }

        public void insert(int key) {
            if (root == null) {
                root = new create(key);
                return;
            }

            Queue<create> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                create currentNode = queue.remove();

                if (currentNode.left == null) {
                    currentNode.left = new create(key);
                    return;
                } else {
                    queue.add(currentNode.left);
                }

                if (currentNode.right == null) {
                    currentNode.right = new create(key);
                    return;
                } else {
                    queue.add(currentNode.right);
                }
            }
        }

        public void inorderTraversal() {
            inorderTraversalRec(root);
        }

        private void inorderTraversalRec(create root) {
            if (root != null) {
                inorderTraversalRec(root.left);
                System.out.print(root.value + " ");
                inorderTraversalRec(root.right);
            }
        }
    }

    public static void main(String[] args) {
        Binary_Tree tree = new Binary_Tree();
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(60);
        System.out.println("In Order Traversal");
        tree.inorderTraversal();
    }
}
