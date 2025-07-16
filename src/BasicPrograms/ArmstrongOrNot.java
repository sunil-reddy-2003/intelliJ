package BasicPrograms;

public class ArmstrongOrNot {
//    static int rem=0;
    static int armstrong(int num,int power){
//        rem+=(int )Math.pow(num%10,power);
        if(num==0){
            return 0;
//            return rem;
        }
        return (int )Math.pow(num%10,power)+armstrong(num/10,power);
    }
    public static void main(String[] args) {
        int num=153;
        int power=(int)Math.log10(num)+1;
        int ans=armstrong(num,power);
        System.out.println(num==ans);
    }
}
