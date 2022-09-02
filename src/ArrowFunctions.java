import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author Ayse Aydogdu
 * @Date 9/2/2022 11:42 AM
 */
public class ArrowFunctions {

     public static void main(String[] args) {

          // collections-Stream-api
          // filter() - for Filtering with convenient condition----------------------------------------------------------------------------------------------------
          List<Integer> arrList = new ArrayList<>();
          List<Integer> arrListDivableThree = new ArrayList<>();


          int index = 0;
          while (index < 20) {
               arrList.add(index);
               index++;
          }

          arrListDivableThree =   arrList.stream().filter(item -> item %3 == 0 ).collect(Collectors.toList());
          arrListDivableThree.forEach(System.out::println);

          // findAny - findFirst () --> for CHECK !!! ----------------------------------------------------------------------------------------------------
          List<Integer> oddList = Arrays.asList(1, 3, 5, 7, 9, 11, 12); // JAVA 9 NEWS : Arrays.asList(1,2,3);

          Optional <Integer> any = oddList.stream().filter(x -> x % 2 == 0).findFirst(); //find

          if (any.isPresent()) {
               Integer result = any.get();
               System.out.println("This list is broken, because of item:"+ result);
          }
          else{
               System.out.println("This List contains full of odd elements");
          }
           // PREVIOUS PRODUCTION = PREPROD (test)
          // map() - for Changing items !!! ----------------------------------------------------------------------------------------------------

          List<String> list = Arrays.asList("Arife", "Ayse","Ünzile");
          list = list.stream().map(item -> item = item.toUpperCase()).collect(Collectors.toList());
          list.forEach(System.out::println);

          /*   // BOILERPLATE
          List<String> list = new ArrayList<>();
          list.add("Arife); list.add("Ayşe"); list.add("Ünzile");
          for(int i = 0 ; i< list.size();i++) {
               list.set(i,list.get(i).toUpperCase());
          }
          for(String item: list) {
               System.out.println(item);
          }
          */


     }
}