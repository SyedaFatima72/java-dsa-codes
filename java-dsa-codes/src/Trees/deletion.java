package Trees;

import java.util.Scanner;

public class deletion {

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
        Node current;

        BinaryTree() {
            root = null;
        }

        public void create(int value) {
            Node newNode = new Node(value);
            current = root;
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
                        if (value > current.value) {
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
        }

//        public void insert() {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter the element you want to insert");
//            int add = scanner.nextInt();
//            Node newNode = new Node(add);
//            current = root;
//
//            if (root == null) {
//                root = newNode;
//            } else {
//                while (true) {
//                    if (add < current.value) {
//                        if (current.left == null) {
//                            current.left = newNode;
//                            break;
//                        } else {
//                            current = current.left;
//                        }
//                    } else if (add > current.value) {
//                        if (current.right == null) {
//                            current.right = newNode;
//                            break;
//                        } else {
//                            current = current.right;
//                        }
//                    }
//                }
//            }
//        }
        public int search(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nEnter the element you want to Search");
            int find = scanner.nextInt();
            Node newNode = new Node(find);
            current = root;
            while (true){
                if (find!=current.value && find!=current.left.value && find!=current.right.value){
                    System.out.println("Not founded");
                    break;
                }
                else {
                    if (find<current.value){
                        System.out.println("on left side of the tree");
                        break;
                    } else if (find==current.value) {
                        System.out.println("Root of the tree");
                        System.out.println(current.value);
                        break;
                    } else {
                        System.out.println("On the right side of the tree");
                        break;
                    }
                }
            }
            return find;
        }
//        public void delete(){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("\nEnter the element you want to Delete");
//            int del = scanner.nextInt();
//            while (true){
//                if (del!=current.value && del!=current.left.value && del!=current.right.value){
//                    System.out.println("Not founded");
//                    break;
//                }
//                else {
//                    if (del<current.value){
//
//                        current=current.left;
//                        break;
//                    }
//                    else {
//                        current=current.right;
//                    }
//                }
//            }
//        }
public void delete() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nEnter the element you want to Delete");
    int del = scanner.nextInt();
    root = deleteNode(root, del);
}

        private Node deleteNode(Node root, int key) {
            if (root == null) {
                return root;
            }

            if (key < root.value) {
                root.left = deleteNode(root.left, key);
            } else if (key > root.value) {
                root.right = deleteNode(root.right, key);
            } else {
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }

                root.value = minValue(root.right);
                root.right = deleteNode(root.right, root.value);
            }

            return root;
        }

        private int minValue(Node root) {
            int minValue = root.value;
            while (root.left != null) {
                minValue = root.left.value;
                root = root.left;
            }
            return minValue;
        }


        public void traverse(Node root) {
            if (root != null) {
                traverse(root.left);
                System.out.print(root.value + " ");
                traverse(root.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree list = new BinaryTree();
        list.create(4);
        list.create(5);
        list.create(3);
        list.create(6);
        list.create(2);


        list.traverse(list.root);
       // list.insert();
        list.search();
        list.delete();
    }
}
