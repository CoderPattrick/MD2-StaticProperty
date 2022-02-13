public class Car {
    private String name;
    private String engine;
    public static int numbOfCars=0;
    public Car(){
        numbOfCars++;
    }
    public Car(String name,String engine){
        this.name=name;
        this.engine=engine;
        numbOfCars++;
    }
}
