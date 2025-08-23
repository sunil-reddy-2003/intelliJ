package Maps;

import java.util.HashMap;

public class SimpleHashMap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(11,1);
        hm.put(22,2);
        System.out.println(hm.values());
    }
}
