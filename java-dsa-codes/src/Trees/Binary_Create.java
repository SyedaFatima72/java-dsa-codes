package Trees;

public class Binary_Create {
    static Node current;
    static class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value;
        }
    }
    static class BinaryTree{
        Node root;
        BinaryTree(){
            this.root=null;
        }


        public void insert(int value) {

            Node newNode = new Node(value);
            current = root;
            if (root == null) {
                root = newNode;
                current=root;
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
        public void display(Node node){
            if (node!=null){

                display(node.left);
                System.out.print(node.value+" ");
                display(node.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree list=new BinaryTree();
        list.insert(4);
        list.insert(7);
        list.insert(2);
        list.insert(9);
        list.insert(10);
        list.insert(12);
        list.insert(5);
        list.display(list.root);
    }
}
