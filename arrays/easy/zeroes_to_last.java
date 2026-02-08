package arrays.easy;

import java.util.Scanner;

public class zeroes_to_last {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        zeroes_to_last_array(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
    public static void zeroes_to_last_array(int[] arr){
        int i = 0;
        int n = arr.length;
        int count_zero=0;
        for(int j=0;j<n;j++){
            if(arr[j]!=0){
                arr[i] = arr[j];
                i++;
            }
            else if(arr[j]==0){
                count_zero++;
            }
        }
        for(int l=n-1;l>n-count_zero-1;l--){
            arr[l] = 0;
        }
    }
}
