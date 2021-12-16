/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.Vector;

/**
 *
 * @author sreek
 */

public class ProductofMaxandMininaDataSet {
    
	static class Dataset {
        private Integer min = null;
        private Integer max = null;
        private TreeSet<Integer> elements = new TreeSet<Integer>();
        private Vector<Long> products = new Vector<Long>();
        public void push(int x) {
            elements.add(x);
            if (min == null) {
                min = new Integer(x);
                max = new Integer(x);
            } else {
                if (min.intValue() > x) {
                    min = new Integer(x);
                }
                if (max.intValue() < x) {
                    max = new Integer(x);
                }
            }
            products.add(new Long(min.longValue() * max.longValue()));
        }
        public void pop(int x) {
            elements.remove(x);
            min = elements.first();
            max = elements.last();
            products.add(new Long(min.longValue() * max.longValue()));
        }
        public long[] toArray() {
            long[] la = new long[products.size()];
            Iterator<Long> itl = products.iterator();
			for (int i = 0; itl.hasNext(); i++) {
				la[i] = itl.next();
			}
            return la;
        }
    }

    static long[] maxMin(String[] operations, int[] x) {
        Dataset ds = new Dataset();
        for (int i = 0, fi = operations.length; i < fi; i++) {
            if ("push".equals(operations[i])) {
                ds.push(x[i]);
            } else if ("pop".equals(operations[i])) {
                ds.pop(x[i]);
            }
        }
        return ds.toArray();
    }

    public static void main(String[] argv) {
//		{
//        String[] operations = {"push","push","push","pop"};
//        int[] x = {1,2,3,1};
//        long[] la = maxMin(operations,x);
//        for (int i = 0, fi = la.length; i < fi; i++) {
//            System.out.println(la[i]);
//        }
//        
//        
//		}
	
            fun();    
    }
    
    public static void fun(){
        String[] operations = {"push","push","push","pop"};
        int[] x = {1,2,3,1};
        //int[] x = {1,2,3,1};
        HashMap<Integer,Integer> map = new HashMap();
        
        List<Integer> re  =new ArrayList<>();
        
        for (int i = 0, fi = operations.length; i < fi; i++) {
            if ("push".equals(operations[i])) {
                map.put(i, x[i]);
                cal(map,re);
            } else if ("pop".equals(operations[i])) {                 
                 //map.remove(i, x[i]);
                 System.out.println("pop map##"+map);
                 cal(map,re);
            }
        }
        
        System.out.println("map##"+map);
        System.out.println("re##"+re);
       
    }
    
    private static void cal(HashMap<Integer,Integer> map,List<Integer> re){
         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
         for (Map.Entry mapElement : map.entrySet()) {
            int key = (Integer)mapElement.getKey();
            min = Math.min(map.get(key), min);
            max = Math.max(map.get(key), max);
            
        }
        System.out.println("min##"+min);
        System.out.println("max##"+max);
        re.add(min*max);
    }
}

