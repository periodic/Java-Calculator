package tree;

public class Identifier extends Tree {

    private String id;

    public Identifier(String s) {
        id = s;
    }

    public Integer eval(Environment e) {
        return e.lookup(id);
    }

    public void print() {
        System.out.print("(IDENT " + id + ")");
    }
}
