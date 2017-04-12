package com.simple.news;

public class MainClass {
    public static void main(String[] args) {
        Compent decorator = new Decorator(new Car()); //有共同的接口才可以做到动态.
        decorator.move();
    }

}
