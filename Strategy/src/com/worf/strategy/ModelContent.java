package com.worf.strategy;

/**
 * ģ�Ͳ��Ի�����
 * @author PERCY
 */
public class ModelContent {
    private ModelStrategy strategy;
    
    public ModelContent(ModelStrategy strategy) {
        super();
        this.strategy = strategy;
    }
    
    /**
     * �����л�ȡ���ַ���
     * @return
     */
    public int getNum() {
        return strategy.getNum();
    }
    
}
