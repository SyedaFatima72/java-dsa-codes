package doubly;

public class deletion {
    Node head;
    Node tail;

    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
        Node(){
            this.data=data;
        }
    }
    public void insert(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
        }
        else {
          tail.next=newNode;
          newNode.prev=tail;
          tail=newNode;

        }
    }
    public void delete_at_start(){
        if (head==null){
            head=null;
            tail=null;
        }
        else {
//           Node current=head;
//           current.next=current;
//           head=current;
            Node temp;
            temp=head.next;
            head=temp;

        }
    }
    public void delete_at_end(){
        if (head==null){
            head=null;
        }
        if(head.next==null){
            head.next=null;
        }
        Node current=head;
        while (current.next!=null && current.next.next!=null){
            current=current.next;
        }
        current.next=null;
    }
    public void delete_at_middle(){
        int postion=3;
        Node temp=head;
        Node ptr=temp.next;
        for (int i=1;i<postion-1;i++){
            temp=ptr;
            ptr=ptr.next;
        }
        ptr=ptr.next;
        temp.next=ptr;

    }
    public void display(){
        Node x=head;
        System.out.print("null"+"<->");
        while (x!=null){
            System.out.print(x.data+"<->");
            x=x.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        deletion list=new deletion();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insert(10);

        list.delete_at_start();
        list.delete_at_end();
        list.delete_at_middle();

        list.display();
    }

}
