package arrays.easy;

import java.util.Scanner;

public class missing_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.print(missing_number(arr));
    }

    public static int missing_number(int[] arr){
        int n = arr.length; 
        for(int i=1;i<=n; i++){
            boolean found = false;
            for(int j=0; j<n; j++){
                if(arr[j]==i){
                    found = true;
                    break;
                }
            }
            if(found==false){
                return i;
            }
             
        }
        return -1;
    }
}
