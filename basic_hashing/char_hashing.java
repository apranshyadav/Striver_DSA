package basic_hashing;

import java.util.Scanner;

public class char_hashing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //PRECOMPUTE
        int[] hash = new int[25];
        for(int i=0; i<s.length();i++){
            hash[s.charAt(i)-'a']+=1;
        }

        int q = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<q; i++){
            String k = sc.nextLine();
            System.out.println(hash[k.charAt(0)-'a']);
        }
        sc.close();

        
    }
}
