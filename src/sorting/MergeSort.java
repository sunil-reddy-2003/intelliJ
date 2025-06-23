package sorting;

public class MergeSort {
    static int[] mergeSort(int[] arr1,int[] arr2){
        int[] merged=new int[arr1.length+ arr2.length];
        for(int i=0; i< merged.length; i++){
            if(arr1[i]<arr2[i]){
                merged[i]=arr1[i];
            }
        }
        return new int[arr1.length+ arr2.length];
    }
    public static void main(String[] args){
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6,8,10};
        int[] arr3=mergeSort(arr1,arr2);
        for(int num:arr3){
            System.out.print(num+" ");
        }
    }
}
