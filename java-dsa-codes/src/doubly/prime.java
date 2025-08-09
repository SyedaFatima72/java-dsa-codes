package doubly;

public class prime {
    Node head;
    Node tail;
    Node current;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
    }
}
public void insert(int data){
    Node newNode=new Node(data);
    if (head==null){
        head=newNode;
        tail=newNode;
    }
    else {
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
  }
  public static boolean isPrime(int data){
    int temp =0;
    if (data==1){
        return false;
    }
    if (data==2){
        return true;
    }
    if (data%2==0){
        return false;
    }
    for (int i=3;i<data-1;i++){
        if (data%i==0){
            temp=temp+1;
        }
        if (temp>0){
            return false;
        }
        else {
            return true;
        }
    }return true;
  }
  public void display(){
    Node x=head;
      System.out.print("null"+" <-> ");
    while(x!=null){
        if (isPrime(x.data)) {
            System.out.print(x.data + " <-> ");
        }
        x=x.next;
    }
      System.out.println("null");
  }

    public static void main(String[] args) {
        prime list=new prime();
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
