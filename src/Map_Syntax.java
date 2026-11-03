import java.util.*;

public class Map_Syntax {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr=new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        HashMap<Integer, Integer> mpp= new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);//mpp[arr[i]]++;
        }

        //Iteration

        ArrayList<Integer> keys = new ArrayList<>(mpp.keySet());

        for (int i = 0; i < keys.size(); i++) {

            int key = keys.get(i);

            System.out.println(key + " -> " + mpp.get(key));
        }

        int q=sc.nextInt();
        while(q-- >0){
            int num=sc.nextInt();
            // Fetch frequency
            System.out.println(mpp.getOrDefault(num, 0));
        }

        sc.close();


    }
    
}
