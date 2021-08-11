import java.util.PriorityQueue;

public class Queue {
    public static void main(String[]args){
         PriorityQueue<Integer> queue= new PriorityQueue<Integer>();
         for(int i=10;i>0;i--){
             queue.add(i);

         }
        //Queue: 10 9 8 7 6 5 4 3 2 1
        // priority queue sorts data: 1 2 3 4 5 6 7 8 9 10
        //sorted Queue:1 2 3 4 5 6 7 8 9 10
        //Queue operatrions:1. peeking--> shows the head of queue
        //                      polling-->removing top element
        System.out.println("Size before polling is: "+queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println("Size after poll operation"+queue.size());

        System.out.println(queue.peek());
    }
}
