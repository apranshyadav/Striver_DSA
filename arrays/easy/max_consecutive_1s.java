package arrays.easy;

import java.util.Scanner;

public class max_consecutive_1s {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.print(max_consecutive_ones(arr));
    }

    public static int max_consecutive_ones(int[] arr){
        int maxcount=0;
        int n = arr.length;
        int cnt=0;
        for(int i=0;i<n; i++){
            
            if(arr[i]==1){
                cnt++;
                maxcount = Math.max(cnt,maxcount);
                
            }
            else if(arr[i]==0){
                cnt = 0;
            }
        }

        return maxcount;

    }
}
