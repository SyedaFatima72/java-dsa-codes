package Assignment;

public class even_odd {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void findAndInsertSums() {
        int even =0;
        int odd=0;
        Node temp=head;
        while (temp!=null){
            if (temp.data%2==0){
                even+=temp.data;
                System.out.println(even);

            }
            else {
                odd+=temp.data;
                System.out.println(odd);
            }
        }

//        int sumEven = 0;
//        int sumOdd = 0;
//
//        Node current = head;
//
//        while (current != null) {
//            if (current.data % 2 == 0) {
//                sumEven += current.data;
//            } else {
//                sumOdd += current.data;
//            }
//            current = current.next;
//        }
//
//        if (sumEven != 0) {
//            Node evenSumNode = new Node(sumEven);
//
//            Node lastNode = head;
//            while (lastNode.next != null) {
//                lastNode = lastNode.next;
//            }
//
//            lastNode.next = evenSumNode;
//            evenSumNode.next = head;
//            head = evenSumNode;
//        }
//
//        if (sumOdd != 0) {
//            Node oddSumNode = new Node(sumOdd);
//
//            Node lastNode = head;
//            while (lastNode.next != null) {
//                lastNode = lastNode.next;
//            }
//
//            lastNode.next = oddSumNode;
//        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        even_odd list = new even_odd();
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

        System.out.println("Original List:");
        list.display();

        list.findAndInsertSums();

        System.out.println("\nList after inserting sums:");
        list.display();
    }
}
