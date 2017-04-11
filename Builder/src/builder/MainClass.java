package builder;

public class MainClass {

    public static void main(String[] args) {
        CarBuilder jbuilder = new JapanBuilder();
        CarDerector.makeBuilder(jbuilder);
        Car car = jbuilder.getCar();
        String bb = car.toString();
        System.out.println(bb);
    }
}
