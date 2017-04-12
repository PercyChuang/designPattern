package com.worf.news;

public class MainClass {

    public static void main(String[] args) {
        //Transform car = new Car();
        //Transform transform = new Decorator(car);
        Transform transform = new SayDecorator(new Car());
        //Transform transform = new Decorator(new Decorator(car));
        transform.move();
        
    }
}
