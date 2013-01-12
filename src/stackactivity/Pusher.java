/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stackactivity;

/**
 *
 * @author student
 */
public class Pusher extends Thread{
    MyStack theStack;

    public Pusher(MyStack stack){
        this.theStack = stack;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++)
            theStack.push();
        }

}
