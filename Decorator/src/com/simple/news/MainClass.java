package com.simple.news;

public class MainClass {
    public static void main(String[] args) {
        Compent decorator = new Decorator(new Car()); //�й�ͬ�Ľӿڲſ���������̬.
        decorator.move();
    }

}
