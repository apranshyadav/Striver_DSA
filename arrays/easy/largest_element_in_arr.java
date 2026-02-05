package arrays.easy;

import java.util.Scanner;

public class largest_element_in_arr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print(largest_element(arr));
    }

    public static int largest_element(int[] arr){
        //By sorting
        //Arrays.sort(arr);
        //return arr[arr.length-1];

        // Optimal
        int max = arr[0];
        for(int i=1; i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
