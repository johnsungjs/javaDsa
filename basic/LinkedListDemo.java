package basic;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        /*
      LINKEDLIST GAESS

      On array, deletion and insertion is quite slow, in insert you have to move the right side or array push each one by 1 index and place the inserted value. On deletion you have to remove one element at index, and move each right side element by 1 index

      This data structure solved this issue.

      But Linkedlist is not goot for searching.

      In summary,
      searching => array
      insertion, deletion => linkedlist

      In Java, we can treat Linkedlist as stack or queue, so method like push, offer, pop, poll will work


      Usecase:
      - Stack / Queue implementation
      - GPS navigation
      - music playlist

         */
        LinkedList<String> linkedList = new LinkedList<>();

        // add to the head
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        // remove head
        linkedList.pop();

        // add to the tail
        linkedList.offer("X");
        linkedList.offer("Y");
        linkedList.offer("Z");
        // remove head
        linkedList.poll();

        //add method (the most use probably)
        linkedList.add("123");
        linkedList.add(2, "INSERT IDX 2");

        //remove data inside linkedlist invalid data would'nt throw exception
        linkedList.remove("123");

        System.out.println("PEEK: " + linkedList.peek());
        System.out.println("PEEK FIRST: " + linkedList.peekFirst());
        System.out.println("PEEK LAST: " + linkedList.peekLast());

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList);

    }

}
