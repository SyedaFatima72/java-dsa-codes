package Assignment;

public class prime_number {
    public static void main(String[] args) {
        int[] array={11,12,13,14,15,16,17,18,19,20};
//        int check=3%2;
//        System.out.println(check);
        for(int i=0;i<=array.length-1;i++){
            if(array[i]>2 && array[i]%2!=0){
                System.out.println(array[i]+" is prime");
            }else {
                System.out.println(array[i]+" is not prime");

            }
        }

    }
}
