public class Bike extends Transport implements Printable{

    private  int year;

    public Bike(String name, int year) {
        super(name);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void print() {
        System.out.println("имя: " + getName() + "\nгод: " + getYear());


    }
}
