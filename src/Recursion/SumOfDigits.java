package Recursion;

public class SumOfDigits {
    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return sumOfDigits(n/10)+(n%10);
    }
    public static void main(String[] args) {
        System.out.println("sum of digits :"+sumOfDigits(123));
    }
}
