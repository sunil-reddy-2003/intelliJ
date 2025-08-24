package LeetCode;

import java.util.Arrays;

public class TwoSum_2 {
    static int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        while(start<end){

            if(numbers[start]+numbers[end]==target){
                return new int[]{start,end};
            }else if((numbers[start]+numbers[end])>target){
                end--;
            }
            else{
                start++;
            }
        }
        return new int[]{start,end};
    }

    public static void main(String[] args) {
//        int[] nums={2,7,11,15};
        int[] nums={2,3,4,9};
        int target=6;
        int[] ans=twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
}
