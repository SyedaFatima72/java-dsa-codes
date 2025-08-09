public class node {
    int value;
    node ref;

    public static void main(String[] args) {
            //head
        node n1=new node();//instance call huwa hai
        n1.value=35;

        node n2=new node();

        n1.ref=n2;
        n2.value=40;

         node n3=new node();
        n2.ref=n3;

        System.out.println(n1.value);
        System.out.println(n2.value);
        System.out.println(n3.value);

        node head = null;
        node current = null;

        for (int i = 0; i < 3; i++) {
            node newNode = new node();
            newNode.value = 35 + i * 5;

            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.ref = newNode;
                current = newNode;
            }
        }

        node temp = head;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.ref;
        }
    }
}
