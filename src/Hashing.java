import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();

        System.out.println("Enter the Array: ");
        int[] arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        //precompute
        int[] hash=new int[13];

        for (int i = 0; i < size; i++) {
            hash[arr[i]]++;
        }


        // Fetch frequencies for queries
        int query=sc.nextInt();
        while(query-- > 0){
            //fetch
            int number = sc.nextInt();
            System.out.println(hash[number]);
        }



    }
}
