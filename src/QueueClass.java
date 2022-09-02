

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author Ayse Aydogdu
 * @Date 8/29/2022 9:27 AM
 */
public class QueueClass {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();

        PriorityQueue priorityQueue = new PriorityQueue<>();

        queue.add(1);      // işlem başarısıszsa hata fırlatır
        queue.offer(2); // işlem başarısıszsa null döner
        queue.offer(3);
        queue.offer(4);
        for(int i: queue)
        {
            System.out.println(i);
        }

        queue.poll(); // kuyruğun ilk elemanını çıkarır
        queue.remove(); // poll ile aynı ama hata fırlatır
        System.out.println(queue.peek()); // ilk elemanı okur
        System.out.println(queue.element()); // peek ile aynı exception fırlatır


    }



}
