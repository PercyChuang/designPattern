package com.simple.news;

public class Decorator implements Compent{
    private Car car;

    public Decorator(Car car) {
        super();
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
        say();
    }
    
    private void say() {
        System.out.println("可以说话!");
    }
    
    
}
