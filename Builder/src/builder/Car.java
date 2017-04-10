package builder;

public class Car {

    private String seat;

    private String engine;

    private String wheel;

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car [seat=" + seat + ", engine=" + engine + ", wheel=" + wheel + "]";
    }
    
}
