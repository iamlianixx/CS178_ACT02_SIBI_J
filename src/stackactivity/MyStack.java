/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stackactivity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class MyStack {
    ArrayList<Integer> stack;
    private int i=1;
    public MyStack(int size){
        this.stack = new ArrayList<Integer>(size);
    }
    
    public synchronized void push(){
        this.stack.add(0, i);
        System.out.println("Value Pushed: " + i);
        i++;
    }
    
    public synchronized void pop(){
        int ret = this.stack.get(0);
        this.stack.remove(0);
        System.out.println("Value Popped: " + ret);
    }

    public void display(){
        if(stack.isEmpty() == true)
            System.out.println("Empty Stack");
    }
}
