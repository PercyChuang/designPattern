package vehicle;

public class MainClass {

    public static void main(String[] args) {
        Factory factory = new AmericaFactory();
        Vehicle car = factory.prducerCar();
        Vehicle ship = factory.prducerShip();
        System.out.println(car.getBusiness());
        System.out.println(ship.getBusiness());
    }
}
