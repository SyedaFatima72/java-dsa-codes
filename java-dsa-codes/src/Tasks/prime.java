package Assignment;

public class prime {
    Node head;
    Node current;
    Node x;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        } else {
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

//        public void isPrime(int data) {
//            int temp = 0;
//
//            int check = data;
//
//            if (check > 2) {
//                System.out.println(x.data + "   Not Prime");
//            }
//            for (int i = 2; i < check; i++) {
//                if (check % i == 0) {
//                    temp = temp + 1;
//                }
//                if (temp > 0) {
//                    System.out.println(x.data + "   Not prime");
//                } else {
//                    System.out.println(x.data + "   is Prime");
//                }
//            }
//        }
//    public void display(){
//        x = head;
//        while (x.next!=null){
//            if (isPrime(data))
//            x = x.next;
//        }
//    }

    public static boolean isPrime(int data) {
        int temp=0;
        if (data < 2) return false;
        if (data == 2) return true;
        if (data % 2 == 0) return false;
//
//        for (int i = 3; i <= Math.sqrt(data); i += 2) {
//            if (data % i == 0) return false;
//        }
        for (int i=3;i<data-1;i++){
            if (data%i==0){
                temp=temp+1;
                //temp++;
            }
            if (temp>0){
                return false;
            }else {
                return true;
            }
        }

        return true;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            int data = current.data;

            if (isPrime(data)) {
                System.out.println(data + " is prime.");
            } else {
                System.out.println(data + " is not prime.");
            }

            current = current.next;
        }
    }

    public static void main(String[] args) {
        prime list = new prime();
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
        list.display();
    }
}
