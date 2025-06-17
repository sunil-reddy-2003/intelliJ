public class BubbleSort {
    static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int  temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr={5,4,3,2,1};

//        String str="sunil";
//        char[] arr=str.toCharArray();
        bubbleSort(arr);
        for (int c : arr) {
            System.out.print(c + " ");
        }
    }
}
