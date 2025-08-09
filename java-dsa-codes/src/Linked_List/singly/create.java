package Linked_List.singly;

public class create {
    Node head;
    Node current;

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insert(int data){
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
        //even
        Node x=head;
        while (x!=null){
            if (x.data%2==0) {
                System.out.print(x.data + "--> ");
            }
                x=x.next;

        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        create list=new create();
        list.insert(3);
        list.insert(2);
        list.insert(5);
        list.insert(4);
        list.insert(6);
        list.insert(1);

        list.display();


    }
}
