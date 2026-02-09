package arrays.easy;

import java.util.Scanner;

public class linear_search_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int x = sc.nextInt();
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print(linear_search_on_array(arr, x));
   
    }

    public static int linear_search_on_array(int[] arr, int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
