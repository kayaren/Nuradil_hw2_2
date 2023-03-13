public class Car extends Transport implements Printable {

    private String model;


    public String getModel() {
        return model;
    }

    public Car(String name, String model) {
        super(name);
        this.model = model;
    }

    public Car(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("имя: " + getName() + "\nмодель: " + getModel());

    }
}
