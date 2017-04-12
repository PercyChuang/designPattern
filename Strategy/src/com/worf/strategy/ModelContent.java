package com.worf.strategy;

/**
 * 模型策略环境类
 * @author PERCY
 */
public class ModelContent {
    private ModelStrategy strategy;
    
    public ModelContent(ModelStrategy strategy) {
        super();
        this.strategy = strategy;
    }
    
    /**
     * 环境中获取数字方法
     * @return
     */
    public int getNum() {
        return strategy.getNum();
    }
    
}
