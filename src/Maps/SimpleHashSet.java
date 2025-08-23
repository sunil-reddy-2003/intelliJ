package Maps;

import java.util.HashSet;

public class SimpleHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=5; i>=0; i--){
            set.add(i);
        }
        System.out.println(set);

        int[] arr={1,2,3,4,5,6,7,8,9};
        for (int j : arr) {
            if (!set.contains(j)) {
                set.add(j);
            }
        }
        System.out.println(set);

    }
}
