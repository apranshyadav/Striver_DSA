package arrays.easy;

import java.util.Scanner;

public class rotate_array_by_K_revtecnique {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        rotate_array_by_K_elements(arr, k);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void rotate_array_by_K_elements(int[] arr, int k){
        int n = arr.length;
        reverse_arr(arr, 0, k-1);
        reverse_arr(arr, k, n-1);
        reverse_arr(arr, 0, n-1);
    }

    public static void reverse_arr(int[] arr, int start, int end){
        while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
    }
}
