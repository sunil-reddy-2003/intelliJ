package LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures_739q {
    static int[] dailyTemperatures(int[] temperatures) {
        int days=1;
//        73,74,75,71,69,72,76,73
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            if(temperatures[i]<temperatures[i+1]){
                stack.push(days);
            }else{





            }
        }
        stack.push(0);

        System.out.println(stack);

        return new int[]{0,1};
    }
    public static void main(String[] args) {
        int[] temperatures={73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}
