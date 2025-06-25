package sorting;

public class MergeSort {
    static void mergeSort(int[] arr,int s,int e){
        if (e - s <= 1) return;

        int mid=s+(e-s)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid,e);

        mergeArrays(arr,s,mid,e);
    }
    static void mergeArrays(int[] arr,int s,int m,int e){
        int i=s;
        int j=m;
        int k=0;
        int[] merged=new int[e-s];
        while(i< m && j< e){
            if(arr[i]<arr[j]){
                merged[k]=arr[i];
                i++;
                k++;
            }else{
                merged[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i< m){
                merged[k]=arr[i];
                i++;
                k++;
        }
        while(j<e){
            merged[k]=arr[j];
            j++;
            k++;
        }
        for (int l=0; l<merged.length; l++){
            arr[s+l]=merged[l];
        }
    }
    public static void main(String[] args){
        int[] arr={1,3,5,7,9,2,4,6,8,10};
        mergeSort(arr,0,arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
