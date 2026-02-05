package arrays.easy;

import java.util.Scanner;

public class second_largest_element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print(second_largest(arr));
    }

    public static int second_largest(int[] arr){
        //By Sorting
        //Arrays.sort(arr);
        int n = arr.length;
        //int largest = arr[n-1];
        //for(int i=n-2; i>=0; i--){
            //if(arr[i]!=largest){
            //return arr[i];
            //break;
            //}
        //}


        // Optimal 
        int largest = arr[0];
        for(int i=1;i<n;i++){
            largest = Math.max(largest,arr[i]);
        }

        int slargest = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>slargest && arr[i]!=largest){
                slargest = arr[i];
            }
        }

        return slargest;
    }
}
