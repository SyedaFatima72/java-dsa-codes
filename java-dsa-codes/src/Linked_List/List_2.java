package Linked_List;

import java.util.Scanner;

public class List_2 {
    Scanner f = new Scanner(System.in);
    Node head;
    Node current;
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;

        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        System.out.println("Enter the node element(1-5)");
        int searchData = f.nextInt();

        Node x = head;

        while (x != null) {
            if (x.data == searchData) {
                System.out.println(" Address : " + x);
            }
            x = x.next;
        }
    }

    public static void main(String[] args) {
        List_2 list = new List_2();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.display();
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }


    Node head;
    public void insert(int val){
        Node curr=head,temNode=new Node(val);
        temNode.data=val;
        temNode.next=null;

        if(head==null){
            head=temNode;
        }
        else{
            while(curr.next!=null){
                curr=curr.next;
                curr.next=temNode;
            }
        }
    }
    public static Node evenOdd(Node head){
        if(head==null){
            return null;
        }
        int even=0;
        int odd=0;

        Node current=head;

        while(current!=null){
            int val=current.data;

            if(val%2==0){
                even+=val;
            }
            else{
                odd+=val;
            }
            current=current.next;
        }
        Node evensum=new Node(even);
        Node oddsum=new Node(odd);

        //even in the beginning
        evensum.next=head;
        head=evensum;


        current=head;
        while(current.next!=null){
            current=current.next;
        }
        //odd sum inserted at the end of the list
        current.next=oddsum;

        return head;
    }

    public static void printlist(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+ "->");
            current=current.next;
        }
        // System.out.println("error");
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(7);
        head.next.next = new Node(8);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(15);
        head.next.next.next.next.next.next = new Node(10);
        head.next.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next.next.next = new Node(2);
        System.out.println("original linkedlist ");
        printlist(head);

        head=evenOdd(head);

        System.out.println("Updated Linked List :");
        printlist(head);
    }
}
