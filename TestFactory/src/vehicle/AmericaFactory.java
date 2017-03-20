package vehicle;

//美国的生产线
public class AmericaFactory implements Factory {

    @Override
    public Vehicle prducerCar() {
        return new AmericaCar();
    }

    @Override
    public Vehicle prducerShip() {
        return new AmericaShip();
    }

}
