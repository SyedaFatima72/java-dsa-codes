package Linked_List.singly;

public class Average {
    Node head;
    Node current;
    double aver;
    int sum=0;
    int total=0;
    class Node{
        Node next;
        int data;
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
            current =head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }

    public void display(){
        Node x=head;
        while (x!=null){
            sum+=x.data;
            total++;


            aver=sum/total;

            System.out.print(x.data+" -> ");
            x=x.next;

        }
        System.out.print("null");
        System.out.println("\nAverage of linklist elements is "+aver);

    }

    public static void main(String[] args) {
        Average list=new Average();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();
    }
}
