package Recursions_basics;

import java.util.Scanner;

public class print_1_to_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        f(1, n);
    }


    public static void f(int i, int n){
    if(i>n){
        return;
    }
    System.out.println(i);
    f(i+1,n);

    }

}
