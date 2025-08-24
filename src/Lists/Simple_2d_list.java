package Lists;

import java.util.ArrayList;
import java.util.List;

public class Simple_2d_list {
    static List<List<Integer>> lists(List<Integer> inner1, List<Integer> inner2) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(inner1);
        outer.add(inner2);
        return outer;
    }

    public static void main(String[] args) {
        List<Integer> inner1 = new ArrayList<>();
        inner1.add(1);
        inner1.add(11);
        inner1.add(111);

        List<Integer> inner2 = new ArrayList<>();
        inner2.add(2);
        inner2.add(22);
        inner2.add(222);

        List<List<Integer>> ans = lists(inner1, inner2);
        System.out.println(ans);
    }
}
