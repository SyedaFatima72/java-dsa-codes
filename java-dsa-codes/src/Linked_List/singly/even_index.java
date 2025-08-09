package Linked_List.singly;

public class even_index {
    Node head;
    Node curent;
    class Node{
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
            curent=head;
            while (curent.next!=null){
                curent=curent.next;
            }
            curent.next=newNode;
        }

    }
    public void display(){
        Node x=head;
        while (x!=null){
            if (x.data%2!=0){
            System.out.print(x.data+" -> ");
            }
            System.out.print("null\n");
            if (x.data%2==0){
                System.out.print(x.data+" -> ");
            }
            x=x.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        even_index list=new even_index();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display();
    }
}
