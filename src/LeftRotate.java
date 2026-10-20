public class LeftRotate{
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5};

        int[] arr2={1,2,3,4,5};

        System.out.println("My approach:");
        int[] arr1=mySolution(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("\nOptimal Approach: ");
        int[] arr3=optimalApproach(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr3[i]);
        }



    }
    
    
    public static int[] mySolution(int[] arr){
        int j=0;
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j++;
        }
        return arr;

    }
    public static int[] optimalApproach(int[] arr){
        int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
}