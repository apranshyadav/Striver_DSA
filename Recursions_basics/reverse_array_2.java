package Recursions_basics;

public class reverse_array_2 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] arr1 = revers_array(0,arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr1[i]+" ");
        }

    }

    public static int[] revers_array(int i, int[] arr){
        int n = arr.length;
        if(i>=n/2){
            return arr;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        return revers_array(i+1, arr);
    }
}
