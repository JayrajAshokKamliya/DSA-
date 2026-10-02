import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int num=sc.nextInt();
        System.out.println("Enter the array: ");
        int[] arr=new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]=sc.nextInt();
        }

        //Optimal approach
        int largestnum=arr[0];

        int secondnum=-1;
        //int secondnum=Integer.MIN_VALUE;   If the arr include negative number too
        
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>largestnum){
                
                secondnum=largestnum;
                largestnum=arr[i];
                

            }
            else if(arr[i]>secondnum && arr[i]<largestnum){
                secondnum=arr[i];
            }
        }

        System.out.println(secondnum);
    }
    
}
