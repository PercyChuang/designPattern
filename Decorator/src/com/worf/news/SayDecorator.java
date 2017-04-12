package com.worf.news;

public class SayDecorator extends Decorator {
    
    public SayDecorator(Transform trasform) {
        super(trasform); //向上的抽象.
    }

    @Override
    public void move() {
        super.getTrasform().move();
        this.say();             //附加功能.
    }
    
    private void say() {
        System.out.println("可以说话!");
    }
}
