package Recursions_basics;

import java.util.*;
public class print_name_n_times {
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
    System.out.println("SUNNY");
    f(i+1,n);

    }
}
