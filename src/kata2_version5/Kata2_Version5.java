package kata2_version5;

import java.util.Iterator;
import java.util.Map;

public class Kata2_Version5 {

    public static void main(String[] args) {
        
        Integer [] data = {1, 2, 9, 8, 6, 3, 7, 1, 8, 1, 2, 7, 8, 6, 7};
        String [] data2 = {"laura", "laura", "susana", "pepe", "roberto", "laura", "carlos", "carlos", "pepe", "mario"};
        
        Histogram meta_histogram = new Histogram(data2);
        
        Map<Integer, Integer> histogram =  meta_histogram.getHistogram();
        
        Iterator<Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        } 
    }
}
