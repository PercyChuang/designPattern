package com.worf.news;

public abstract class Decorator implements Transform{

    private Transform trasform;
    
    public abstract void move();
    /*{
        System.out.println("11");
        trasform.move();
    }*/

    public Decorator(Transform trasform) { //抽象可以有构造方法,但不能实例对象.
        super();
        this.trasform = trasform;
    }
    public Transform getTrasform() {
        return trasform;
    }
    public void setTrasform(Transform trasform) {
        this.trasform = trasform;
    }
    
}
