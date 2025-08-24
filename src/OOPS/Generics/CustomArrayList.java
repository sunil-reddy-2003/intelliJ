package OOPS.Generics;

import java.util.Arrays;

public class CustomArrayList {

    private static final int DEFAULT_SIZE=5;
    private  int[] data;
    private int size=0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private boolean isFull() {
        return size==data.length;
    }
    private void resize() {
        int[] temp=new int[data.length *2];
        for(int i=0; i< temp.length; i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    public int get(int index){
        return data[index];
    }
    public void set(int index,int value){
         data[index]=value;
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList();
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
    }
}
