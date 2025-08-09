class Node {
    Node next;
    int value;

    public Node(int data) {
        this.value = data;
        this.next = null;
    }
}

public class linked_list {
    Node head;
    Node tail;
    int size;

    public void insert(int value) {
        Node node = new Node(value);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void display() {
        Node nextNode = head;
        while (nextNode != null) {
            System.out.print(nextNode.value + " --> ");
            nextNode = nextNode.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        linked_list list = new linked_list();
        list.insert(4);
        list.insert(5);
        list.display();
    }
}
