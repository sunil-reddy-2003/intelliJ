package LeetCode;

import java.util.Arrays;

public class PlusOne_66q {
    static int[] plusOne(int[] digits) {

        for (int i=digits.length-1; i>=0; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int[] ans=new int[digits.length+1];
        ans[0]=1;

        return ans;
    }

    public static void main(String[] args) {
//        int[] digits = {9,4,9,4,9,9,9,4,1,0};
        int[] digits={9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

}
