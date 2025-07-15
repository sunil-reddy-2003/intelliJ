
package BasicPrograms;
import java.util.ArrayList;
public class FibonacciSeries {
    static void fiboWithList(int num) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<num; i++){
            if(i<2){
                list.add(i);
            }
            else{
                list.add(list.get(i-1)+list.get(i-2));
            }
        }
        System.out.println(list);
    }
    static void fiboWithArray(int num) {
        int[] arr=new int[num];
        for(int i=0; i<num; i++){
            if(i<2){
                arr[i]=i;
                System.out.print(arr[i]+" ");
            }
            else{
                arr[i]=arr[i-1]+arr[i-2];
                System.out.print(arr[i]+" ");
            }
        }
    }
    static int first=0;
    static int second=1;
    static void fibo(int num){
        System.out.print(first+" "+second+" ");
        for(int i=2; i<num; i++){
            int curr=first+second;
            System.out.print(curr+" ");
            first=second;
            second=curr;
        }
    }

    public static void main(String[] args) {
        fiboWithList(5);
        fiboWithArray(5);
        System.out.println();
        fibo(5);
    }
}
