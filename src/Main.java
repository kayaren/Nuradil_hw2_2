public class Main {
    public static void main(String[] args) {


      createObject("car");
        System.out.println("----------");
        createObject("airplane");
        System.out.println("---------");
        createObject("bike");
        System.out.println("----------");
        createObject("cat");
        System.out.println("-----------");
        createObject("lol");


    }



    public static void createObject (String className){
        Car car = new Car("nissan","grt");
        Airplane airplane = new Airplane("lil",400);
        Bike bike = new Bike("good", 2020);
        Cat cat = new Cat("hooxi",400);
        Dog dog = new Dog("rex",3);
        Ram ram = new Ram("niko",3);


        switch (className){
            case "bike":
               bike.print();
               break;
            case "airplane":
                airplane.print();
                break;
            case "car":
                car.print();
                break;
            case  "cat":
                cat.print();
                break;
            case "dog":
                dog.print();
                break;
            case  "ram":
                ram.print();
            default:
                System.out.println("вы ввели не правильно");



        }

    }





}