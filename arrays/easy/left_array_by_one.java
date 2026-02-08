package arrays.easy;

import java.util.Scanner;

public class left_array_by_one {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        rotate_left_array_by_one(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }    
    }

    public static int[] rotate_left_array_by_one(int[] arr){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
}
