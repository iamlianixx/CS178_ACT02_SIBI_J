/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stackactivity;

/**
 *
 * @author student
 */
public class Popper extends Thread{
    MyStack theStack;

    public Popper(MyStack stack){
        this.theStack = stack;
    }

    @Override
    public void run() {
        while(!theStack.stack.isEmpty())
            this.theStack.pop();
     }


}
