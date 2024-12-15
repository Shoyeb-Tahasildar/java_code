package dsa;

import java.util.HashMap;
import java.util.Map;

public class tree_demo {
    public static void main(String[] args) {
        Map m = new HashMap<>();
        m.put(5, 2);
        m.put(5, 3);
        System.out.println(m.get(5));
    }
}
