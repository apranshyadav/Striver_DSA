package basic_hashing;

import java.util.Scanner;

public class hashing{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // PRECOMPUTE
        int[] hash = new int[13];
        for(int i=0; i<n; i++){
            hash[arr[i]]+=1;
        }


        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int x = sc.nextInt();
            //FETCH
            System.out.println(hash[x]);
        }
        sc.close();
    }

}