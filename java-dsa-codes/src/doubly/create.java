package doubly;

public class create {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            next=null;
            prev=null;
        }
    }
    Node head;
    Node tail;
    Node current;

    public void insert(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    public void Forwarddisplay(){
        Node x=head;
        while(x!=null){
            System.out.print(x.data+"<->");
            x=x.next;
        }
        System.out.print("end"+"\n");

    }
    public void Backwarddisplay(){
        Node x=tail;
        while (x!=null){
            System.out.print(x.data+"<->");
            x=x.prev;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        create list=new create();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.Forwarddisplay();
        list.Backwarddisplay();

    }
}
