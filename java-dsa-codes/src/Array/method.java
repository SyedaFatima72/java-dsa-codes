public class method {
    public static void main(String[] args) {
       String x="value";
        int[] y={1,2,3,4,5};
        m(x,y);
       System.out.println(x);

    }


    public static void m(String  x,int[] y){

      for (int i=0;i<4;i++){
//          y[i]=i++;
          int c=y[i];
          System.out.println(String.valueOf(c));
      }


    }

}
