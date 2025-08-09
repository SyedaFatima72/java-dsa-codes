package Assignment;

public class singly_to_doubly {
    SinglyNode head;
    DoublyNode start;

    static class SinglyNode {
        int data;
        SinglyNode next;

        public SinglyNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class DoublyNode {
        int data;
        DoublyNode next;
        DoublyNode prev;

        public DoublyNode(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insert_to_singly(int data) {
        SinglyNode newNode = new SinglyNode(data);
        if (head == null) {
            head = newNode;
        } else {
            SinglyNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void convert_to_doubly() {
        SinglyNode current = head;
        while (current != null) {
            insert_to_doubly(current.data);
            current = current.next;
        }
    }

    public void insert_to_doubly(int data) {
        DoublyNode newnode = new DoublyNode(data);
        if (start == null) {
            start = newnode;
        } else {
            DoublyNode d_current = start;
            while (d_current.next != null) {
                d_current = d_current.next;
            }
            d_current.next = newnode;
            newnode.prev = d_current;
        }
    }

    public void display_in_doubly() {
        DoublyNode x = start;
        System.out.print("null"+ "<->");
        while (x != null) {
            System.out.print(x.data + "<->");
            x = x.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        singly_to_doubly list = new singly_to_doubly();

        list.insert_to_singly(1);
        list.insert_to_singly(2);
        list.insert_to_singly(3);
        list.insert_to_singly(4);
        list.convert_to_doubly();
        list.display_in_doubly();
    }
}
