package arrays.easy;

import java.util.Scanner;

public class rotate_array_by_K {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        rotate_array_by_K_elements(arr);
        for(int i:arr){
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotate_array_by_K_elements(int[] arr){
        
    }
}
