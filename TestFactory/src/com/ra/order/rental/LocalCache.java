package com.ra.order.rental;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;



/**
 * @author Percy 
 */
public class LocalCache {
	  private static Map<String, Integer> context = new ConcurrentHashMap<String, Integer>();  
	  
	    public static Integer get(String key) {  
	        if (context.containsKey(key)) {  
	            return context.get(key);  
	        }  
	        return null;  
	    }  
	    
	    public synchronized static void put(String key) {
	    	int cur = (int)(System.currentTimeMillis()/1000);
	    	context.put(key, cur);
	    	delete();
	    }
	    private static void delete() {
	    	int pred = (int)(System.currentTimeMillis()/1000)-60*60*24; //删除一天以前的数据
	    	Iterator<Entry<String, Integer>> iterator = context.entrySet().iterator();
	    	while(iterator.hasNext()) {
	    	    Entry<String, Integer> en = iterator.next();
	    	    Integer v = en.getValue();
                if (v.intValue() <= pred) {
                    context.remove(en.getKey());
                }  
	    	}
	    }  
	    
	    
	    public static void main(String[] args) throws InterruptedException {
            
                System.out.println(123 & 52); 
                int x =8;
                int y = Integer.MAX_VALUE;
                int avg = (x&y)+((x^y)>>1);
                System.out.println(avg);
                System.out.println(Integer.MAX_VALUE);
                System.out.println(((x&(x-1))==0)&&(x!=0));
                
                x ^= y; 
                y ^= x; 
                x ^= y;
                
                System.out.println(x);
                System.out.println(y);
                
                int a = 19;
                int b = 6;
                System.out.println(a%b);
                System.out.println(a&b);
                System.out.println((~a+1));
                
               // a % 2 等价于 a & 1
                System.out.println(a%b);
                System.out.println(a&(b-1));
                 a = ~4;//1 先确定符号 为负 1000000000000000001 再加1 = -2
                 //-1 先确定符号为正 00000000000000001 再减1 为0
                System.out.println(a);
        }
	    
	    static class A implements Runnable{

            @Override
            public void run() {
                put("22a3");
            }
	        
	    }
	    
	    
	    static class B implements Runnable{

            @Override
            public void run() {
                put("223");
            }
            
        }
	    
}
