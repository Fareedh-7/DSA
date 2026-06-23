package Leetcode_Problems.Day_3;

public class thirdMax {
    public static int threeMax(int[] arr){
        Integer first = null;
        Integer second = null;
        Integer third = null;
        for(int i = 0;i < arr.length; i++){
            if((first != null && arr[i] == first) || (second != null && arr[i] == second)||(third!=null && arr[i] == third)){
                continue;
            };
            if(first == null || arr[i] > first){
                third =second;
                second = first;
                first = arr[i];
            }
            else if(second == null || arr[i] > second){
                third = second;
                second = arr[i];
            }else if(third == null || arr[i] > third){
                third = arr[i];
            }
        }
        return third == null ? first : third;
    }
    public static void main (String[] args){
        int[] arr = {3,2,1};
        int result = threeMax(arr);
        System.out.println(result);
    }
}
