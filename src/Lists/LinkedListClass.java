package Lists;

import java.util.*;

/**
 * @Author Ayse Aydogdu
 * @Date 8/29/2022 9:30 AM
 */

public class LinkedListClass {

    public static void main(String[] args) {
        List linkedlist = new LinkedList();

        linkedlist.add(4);
        linkedlist.add(2);


        for(int i = 0; i < linkedlist.size();i++) {
            System.out.println(linkedlist.get(i)); }

        for(Object item : linkedlist) {
            System.out.println(item); }

        linkedlist.forEach(item -> System.out.println(item));

        linkedlist.stream().forEach(item -> System.out.println(item));

        linkedlist.forEach(System.out::println);

        linkedlist.forEach(System.out::println); // method referance

        Iterator iterator = linkedlist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }





    }
}
