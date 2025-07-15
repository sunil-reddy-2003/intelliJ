package sorting;

import java.util.Arrays;

public class QuickSortPractice {
    public static void sortMethod(int left,int right,int[] nums){
        if(left>=right){return;}
        int start=left;
        int end=right;
        int mid=(start+end)/2;
        int pivot=nums[mid];
        while(start<=end){
            while (nums[start]<pivot){
                start++;
            }
            while (nums[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
        sortMethod(left,end,nums);
        sortMethod(start,right,nums);
    }
    public static void main(String[] args) {
        int[] nums={5,3,4,1,0};
        QuickSortPractice.sortMethod(0,nums.length-1,nums);
        System.out.println(Arrays.toString(nums));
    }
}
