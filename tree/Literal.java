package tree;

public class Literal extends Tree {

    Integer val;
    public Literal(Integer i) {
        val = i;
    }

    public Integer eval(Environment e) {
        return val;
    }
    public void print() {
        System.out.print("(LITERAL " + val + ")");
    }
}

