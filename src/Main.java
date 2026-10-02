import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Length of the array: ");
        int n= sc.nextInt();
        System.out.println("K value: ");
        int k= sc.nextInt();
        //For constant k
//        if (k > n || k <= 0) {
//            System.out.println("Invalid window size.");
//            return;
//        }
        System.out.println("Array value till length: ");
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
//        Constant k
//        int Constwindow=constantWindow(arr,n,k);
//        System.out.println(Constwindow);

        int maxLenght=largestSubarray(arr,n,k);
        System.out.println("Max Length: "+maxLenght);

    }
    public static int constantWindow(int[] arr,int n,int k){
        int l=0;
        int r=k-1;
        int sum=0;
        for(int i=l;i<k;i++){
            sum+=arr[i];
        }
        int maxSum=sum;
        while(r<n-1){
            sum=sum-arr[l];
            l++;
            r++;
            sum=sum+arr[r];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public static int largestSubarray(int[] arr,int n,int k){
        int l=0;
        int r=0;
        int sum=0;
        int maxLength=0;
        while(r<n){
            sum+=arr[r];
            if(sum>k){
                sum-=arr[l];
                l++;
            }
            if(sum<=k){
                maxLength=Math.max(maxLength,r-l+1);

            }
            r++;

        }
        return maxLength;
    }


}