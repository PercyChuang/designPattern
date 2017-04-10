package builder;

public class JapanBuilder implements CarBuilder {

    private Car car = new Car();
    
    @Override
    public void makeSeat() {
        car.setSeat("�ձ�--������λ!");
    }

    @Override
    public void makeWheel() {
        car.setWheel("�ձ�--ľͷ����");
    }

    @Override
    public void makeEngine() {
        car.setEngine("�ձ�--����ʽ������");
    }

    @Override
    public Car getCar() {
        return car;
    }

}
