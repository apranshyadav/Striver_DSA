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
            }
            else if(arr[i]==0){
                maxcount = Math.max(cnt,maxcount);
                cnt = 0;
            }
            maxcount = Math.max(maxcount, cnt);
        }

        return maxcount;

    }
}
