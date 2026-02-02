package Recursions_basics;

import java.util.Scanner;

public class sum_of_first_N_numbers_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(f(n));
    }
    public static int f(int n){
        if(n==0){
            return 0;
        }
        return n + f(n-1);
    }
}
