public class Rotate_Array_by_n {
    public static void main(String[] args) {
        int[] arr={-1,-100,3,99};
        int k=3;

        int[] arr1=mySolution(arr,k);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }

    public static int[] mySolution(int[] arr,int k){
        int[] new_arr=new int[arr.length];

        
        int j=k;
        for (int i = arr.length-1; i >= (arr.length-1)-k; i--) {
            new_arr[i]=arr[j];
            j--;
            
        }

        for (int i = 0; i < (arr.length-1)-k; i++) {
            new_arr[i]=arr[k+i];
        }



        return new_arr;
    }
    
}
