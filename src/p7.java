/**
 * Created by tanuj on 6/24/17.
 */
public class p7 {

    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack();
        stack.push(9);
        stack.push(8);
        stack.push(4);
        stack.push(2);
        stack.push(1);
        stack.push(6);
        stack.display();
        System.out.println("Minumum element: "+stack.getMin());
        System.out.println("Pop runs");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println("Minumum element: "+stack.getMin());

        stack.push(10);
        stack.push(2);
        stack.display();

        System.out.println("Minumum element: "+stack.getMin());
    }
}