package Linked_List.singly;

import doubly.deletion;

public class delete_middle {

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
    public void deleteAtmid(){

        int postion=3;
        Node temp=head;
        Node ptr=temp.next;
        for (int i=1;i<postion-1;i++){
            temp=ptr;
            ptr=ptr.next;
        }
        ptr=ptr.next;
        temp.next=ptr;

// Node newNode=new Node(data);
//
//        int position=1;
//        current = head;
//
//
//        for (int i = 0; i < position - 1 ; i++) {
//
//            current=current.next;
//
//        }
//        if (current!=null && current.next!=null){
//        }            current=current.next.next;
//


//        current = head;
//        int counter = 0;
//        while (counter < position - 1) {
//            current = current.next;
//            counter++;
//        }
//        Node nextNode = current.next.next;
//        current.next = nextNode;
//


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
        delete_middle list=new delete_middle();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.deleteAtmid();
        list.display();
    }

}
