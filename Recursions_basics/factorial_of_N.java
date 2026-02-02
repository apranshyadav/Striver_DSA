package Recursions_basics;

import java.util.Scanner;

public class factorial_of_N {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(fact(n));
    }

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
