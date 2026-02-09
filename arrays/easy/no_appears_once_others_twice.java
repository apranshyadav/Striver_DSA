package arrays.easy;

import java.util.Scanner;

public class no_appears_once_others_twice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.print(number_appears_once_others_twice(arr));
    }

    public static int number_appears_once_others_twice(int[] arr){
        int r = 0;
        for(int i:arr){
            r^=i;
        }
        return r;
    }
}
