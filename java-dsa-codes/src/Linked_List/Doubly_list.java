package Linked_List;

public class Doubly_list {
    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }


        Node head;
        Node tail;

        // Insert at the end of the list
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;

            }
        }

        // Display the list from head to tail
        public void displayForward() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " <-> ");
                current = current.next;
            }
            System.out.println("null");
        }

        // Display the list from tail to head
        public void displayBackward() {
            Node current = tail;
            while (current != null) {
                System.out.print(current.data + " <-> ");
                current = current.prev;
            }
            System.out.println("null");
        }


        public static void main(String[] args) {
            Doubly_list list = new Doubly_list();

            list.insert(1);
            list.insert(2);
            list.insert(3);
            list.insert(4);
            list.insert(5);

            System.out.println("Doubly Linked List (Forward):");
            list.displayForward();

            System.out.println("Doubly Linked List (Backward):");
            list.displayBackward();
        }
    }



