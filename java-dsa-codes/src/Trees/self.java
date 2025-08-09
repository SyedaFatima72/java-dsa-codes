package Trees;

import java.util.Scanner;

public class self {
  static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;

        }
    }
   static class tree{
       Node root;
       Node current;
       tree(){
           this.root=null;
       }

       public void insert(int key){
           root=insertion(root,key);
       }
       public Node insertion(Node root,int key){
            if (root==null){
                root=new Node(key);
                return root;
                
            } else if (key<root.data) {
                root.left=insertion(root.left,key);
            }
            else if (key>root.data){
                root.right=insertion(root.right,key);
            }
            return root;

       }
       public void delete(int del){
           root=deleted(root,del);
       }
       public Node deleted(Node root,int del){

            if (del<root.data){
                root.left=deleted(root.left,del);
            } else if (del>root.data) {
                root.right=deleted(root.right, del);

            }
            else {//if founded
                //case 1:
                if (root.left==null && root.right==null){
                    return null;
                }
                //case 2:
                if (root.right==null){
                    return root.left;
                } else if (root.left==null) {
                    return root.right;
                }
                //case 3:
                Node IS=inorderSuccessor(root.right);
                root.data=IS.data;
                root.right=deleted(root.right,IS.data);
            }

            return root;

       }
       public Node inorderSuccessor(Node root){
           while (root.left!=null){
               root=root.left;
           }
           return root;
       }
       public void printInRange(Node root, int x,int y){
           if (root==null){
               return;
           }
          //case 1:
           if (x <= root.data && y>=root.data){
               printInRange(root.left,x, y);
               System.out.print(root.data+"");
               printInRange(root.right,x,y);
           }
           //case 2:
           if (x>root.data){
               printInRange(root.right,x,y);
           }
           //case 3:
           if (y<root.data){
               printInRange(root.left,x,y);
           }
       }

       public void  display(){
          root=displayed(root);

       }

       public Node displayed(Node root){
           if (root!=null){
               displayed(root.left);
               System.out.print(root.data+" ");
               displayed(root.right);

           }
           return root;
       }
    }

    public static void main(String[] args) {
        Scanner f=new Scanner(System.in);
        tree list=new tree();
        list.insert(8);
        list.insert(4);
        list.insert(10);
        list.insert(5);
        list.insert(9);
        list.insert(1);
        list.insert(15);
        list.insert(17);
        list.display();
        System.out.println("\nEnter the digit you want to delete");
        int remove=f.nextInt();
        list.delete(remove);
        list.display();
        System.out.println("\nPrint in range ");
        System.out.println("Select your range");
        System.out.println("Enter the starting element");
        int a=f.nextInt();
        System.out.println("Enter the ending element");
        int b=f.nextInt();

        list.printInRange(list.root,a,b);
    }
}
