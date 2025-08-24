package LeetCode;

import java.util.*;

public class ThreeSum_15q {
    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);  // -4,-1,-1,0,1,2
        List<List<Integer>> outer = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // 🔥 skip duplicate i values
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int target = nums[i] + nums[start] + nums[end];
                if (target == 0) {
                    outer.add(Arrays.asList(nums[i], nums[start], nums[end]));

                    // 🔥 skip duplicate start and end values
                    while (start < end && nums[start] == nums[start + 1]) start++;
                    while (start < end && nums[end] == nums[end - 1]) end--;

                    start++;
                    end--;
                } else if (target < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans); // [[-1, -1, 2], [-1, 0, 1]]
    }
}


//    static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> outer = new ArrayList<>();
//
//        for(int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                for (int k = j+1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        List<Integer> triplet = new ArrayList<>();
//                        triplet.add(nums[i]);
//                        triplet.add(nums[j]);
//                        triplet.add(nums[k]);
//                        Collections.sort(triplet); // to handle duplicates
//                        if (!outer.contains(triplet)) { // avoid duplicate triplets
//                            outer.add(triplet);
//                        }
//                    }
//                }
//            }
//        }
//        return outer;
//    }

