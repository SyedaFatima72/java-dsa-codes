package Linked_List.singly;

public class insert_middle {

    Node head;
    Node current;
    public class Node{
        int data;
        Node next;


        Node(int data){
            this.data=data;
        }

    }
    public void insert(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
        }
        else {
            current=head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }

    }
    public void insertAtMid(int data,int position){
        Node newNode=new Node(data);
            current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            //if position =>   3-1 => 2
            //          0 1 2 (3(3-1=>2)) <= postion 3
            current = current.next;
        }
      //  System.out.println(position-1); => (2)

        if (current == null) {
            System.out.println("Invalid position. Position is beyond the length of the list.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;

    }
    public void display(){
        Node x=head;
        while (x!=null){
            System.out.print(x.data+"-->");
            x=x.next;
        }
        System.out.println("End");

    }

    public static void main(String[] args) {
        insert_middle list=new insert_middle();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insertAtMid(6,3);
        list.display();
    }
}
