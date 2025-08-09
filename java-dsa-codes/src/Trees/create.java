package Trees;

public class create {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
  static class Binary_Tree {

      Node root;

      public Binary_Tree() {
          root = null;
      }

      public void insert(int key) {
          root = insertRec(root, key);
      }

      private Node insertRec(Node root, int key) {
          if (root == null) {
              root = new Node(key);
              return root;
          }
          if (key < root.data) {
              root.left = insertRec(root.left, key);
          } else if (key > root.data) {
              root.right = insertRec(root.right, key);
          }
          return root;
      }

      public void inorderTraversal() {
          inorderTraversalRec(root);
      }

      private void inorderTraversalRec(Node root) {
          if (root != null) {
              inorderTraversalRec(root.left);
              System.out.print(root.data + " ");
              inorderTraversalRec(root.right);
          }

      }



      public static void main(String[] args) {
//        create c=new create();
//        create.Binary_Tree list=c.new Binary_Tree();
          Binary_Tree list = new Binary_Tree();
          list.insert(20);//KEY(..)
          list.insert(30);
          list.insert(40);
          list.insert(50);
          list.insert(60);
          System.out.println("In Order Traversal");
          list.inorderTraversal();

      }

  }
}
