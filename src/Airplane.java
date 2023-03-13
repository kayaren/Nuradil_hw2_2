public class Airplane extends Transport implements Printable{

    private int speed;

    public Airplane(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void print() {
        System.out.println("имя: " + getName() + "\nскорость: " + getSpeed());


    }
}
