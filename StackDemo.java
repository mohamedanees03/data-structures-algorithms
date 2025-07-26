/*
    A Stack is a linear data structure that follows the LIFO principle:
    LIFO (Last In, First Out) → The element inserted last will be removed first.
*/

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // System.out.println(stack.isEmpty());
        stack.push("Messi");
        stack.push("Neymar");
        stack.push("Ronaldo");
        stack.push("Ibrahimovic");
        stack.push("Anees");

        // String temp = stack.pop();
        // String firstElement = stack.peek();

        // System.out.println(firstElement);
        // System.out.println(temp);
        // System.out.println(stack);

        // System.out.println(stack.search("Messi"));

        System.out.println(stack.pop());
    }
}