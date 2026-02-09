package arrays.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class union_2_sorted_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        sc.close();
        for(int x : union_two_sorted_array(arr1, arr2)){
            System.out.print(x+" ");
        }
   
    }

    public static int[] union_two_sorted_array(int[] arr1, int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        Set<Integer> st = new HashSet<>();
        
        for(int i=0;i<n;i++){
            st.add(arr1[i]);
        }
        for(int i=0;i<m;i++){
            st.add(arr2[i]);
        }

        int[] arr3 = new int[st.size()];
        int i=0;
        Iterator<Integer> value = st.iterator();
        while(value.hasNext()){
            arr3[i] = value.next();
            i++;
        }

        return arr3;

    }
}
