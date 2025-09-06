package BitWiseOperators;

public class MagicNumber {
    static int magic(int n){
        int sum=0;   //1 1 1
        int count=0;
        while (n>0){
            int last=(n&1);
            n=n>>1;
            count++;
            sum+= (int) (last * Math.pow(5,count));
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(magic(5));
    }
}
