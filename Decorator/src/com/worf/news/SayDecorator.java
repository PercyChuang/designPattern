package com.worf.news;

public class SayDecorator extends Decorator {
    
    public SayDecorator(Transform trasform) {
        super(trasform); //���ϵĳ���.
    }

    @Override
    public void move() {
        super.getTrasform().move();
        this.say();             //���ӹ���.
    }
    
    private void say() {
        System.out.println("����˵��!");
    }
}
