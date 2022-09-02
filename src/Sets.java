import java.util.*;

/**
 * @Author Ayse Aydogdu
 * @Date 8/29/2022 9:26 AM
 */
public class Sets {

    public static void main(String[] args) {

            // SORTS VALUES AUTOMATICALLY
        Set<Integer> set = new HashSet<>();
        TreeSet treeSet = new TreeSet(set);
        LinkedHashSet linkedHashSet = new LinkedHashSet();


      //  set.add(1);
        set.add(2);
        set.add(1);

//        for(int i = 50;i>0;i--){
//            set.add(i);
//        }

//        Iterator iterator = set.iterator();
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }

           for(int x : set){
               System.out.println(x);
           }


    }
}
