package hck.arrays;

import java.util.LinkedList;
import java.util.Queue;

public class BasicQueueImpl {

	public static void main(String[] args) {
        Queue<Integer> myQ=new LinkedList<Integer>();
        //Adding items to the Queue
        myQ.add(1);
        myQ.add(6);
        myQ.add(3);
        System.out.println(myQ); //1 6 3
        int first=myQ.poll();// retrieve and remove the first element
        System.out.println(first);//1
        System.out.println(myQ);//6 3
       }
}
