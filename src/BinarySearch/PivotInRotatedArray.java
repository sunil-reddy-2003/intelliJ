package BinarySearch;

public class PivotInRotatedArray {
    static int getPivot(int[] nums){
        int start=0;
        int end= nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]>nums[mid+1]){
                return nums[mid];
            } else if (nums[mid]<nums[mid-1]) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(getPivot(arr));
    }
}
