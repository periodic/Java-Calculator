package tree;
import java.util.HashMap;
import java.util.Map;

public class Environment {

    private HashMap<String,Integer> map;

    public Environment() {
        map = new HashMap<String,Integer>();
    }

    public Integer lookup(String var) {
        return map.get(var);
    }

    public void set(String var, Integer val) {
        map.put(var, val);
    }

    public void print () {
        for (Map.Entry<String,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main (String [] args)
    {
        Environment e = new Environment();

        e.set("hello", 1);
        e.set("world", 2);

        System.out.println("Hello = " + e.lookup("hello"));
        System.out.println("World = " + e.lookup("world"));
    }

}
