package Maps.HashSet;

import java.util.HashSet;

public class TopKfrequentElements {
         static int longestConsecutive(int[] nums) {
         if (nums.length == 0) return 0;

         HashSet<Integer> set = new HashSet<>();
         for (int num : nums) {
             set.add(num);
         }

         int maxLen = 0;

         for (int num : nums) {
             // only start if it's the beginning of a sequence
             if (!set.contains(num - 1)) {
                 int len = 1;

                 while (set.contains(num + 1)) {
                     num++;
                     len++;
                 }

                 maxLen = Math.max(maxLen, len);
             }
         }

         return maxLen;
    }
        public static void main (String[]args){
            int[] nums = {100, 4, 200, 1, 3, 2};
            int ans = longestConsecutive(nums);
            System.out.println(ans);
        }
}