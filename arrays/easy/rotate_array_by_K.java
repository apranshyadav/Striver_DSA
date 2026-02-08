package arrays.easy;

import java.util.Scanner;

public class rotate_array_by_K {
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
        int n=arr.length;
        int[] temp = new int[k];
        for(int i=0; i<k; i++){
            temp[i] = arr[i];
        }
        for(int i=k; i<n; i++){
            arr[i-k] = arr[i];
        }
        for(int i=n-k; i<n; i++){
            arr[i] = temp[i-(n-k)];
        }
    }
}
