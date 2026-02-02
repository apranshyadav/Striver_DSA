package Recursions_basics;

public class reverse_array {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] arr1 = revers_array(0,arr.length-1,arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr1[i]+" ");
        }

    }

    public static int[] revers_array(int l, int r, int[] arr){
        if(l>=r){
            return arr;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        return revers_array(l+1, r-1, arr);
    }
}
