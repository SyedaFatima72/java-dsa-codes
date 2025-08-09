package doubly;

public class middle {

        Node head;
        Node tail;
        Node ans;

        class Node {
            int data;
            Node next;
            Node prev;

            Node(int data) {
                this.data = data;
            }
        }

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

        public void Middle() {
            Node current = head;
            int length = 0;
            Node middle = head;

            while (current != null) {
                length++;
                if (length % 2 == 0) {
                    middle = middle.next;
                }
                current = current.next;
            }
            if (length % 2 == 1) {
                middle = middle.next;
            }
            ans = middle;
        }

        public void display() {
            Node x = head;
            int target;

            System.out.print("null" + "<->");
            while (x != null) {
                System.out.print(x.data + "<->");
                x = x.next;
            }
            System.out.print("null");
            System.out.println("\nMiddle part is " + ans.data);
        }

        public static void main(String[] args) {
            middle list = new middle();
            list.insert(1);
            list.insert(2);
            list.insert(3);
            list.insert(4);
            list.insert(5);

            list.Middle();
            list.display();
        }

}
