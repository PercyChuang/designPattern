package builder;

public class CarDerector {
    public static void makeBuilder(CarBuilder builder) {
        builder.makeEngine();
        builder.makeSeat();
        builder.makeWheel();
    }
}
