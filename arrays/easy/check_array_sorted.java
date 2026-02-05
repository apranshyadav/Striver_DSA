package arrays.easy;

import java.util.Scanner;

public class check_array_sorted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print(check_whether_array_is_sorted(arr));
    }

    public static boolean check_whether_array_is_sorted(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<=arr[i+1]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    } 
}
