package Recursions_basics;

import java.util.Scanner;

public class Nth_fibonacchi_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(Fibonacchi(n));
    }

    public static int Fibonacchi(int n){
        if(n<=1){
            return n;
        }
        int last = Fibonacchi(n-1);
        int slast = Fibonacchi(n-2);
        return last+slast;
    }
}
