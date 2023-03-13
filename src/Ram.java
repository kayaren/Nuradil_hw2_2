public class Ram  extends  Animal implements Printable{
    private int child;

    public int getChild() {
        return child;
    }

    public Ram(String name, int child) {
        super(name);
        this.child = child;
    }

    @Override
    public void print() {


    }
}
