package Assignment;


public class Min_Max_BST {

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
                current = root;
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

//        public int Max(Node node) {
//            if (root == null) {
//                return -1;
//            }
//
//            int max = node.value;
//
//            if (node.left != null && node.left.value > max) {
//                max = node.left.value;
//              //  System.out.println("left"+max);
//            }
//
//            if (node.right != null && node.right.value > max) {
//
//                int temp = node.right.value;
//                while (node!=null) {
//                    if (temp > node.value) {
//                        max=temp;
//                    }
//                }
//
//               // System.out.println("right"+max);
//            }
//
//            return max;
//        }
    public int Max(Node node) {
        if (node == null) {
            return -1;
        }

        int max = node.value;
        int leftMax = Max(node.left);
        int rightMax = Max(node.right);

        if (leftMax > max) {
            max = leftMax;
        }

        if (rightMax > max) {
            max = rightMax;
        }

        return max;
    }
        public int Min(Node node) {
            if (node == null) {
                return -1;
            }

            int min = node.value;
            int leftMin = Max(node.left);
            int rightMin = Max(node.right);

            if (leftMin > min) {
                min = leftMin;
            }

            if (rightMin < min) {
                min = rightMin;
            }

            return min;
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
        list.display(list.root);
        System.out.println();
        System.out.println("Max value");
        System.out.println(list.Max(list.root));
        System.out.println();
        System.out.println("Min value");
        System.out.println(list.Min(list.root));
    }
}
