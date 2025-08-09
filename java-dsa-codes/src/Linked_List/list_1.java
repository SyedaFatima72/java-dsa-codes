package Linked_List;
public class list_1 {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

}
Node current;
        public void insert(int data) {
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
            }else {
                current=head;
                while (current.next!=null){
                    current=current.next;
                }
                current.next=newNode;
            }
        }

        public void display(){
            Node x=head;

            while (x!=null) {
                System.out.print(x.data+"-->");
                x=x.next;
            }
            System.out.println("End");
        }

        public static void main(String[] args) {

            list_1 list=new list_1();
            list.insert(1);
            list.insert(2);
            list.insert(3);
            list.insert(4);
            list.insert(5);

            list.display();

        }

}