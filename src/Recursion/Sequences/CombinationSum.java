package Recursion.Sequences;

import java.util.ArrayList;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr={2,3,6,7};
        int k=7;
        all(arr,0,k, new ArrayList<>());
    }
    static void all(int[] arr,int index,int target,ArrayList<Integer> list){
        if(index== arr.length){
            if(target==0){
                System.out.println(list);
            }
            return;

        }
        if(arr[index]<=target) {
            list.add(arr[index]);
            all(arr, index,target-arr[index], list);
            list.remove(list.size()-1);
        }
        all(arr,index+1,target,list);
    }

}
