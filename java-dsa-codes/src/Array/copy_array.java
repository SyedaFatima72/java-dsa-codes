public class copy_array {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        int[] array3 = new int[8];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i=0;i<array3.length;i++){
            System.out.println(array3[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            array3[i + array1.length] = array2[i];
        }

//        for (int element : array3) {
//            System.out.print(element + " ");
//        }
        for (int i=0;i<array3.length;i++){
            System.out.println(array3[i]);
        }
    }
}
