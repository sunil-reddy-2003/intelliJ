package Sorting;

public class InsertionSort {
    static void insertionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
//        int[] arr={1,2,3,4,5};
//        int[] arr={};
//        int[] arr={1};
//        int[] arr={2,1};
//        int[] arr={4,7,0,-22,-31};

        insertionSort(arr);
        for (int c : arr) {
            System.out.print(c + " ");
        }
    }
}
