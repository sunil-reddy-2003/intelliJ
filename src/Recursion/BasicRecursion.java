package Recursion;

public class BasicRecursion {
    static int revSum=0;
      static int revNumber(int n){
        if(n==0){
            return 0;
        }
        revSum=revSum*10+(n%10);
        return revNumber(n/10);
    }

    static void recursion(int n){
        if(n==0){
            return;
        }
//        System.out.println("before: "+n);
        recursion(n-1);
        System.out.println("after: "+n);
    }

    static int sum(int n){
        if(n<=0) {
            return 0;
        }
            return n+sum(n-1);
    }

    static int fact(int n){
        if(n<=0){
            return 1;
        }
        return n*fact(n-1);
    }

    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return sumOfDigits(n/10)+(n%10);
    }
    static int profuctOfDigits(int n){
        if(n==0){
            return 1;
        }
        return profuctOfDigits(n/10)*(n%10);
    }

    static void concept(int n){
        if(n==0) return;
        System.out.println(n);
        //pass the value and subtract next
//        concept(n--);
        //subtract first and then pass the value
        concept(--n);
    }
    public static void main(String[] args) {
         recursion(5);
        System.out.println("factorial:"+fact(5));
        System.out.println("sum: "+sum(5));
        System.out.println("sum of digits :"+sumOfDigits(123));
        System.out.println("product of digits: "+profuctOfDigits(123));
        concept(5);
        revNumber(1824);
        System.out.println("reversed :"+revSum);
    }
}
