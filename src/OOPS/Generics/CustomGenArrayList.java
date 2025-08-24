package OOPS.Generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {
    private  Object[] data;
    private static final int DEFAULT_SIZE=5;
    private int size=0;

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    public T get(int index){
        return (T)data[index];
    }
    public void set(int index,T value){
         data[index]=value;
    }
    public int size(){
        return size;
    }

    private void resize() {
        Object[] temp=new Object[data.length *2];
        for(int i=0; i< temp.length; i++){
            temp[i]= (T)(data[i]);
        }
        data=temp;
    }

    private boolean isFull() {
        return size==data.length;
    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list1=new CustomGenArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);
    }
}
