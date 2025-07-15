package BasicPrograms;
import java.util.Scanner;
public class PrimeOrNot {
    static void prime(int num){
        if(num<=1){
            System.out.println("less then 0");
            return;
        } else{
            for (int i=2; i<Math.sqrt(num); i++){
                if(num%i==0){
                    System.out.println("composite");
                    return;
                }
            }
            System.out.println("prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num: ");
        int num=sc.nextInt();
        prime(num);
    }
}
