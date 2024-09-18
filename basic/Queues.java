package basic;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
  
    public static void main(String[] args) {

        /*
          QUEUE = FIFO
          imagine this is as linear things, just like when you wait at the bank
              
          add => offer 
          remove => poll
          see => peek => return the most front

          
          Common Usage:
          - Keyboard Buffer (when you type keyboard, it really feels when there is a delay, the input should be in the FIFO order)
          - Printer queue
          - LinkedLists, PriorityQueues, Breath-first 

         */
        
        Queue<String> queue = new LinkedList<>();

        queue.offer("first");
        queue.offer("second");
        queue.offer("third");

        // remove the first out data
        // queue.poll();

        // get the first in / first out data
        // String firstOut = queue.peek();

        //check size
        // System.out.println(queue.size());

        // data contains in the queue
        // System.out.println(queue.contains("first")); //return true/false

        System.out.println(queue);

    }
}
