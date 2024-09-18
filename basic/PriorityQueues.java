package basic;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {

   public static void main(String[] args) {

        /*
      It use the same Queue interface, the difference is in the instantiate, regular queue use LinkedList<>(), priority queue use PriorityQueue<>()

      This is like queue buat it will automatically sort the data
         */
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("E");
        queue.offer("C");
        queue.offer("A");
        queue.offer("B");
        queue.offer("D");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
  
}
