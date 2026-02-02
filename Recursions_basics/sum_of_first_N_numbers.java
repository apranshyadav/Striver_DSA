// PARAMETERIZED WAYYYYY

package Recursions_basics;

import java.util.Scanner;

public class sum_of_first_N_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        f(n, 0);
    }

    public static void f(int n, int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        f(n-1,sum+n);
    }
}
