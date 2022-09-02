package Lists;

import java.util.List;
import java.util.Vector;

/**
 * @Author Ayse Aydogdu
 * @Date 8/29/2022 9:31 AM
 */
public class VectorClass {
    public static void main(String[] args) {

        // Default length : 10, increas by 10 by 10

        Vector<Integer> vector = new Vector<>();

        vector.add(5);

        System.out.println(vector.size());
        System.out.println("Capacity :\t"+vector.capacity());

        for(int i = 0; i<10; i++) {
            vector.add(i*i); }

        System.out.println(vector.size());
        System.out.println("Capacity :\t"+vector.capacity());
    }
}
