package basic;

import java.util.Stack;

public class Stacks {
  public static void main(String[] args) {

        /**
          STACK = LIFO
            
          imagine stack as "vertical tower"
          so last item is the top, first item is the bottom
            
          Usage:
          - undo redo
          - back/foward browser history
          - backtracking algorithms (maze, file directories)
          - calling functions (call stack)
          - allows duplicate item
         */
        Stack<String> stack = new Stack<>();

        //push => add data to the stack
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("5");

        //pop => remove top data of the stack
        // stack.pop();

        //peek => see the top data of the stack
        // System.out.println(stack.peek());
        
        //search => return the order of the stack, order start from top, the toppest data is 1, not found return -1
        //System.out.println(stack.search("2")); //return 4
        //System.out.println(stack.search("5")); //return 1
        //System.out.println(stack.search("adkskadlkdaldksa")); //return -1

        System.out.println(stack);




        
    }
}
