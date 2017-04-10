package builder;

public class JapanBuilder implements CarBuilder {

    private Car car = new Car();
    
    @Override
    public void makeSeat() {
        car.setSeat("日本--带钉座位!");
    }

    @Override
    public void makeWheel() {
        car.setWheel("日本--木头轮子");
    }

    @Override
    public void makeEngine() {
        car.setEngine("日本--喷气式发动机");
    }

    @Override
    public Car getCar() {
        return car;
    }

}
