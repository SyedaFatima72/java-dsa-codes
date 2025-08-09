package Linked_List.singly;

public class insert_end {
    Node head;
    Node current;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
//    public void insertAtEnd(int data){
//        Node newNode=new Node(data);
//        current=head;
//        while (current.next != null){
//            current=current.next;
//
//        }
//        current.next=newNode;
//    }
public void insertAtEnd(int data) {
    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
        return;
    }

    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }

    temp.next = newNode;
}
    public void insert(int data){
        Node newNode=new Node(data);

        if (head==null){
            head=newNode;
        }else {
            current=head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newNode;

        }
    }

//    public void insert(int data){
//        Node newNode=new Node(data);
//        head=current;
//        if (current==null){
//            head=newNode;
//        } else {
//            current=current.next;
//
//        }
//        current.next=newNode;
//    }
    public void display(){
        Node x=head;
        while (x!=null){
            System.out.print(x.data+"-->");
            x=x.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        insert_end list=new insert_end();
        list.insertAtEnd(0);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.display();

    }
}
