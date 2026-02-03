package basic_hashing;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_number_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n; i++){
            arr[i] = sc.nextInt();
        }

        //PRECOMPUTE
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i=0;i<n;i++){
            hashmap.put(arr[i], hashmap.getOrDefault(arr[i], 0)+1);
        }


        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            int k = sc.nextInt();
            //FETCH
            System.out.println(hashmap.getOrDefault(k,0));
        }
        sc.close();
    }
}
