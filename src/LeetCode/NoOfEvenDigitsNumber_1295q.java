package LeetCode;

public class NoOfEvenDigitsNumber_1295q {
    static int findNumbers(int[] nums) {
        int count=0;
        for (int num : nums) {
            if (((int)Math.log10(num)+1) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={0};
        System.out.println(findNumbers(nums));
    }
}
