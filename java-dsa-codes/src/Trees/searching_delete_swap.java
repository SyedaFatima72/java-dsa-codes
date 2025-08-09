package Trees;

import java.util.Scanner;

public class searching_delete_swap {
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
            root=null;
        }
        public void insert(int key){
            root=insertion(root,key);

        }
        private Node insertion(Node root,int key){
            if (root==null){
                root=new Node(key);
            }
            else {
                if(key<root.value){
                    root.left=insertion(root.left,key);
                } else if (key>root.value) {
                    root.right=insertion(root.right,key);
                }
            }
            return root;
        }
       int count=0;
       int getcount(){
          return count;
       }

       public boolean search(int find){
            return searching(root,find);
        }
        private boolean searching(Node root,int find){


            if (root==null){
                return false;
            }
            count++;
            if (find==root.value){

                return true;

            }
            else {
                if (find<root.value){
                    return searching(root.left,find);
                }
                else if (find>root.value){
                    return searching(root.right,find);
                }
            }

            return false;
        }
       public void delete(int key) {
           root = deleteNode(root, key);
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
               // Node to be deleted found
               if (root.left == null) {
                   return root.right;
               } else if (root.right == null) {
                   return root.left;
               }

               // Node has two children
               root.value = minValue(root.right);
               root.right = deleteNode(root.right, root.value);
           }

           return root;
       }

       private int minValue(Node root) {
           int minValue = root.value;
           System.out.println(minValue);
           while (root.left != null) {
               minValue = root.left.value;
               root = root.left;
           }
           return minValue;
       }

       public void traverse(Node root){
            if (root!=null){
                traverse(root.left);
                System.out.print(root.value+" ");
                traverse(root.right);
            }
        }

    }

    public static void main(String[] args) {
        Scanner f=new Scanner(System.in);
        BinaryTree list=new BinaryTree();

        list.insert(12);
        list.insert(5);
        list.insert(1);
        list.insert(72);
        list.insert(14);
        list.insert(2);

        list.traverse(list.root);
        System.out.println("\nEnter the value you want to search");
        int find=f.nextInt();
        boolean found=list.search(find);
        System.out.println("\nDoes value "+find+ " exist in the tree");
        System.out.println(found);
        System.out.println("on index "+list.getcount());

//        System.out.println("\nEnter the value you want to swap it with");
//        int swap=f.nextInt();
        System.out.println("\nEnter the value you want to insert");
        int swap = f.nextInt();
        list.delete(find);
        list.insert(swap);

//        list.traverse(list.root);
////        list.insert(swap);
        list.traverse(list.root);
       // list.minValue(list.root);
    }
}
