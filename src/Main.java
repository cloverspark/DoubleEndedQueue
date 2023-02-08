import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Deque<String> d1 = new ResizingArrayDeque<>();
        // some test code here
        d1.addFirst("hi");
        d1.addFirst("hi3");
        d1.addFirst("hi2");
        d1.addLast("bon");
        System.out.println(d1);
        d1.removeLast();
        System.out.println(d1);
        d1.removeFirst();
        System.out.println(d1);

        Deque<String> d2 = new SinglyLinkedDeque<>();
        // some test code here
        d2.addFirst("hi");
        System.out.println(d2);
    }
}