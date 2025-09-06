package BasicPrograms;

import java.util.Arrays;

public class PrimeNumbers {
//    static int[] prime(int num){
//        int[] ans=new int[10];
//        for (int i = 2; i < Math.sqrt(num); i++) {
//            if(i%num==0){
//                ans[i]=i;
//            }
//        }
//        return ans;
//    }
    public static void main(String[] args) {
        int num=10;
//        System.out.println(Arrays.toString(prime(n)));
        for (int i = 2; i*i< num; i++) {
            if(i%num!=0){
                System.out.println(i);
            }
        }
    }
}
