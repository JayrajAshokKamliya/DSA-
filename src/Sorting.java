

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Sorting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = {1, 1, 2, 2, 2, 3, 3};

        // ================================================
        // Jayraj Approach
        // Remove duplicates from sorted array
        // ================================================

        int j = 1;
        int i = 0;
        int k = 0;

        int[] newarr = new int[array.length];

        newarr[k] = array[i];
        k++;

        while (j < array.length) {

            if (array[i] == array[j]) {
                j++;
            } 
            else {
                i = j;
                newarr[k] = array[i];
                k++;
                j++;
            }
        }

        System.out.println("Jayraj Approach:");

        for (int index = 0; index < k; index++) {
            System.out.println(newarr[index]);
        }


        // =================================================
        // Brute Approach - HashSet
        // =================================================

        System.out.println("Brute Approach - HashSet:");

        int[] result1 = BruteApproach(array);

        for (int index = 0; index < result1.length; index++) {
            System.out.println(result1[index]);
        }


        // =================================================
        // LinkedHashSet Approach
        // =================================================

        System.out.println("LinkedHashSet Approach:");

        int[] result2 = LinkedListApproach(array);

        for (int index = 0; index < result2.length; index++) {
            System.out.println(result2[index]);
        }

        System.out.println("Optimal Approach:");

        int[] result3 = OptimalApproach(array);

        for (int index = 0; index < k; index++) {
            System.out.println(newarr[index]);
        }

        sc.close();
    }


    // =====================================================
    // HashSet Approach
    // =====================================================

    public static int[] BruteApproach(int[] array) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }

        int[] newarr = new int[set.size()];

        Object[] temp = set.toArray();

        for (int i = 0; i < temp.length; i++) {
            newarr[i] = (Integer) temp[i];
        }

        return newarr;
    }


    // =====================================================
    // LinkedHashSet Approach
    // =====================================================

    public static int[] LinkedListApproach(int[] array) {

        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }

        int[] newarr = new int[set.size()];

        Object[] temp = set.toArray();

        for (int i = 0; i < temp.length; i++) {
            newarr[i] = (Integer) temp[i];
        }

        return newarr;
    }
     // =====================================================
    // Optimize Approach
    // =====================================================

    public static int[] OptimalApproach(int[] arr){
        int k=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[i-1]){
                arr[k]=arr[i];
                k++;
            }
        }

        //Second approach
        int j=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[j]){
                arr[j+1]=arr[i];
                j++;
            }
        }
        return arr;
    }
}
