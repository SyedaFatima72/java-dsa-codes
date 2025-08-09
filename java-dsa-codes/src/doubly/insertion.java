package doubly;

public class insertion {
    Node head;
    Node tail;
    int postion =3;
    //  int s;

    class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }


    public void insertatstart(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }
    }
    public void insertatmiddle(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {

            int positionToInsert = postion;
            Node temp = head;
            Node ptr=temp.next;
            for (int i=1;i<positionToInsert-1;i++){
                temp=ptr;
                ptr=ptr.next;
            }
            newNode.prev=temp;
            newNode.next=ptr;
            temp.next=newNode;
            ptr.prev=newNode;
//
//            for (int i = 1; i < positionToInsert - 1 && temp != null; i++) {
//                temp = temp.next;
//             //   s=i;
//            }
//
//            if (temp != null) {
//                newNode.next = temp.next;
//                if (temp.next != null) {
//                    temp.next.prev = newNode;
//                }
//                temp.next = newNode;
//                newNode.prev = temp;
//            }
           }
    }

//    public void insertatmiddle(int data){
//        Node newNode=new Node(data);
//        if (head==null){
//            head=newNode;
//            tail=newNode;
//        }
//        else {
//           Node temp1=head;
//           Node temp2=temp1.next;
//           for (int i=1;i<postion-1;i++){
//               temp1=temp2;
//               newNode.next=temp2;
//               temp1.next=newNode;
//               temp2.prev=temp1;
//           }
//
//        }
//    }

    public void insertatend(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
        }else{

            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    public void display(){
      //  System.out.println(positionToInsert);
      //  System.out.println(s);

        Node x=head;
        while (x!=null){
            System.out.print(x.data+"<->");
            x=x.next;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        insertion list=new insertion();
        list.insertatend(5);
        list.insertatstart(3);
        list.insertatstart(2);
        list.insertatmiddle(4);
        list.display();

    }
}
