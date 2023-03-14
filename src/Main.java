public class Main {
    public static void main(String[] args) {
        Printable car   = createObject("car");
        Printable airplane = createObject("airplane");
        Printable bike = createObject("bike");
        car.print();
        airplane.print();
        bike.print();




        }

        public static Printable createObject(String className){
        Car car = new Car("nissan", "gtr");
        Airplane airplane = new Airplane("lil " , 400);
        Bike bike  = new Bike("hooxi" , 2020);
        Cat cat = new Cat("good", 700);
        Dog dog = new Dog("rex" , 4);
        Ram ram = new Ram("niko" , 3);

        switch (className){
            case "car":
                return car;
            case    " airplane":
                return airplane;
            case  "bike":
                return bike;
            case   "cat":
                return cat;
            case    "dog":
                return dog;
            case    "ram":
                return ram;
        }return null;
        }

    }





