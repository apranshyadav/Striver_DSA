package Recursions_basics;

import java.util.Scanner;

public class check_string_Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(check_Palin(0, s.length(), s));
    }

    public static boolean check_Palin(int i, int n, String s){
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        return check_Palin(i+1, n, s);
    }
}
