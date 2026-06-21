package Leetcode_Problems.Day_2;

public class findGCD {
    public static int findGCDOfArray(int[] arr){
        int m = arr[0];
        int n = arr[0];
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] > m){
                m = arr[i];
            }
            if(arr[i] < n){
                n = arr[i];
            }
        }
        return getGCD(m,n);
    }   
    private static int getGCD(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
