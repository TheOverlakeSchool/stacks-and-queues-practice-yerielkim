import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StacksAndQueuesPractice {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        System.out.println(q);

        stutter(q);

        System.out.println(q);

        Queue<String> strings = new LinkedList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        System.out.println(strings);
        mirror(strings);
        System.out.println(strings);
    }

    public static void stutter(Queue<Integer> q) {
//       OK Solution:
//        Queue<Integer> temp = new LinkedList<>();
//        while (!q.isEmpty()) {
//            temp.add(q.remove());
//        }
//        while (!temp.isEmpty()) {
//            int value = temp.remove();
//            q.add(value);
//            q.add(value);
//
//        }

//  Infinite Loop
//        while (!q.isEmpty()) {
//            int value = q.remove();
//            q.add(value);
//            q.add(value);
//        }

        int size = q.size();
        for (int i = 0; i < size; i++) {
            int value = q.remove();
            q.add(value);
            q.add(value);
        }
    }

    public static void mirror(Queue<String> q) {
        Stack<String> temp = new Stack<>();
        for (int i = 0; i < q.size(); i++) {
            String value = q.remove();
            temp.push(value);
            q.add(value);
        }
        while (!temp.isEmpty()) {
            q.add(temp.pop());
        }
    }

    public static void mirror(Stack<String> q) {
        Queue<String> temp = new LinkedList<>();
        Stack<String> temp2 = new Stack<>();
        while (!q.isEmpty()) {
            String value = q.pop();
            temp.add(value);
            temp2.push(value);
        }

    }
}
