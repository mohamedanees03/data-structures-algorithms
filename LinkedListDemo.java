import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // linkedList.push("Rohit");
        // linkedList.push("Virat");
        // linkedList.push("Dhoni");
        // linkedList.push("Bumrah");
        // linkedList.push("SuryaKumar");
        // linkedList.pop();

        linkedList.offer("Rohit");
        linkedList.offer("Virat");
        linkedList.offer("Dhoni");
        linkedList.offer("Bumrah");
        linkedList.push("SuryaKumar");
        // linkedList.poll();

        linkedList.add(5,"Hardik");
        linkedList.remove("Hardik");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("GOAT'S : ");
        linkedList.addLast("Gill");
        
        System.out.println(linkedList);
    }
}
