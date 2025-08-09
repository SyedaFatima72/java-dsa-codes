package doubly;

public class even_odd {
   Node head;
   Node tail;
   Node current;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public void insert(int data) {
        Node newNode = new Node(data);
        current = head;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void display() {
        Node x = head;
        System.out.print("null  <->");
        while (x!= null) {
            if (x.data % 2!= 0) {
                System.out.print(x.data + " <-> ");

            }
            x = x.next;

        }
        System.out.println(" null");
    }
    public static void main(String[] args) {
        even_odd list=new even_odd();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();
    }


}
