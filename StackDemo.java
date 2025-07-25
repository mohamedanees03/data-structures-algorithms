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

        System.out.println(stack);
    }
}