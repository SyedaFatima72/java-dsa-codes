package Queue;

public class test {
    static public class queue{
        static int[] array;
        static int size;
        static int rear;

        queue(int size){
            array=new int[size];
            this.size=size;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static boolean isfull(){
            return rear>=array.length-1;
        }
        public static void add(int data){
            if (isfull()){
                System.out.println("stack overflow");
            }
            else{
                rear++;
                array[rear]=data;
            }
        }
        public static int pop(){
            if (isEmpty()){
                System.out.println("stack underflow");
                return -1;
            }
                int popp=array[0];
                for (int i=0;i<=array.length;i++){
                    array[i]=array[i+1];
                }

               rear--;
               return popp;
        }

    }
}
