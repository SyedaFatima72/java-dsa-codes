package Linked_List.singly;

public class test {
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
//        if(head==null){
//            head=newNode;
//        }else {
//            current = head;
//            while (current.next!= null) {
//                current = current.next;
//
//            }
//            current.next=newNode;
//        }


        //traverse..inverse

        newNode.next = head;
        head = newNode;
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
        test list=new test();
        list.insert(1);
        list.insert(2);
        list.insert(3);

        list.display();
    }
}
