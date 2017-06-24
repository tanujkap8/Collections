/**
 * Created by tanuj on 6/24/17.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpecialStack {
    final static int maxCapacity = 5;
    static List<Integer> stack = new ArrayList<Integer>(maxCapacity);
    static List<Integer> sortStack = new ArrayList<>();

    int number;

    void push(int a){
        if(!isFull()) {
            stack.add(a);
            sortStack.add(a);
            sortedStack();
        }else{
            System.out.println("Stack is Full");
        }
    }

    void pop(){
        if(!isEmpty()) {
            stack.remove(stack.size() - 1);
            sortStack.clear();
            sortStack.addAll(stack);
            sortedStack();
        }
        else {
            System.out.println("Stack is already empty");
        }
    }

    boolean isEmpty(){
        if(stack.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }

    boolean isFull(){
        if(stack.size() == maxCapacity){
            return true;
        }
        else{
            return false;
        }    }

    String getMin(){
        if(!sortStack.isEmpty()){
            return ""+sortStack.get(0);
        }
        else {
            return "Error:List is empty";
        }
    }
    void display(){
        System.out.println(stack);
    }

    void sortedStack(){
        Collections.sort(sortStack);
    }
}
