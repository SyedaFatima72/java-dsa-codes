package Queue;

public class Circular_array {
    static class C_Queue {
        int array[];
        int size;
        int rear = -1;
        int front = -1;
        int result;

        C_Queue(int size) {
            this.size = size;
            array = new int[size];
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            array[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            result = array[front];
            if (front == rear) {
                front = rear = -1;

            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return array[front];
        }

//        public int data() {
//            return result;
//        }
    }

    public static void main(String[] args) {
        C_Queue list = new C_Queue(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.remove());
        list.add(6);
        System.out.println(list.remove());
        list.add(7);
//        System.out.println(list.remove());
//        System.out.println(list.remove());
//        System.out.println(list.remove());
//        System.out.println(list.remove());
//        System.out.println(list.remove());
//
        while (!list.isEmpty()) {
            System.out.println(list.peek());
            list.remove();
//            System.out.print("List after removal " + list.data() + "\t");
        }
    }
}
