package BasicPrograms;

public class PrimeOrNot {
    static void prime(int num){
        if(num<=1){
            System.out.println("less then 0");
            return;
        } else{
            for (int i=2; i<Math.sqrt(num); i++){
                if(num%i==0){
                    System.out.println("composite");
                }
                System.out.println("prime");
            }
        }
    }

    public static void main(String[] args) {
        prime(7);
    }
}
