package com.worf.strategy;

public class MainClass {
    
    public static void main(String[] args) {
        ModelContent content = new ModelContent(new StrategyB());
        int i = content.getNum();
        System.out.println(i);
        
        content = new ModelContent(new StrategyA());
        i = content.getNum();
        System.out.println(i);
        
    }
    
    
}
