package Assignment;

public class even_odd {
    public static void main(String[] args) {

        int[] a={1,2,3,4,5,6,7,8,0,0};

        int sumeven=0;
        int sumodd=0;

        for (int i=0;i<= a.length-1;i++){
            if(a[i]%2==0){
                System.out.println(a[i]+" even");
                sumeven+=a[i];

            }else {
                System.out.println(a[i]+" odd");
                sumodd+=a[i];
            }
        }

        a[8]=sumeven;
        a[9]=sumodd;
        for (int i=0;i<= a.length-1;i++){
            System.out.println(a[i]);
        }
    }
}
