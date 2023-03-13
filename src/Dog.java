public class Dog extends Animal implements Printable{

    private int friends;

    public int getFriends() {
        return friends;
    }

    public Dog(String name, int friends) {
        super(name);
        this.friends = friends;
    }

    @Override
    public void  print() {

    }
}
