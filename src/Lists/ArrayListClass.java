package Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author Ayse Aydogdu
 * @Date 8/29/2022 9:26 AM
 */
public class ArrayListClass {

    public static void main(String[] args) {

        // non generic Arraylist
        List arrayList = new ArrayList();

        // generic Arraylist
        List<String> genericArrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add("Arife");
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);


        for (Object x: arrayList){
            System.out.println(x);
        }

        System.out.println(arrayList.size());

        arrayList.set(1,6);
        System.out.println(arrayList.get(1));
        if (arrayList.contains(3)){
            System.out.println(arrayList.indexOf(3)+". indextedir");
        }

        for (int i=0;i<6;i++)
        {
            genericArrayList.add(i,"Eleman "+i);
        }

        for (String y: genericArrayList){
            System.out.println(y);
        }
        genericArrayList.remove(2);

        Iterator iterator = genericArrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
