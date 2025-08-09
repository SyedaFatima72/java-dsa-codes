package Linked_List.singly;

import java.util.Scanner;

public class delete_start {
    Scanner f=new Scanner(System.in);
    Node head;
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
    public void deleteAtStart() {
            Node temp;
            temp=head;
            head=temp.next;

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
        delete_start list=new delete_start();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.deleteAtStart();
        list.display();
    }

}
