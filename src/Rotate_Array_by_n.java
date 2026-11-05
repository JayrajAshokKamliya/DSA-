/**
 * Rotate_Array_by_n
 */
public class Rotate_Array_by_n {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=2;
        System.out.println("myApproach");
        int[] arr1=mySolution(arr,k);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("optimal approach");
        int[] arr2=OptimialApproach(arr,k);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
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
    public static int[] OptimialApproach(int arr[], int k){
        int i=0;
        int n=arr.length;
        reverseArray(arr, i, n-k-1);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, i, n-1);
        return arr;
    }

    public static int[] reverseArray(int[] arr,int start,int end){
        
        for (int i = start; i < end; i++,end--) {
            int temp=arr[i];
            arr[i]=arr[end];
            arr[end]=temp;

        }
        //or
        // while(start<=end){
        //     int temp=arr[start];
        //     arr[start]=arr[end];
        //     arr[end]=temp;
        //     start++;
        //     end--;
        // }
        return arr;
    }
}
    

