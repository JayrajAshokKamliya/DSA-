import java.util.*;
public class Hashing_Char {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String word=sc.next();


        //precompute
        int[] hash=new int[27];

        for (int i = 0; i < word.length(); i++) {
            hash[word.charAt(i)-'a']++;
            
        }

        int query=sc.nextInt();
        while(query-- >0){
            String name=sc.next();
            System.out.println(hash[name.charAt(0)-'a']);

        }
    }
    
}
