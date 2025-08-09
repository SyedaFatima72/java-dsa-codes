public class consective_1 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,18,19,20};
        int dlt = 0;
        for (int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1] && a[i]==a[i+2] && a[i]==a[i+3]){
//                System.out.println(a[i]);
//                for (int j=0;j<a.length-1;i++){
//                    System.out.println(a[i]);
//                }
//                a[i]=a[i+1];
                dlt =a[i];
//                   System.out.println(dlt);
            }

        }
        for (int i=0;i< a.length;i++){
          if(a[i]==dlt){
              for (int j=i;j<a.length-1;j++){
                  a[i]=a[i+1];
              }
          }
        }
        for (int i=0;i<a.length-1;i++){
            System.out.println(a[i]);
        }
    }
}
