public class delete {
    public static void main(String[] args) {
        int[] array={10,20,30,40};
        int dlt=20;
        for (int i=0;i<array.length;i++){
            if (array[i]==dlt){
                //System.out.println(array[i]);...(20)
                for(int j=i;j<array.length;j++){
                   array[i]=array[i+1];

                }
                break;
            }
        }
        for (int i=0;i<array.length-2;i++){

           System.out.println(array[i]);
        }



    }
}
