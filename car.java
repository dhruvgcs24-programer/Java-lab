public class car {
    String make,model;
    int year;
    public car(String make, String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    public void displayInfo(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);

    }

    public static void main(String[] args){
          car[] cars = new car[3];

        cars[0] = new car("Toyota", "Camry", 2018);
        cars[1] = new car("Honda", "Accord", 2020);
        cars[2] = new car("Ford", "Mustang", 2019);

        for (car car : cars) {
            car.displayInfo();
        }

        cars[1] = null;
        cars[2] = null;

        System.gc();

        System.out.println("Called System.gc(), but garbage collection is not guaranteed immediately.");
    }
}

    

