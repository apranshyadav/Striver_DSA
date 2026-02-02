package Recursions_basics;

import java.util.Scanner;

public class print_1_to_N_backtracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        f(n, n);
    }


    public static void f(int i, int n){
    if(i<1){
        return;
    }
    f(i-1,n);
    System.out.println(i);

    }

}
