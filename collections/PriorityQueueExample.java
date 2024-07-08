package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<String> {
    @Override
    public int compare(String x, String y) {
        return x.length() - y.length();
    }
}

public class PriorityQueueExample {
    public static void main(String[] args)
    {
        
        PriorityQueue<String> queue = 
            new PriorityQueue<String>(15, new MyComparator());
        queue.add("Chocolate");
        queue.add("Vanilla");
        queue.add("Strawberry");
        queue.add("Cookie&Cream");
      
        while (queue.size() != 0)
        {
            System.out.println(queue.poll());
        
        }
    }
}
