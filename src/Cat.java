public class Cat extends Animal implements Printable{

    private int steps;

    public int getSteps() {
        return steps;
    }

    public Cat(String name, int steps) {
        super(name);
        this.steps = steps;
    }

    @Override
    public void  print() {
        System.out.println("имя:" + getName() + "\nшаги в день: " + getSteps());


    }
}
