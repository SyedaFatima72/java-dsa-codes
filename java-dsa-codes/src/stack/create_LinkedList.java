package stack;

public class create_LinkedList {
    static Node head;


    static class Node {
        int data;
        Node next;


        Node(int data) {
            this.data = data;
        }
    }

    static class Stack {
        public void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }

        }

        public void pop() {
            if (head != null) {
                head = head.next;
            }
        }
        public static boolean isEmpty() {
            return head == null;
        }
        public static int peek(){

                return head.data;

        }


    }

    public static void main(String[] args) {
        Stack list = new Stack();
        list.push(1);
        list.push(2);
        list.push(3);

        while (!list.isEmpty()) {
            System.out.println(list.peek());
            list.pop();
        }
    }
}
