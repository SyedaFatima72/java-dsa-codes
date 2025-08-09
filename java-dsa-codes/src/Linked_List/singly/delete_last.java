package Linked_List.singly;

import java.util.Scanner;

public class delete_last {
    Scanner f=new Scanner(System.in);
    Node head;
    Node tail;
    Node current;

    public class Node {
        int data;
       Node next;

        public Node(int data) {
            this.data = data;
        }
        public Node() {
            this.data = data;
        }
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
//    public void deleteAtEnd() {
////        Node newNode = new Node();
////        current=head;
////      if(current.next==null) {
////           current=tail;
////           tail=newNode;
////           newNode=null;
////        }
//        current = head;
//        while (current.next != tail) {
//            current = current.next;
//        }
//
//        current.next = null;
//        tail = current;
//    }
public void deleteAtEnd() {
    if (head == null) {
        System.out.println("List is empty. Nothing to delete.");
        return;
    }

    if (head.next == null) {
        head = null; // If there's only one node, set the head to null
        return;
    }

    current = head;
    while (current.next != null && current.next.next != null) {
        current = current.next;
    }
    current.next = null; // Set the next of the second last node to null
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
        delete_last list=new delete_last();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.deleteAtEnd();
        list.display();
    }

}
