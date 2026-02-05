package arrays.easy;

import java.util.Scanner;
//import java.util.Set;
//import java.util.HashSet;

public class rem_duplicate_elements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        remove_duplicates(arr);
    }

    public static void remove_duplicates(int[] arr){
        int n = arr.length;

        /*  Brute Force - Set
        Set<Integer> st = new HashSet<>();
        for(int i=0; i<n; i++){
            st.add(arr[i]);
        }
        */

        //2-Pointer Approach
        int i=0;
        for(int j=1; j<n; j++){
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.print(i);
    }

}
