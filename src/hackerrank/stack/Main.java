package hackerrank.stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new StackImpl<>();
        System.out.println("push " + 1);
        stack.push(1);
        System.out.println("push " + 2);
        stack.push(2);
        System.out.println("peek " + stack.peek());
        System.out.println("pop " + stack.pop());
        System.out.println("pop " + stack.pop());
        System.out.println("pop " + stack.pop());

        System.out.println("push " + 10);
        stack.push(10);
        System.out.println("push " + 20);
        stack.push(20);
        System.out.println("peek " + stack.peek());

    }
}
