import java.util.*;

/**
 * @Author Ayse Aydogdu
 * @Date 8/29/2022 9:26 AM
 */
public class Maps {

    public static void main(String[] args) {

        // SORTS VALUES AUTOMATICALLY
        Map<Integer,String> hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();


        hashMap.put(2,"Arife");
        hashMap.put(1,"Ayse");


        System.out.println(hashMap.get(2));

        if(hashMap.containsKey(1))
        {
           System.out.println(hashMap.get(1));
        }

        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.hashCode());

    }

}
