package Daily_Problems.Day_1;

public class target {
    public static int find (int[] arr,int target){
        for(int i=0;i < arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }   
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,8,1,9};
        System.out.println(find(arr,1));
    }
}
