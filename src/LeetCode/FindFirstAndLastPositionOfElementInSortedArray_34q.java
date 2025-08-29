package LeetCode;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray_34q {
     static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};

        ans[0]=findPos(nums,target,true);
        ans[1]=findPos(nums,target,false);

        return ans;
    }
    static int findPos(int[] nums,int target,boolean firstOrNot){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                ans=mid;
                if(firstOrNot){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={5,7,7,7,7,8,8,10};
//        int[] nums={};
        int target=7;
//        System.out.println(Arrays.toString(searchRange(nums,target)));
        System.out.println(Arrays.toString(searchRange(nums,target)));

    }
}
