/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stackactivity;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStack mainStack = new MyStack(20);

        Pusher t1 = new Pusher(mainStack);
        Pusher t2 = new Pusher(mainStack);
        Popper tPop = new Popper(mainStack);

        t1.start();
        tPop.start();
    }

}
