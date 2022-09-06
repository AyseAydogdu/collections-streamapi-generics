import java.util.Arrays;
import java.util.List;

/**
 * @Author Ayse Aydogdu
 * @Date 9/2/2022 3:28 PM
 */
public class GenericClass <T>{

    T obj;
   GenericClass(T obj){
       this.obj = obj;
       printValue();
   }

    private void printValue() {
        System.out.println(this.obj);
    }

    T getObj(){
       return obj;
   }

   void setObj(T obj){
       this.obj = obj;
   }


}
 class GenericClassTwo <K,V>{

    K objK;
    V objV;

    K getObjK(){
        return objK;
    }

    void setObjK(K objK){
        this.objK = objK;
    }

    V getObjV(){
        return objV;
    }

    void setObjV(V objV){
        this.objV = objV;
    }
    void print(){
        System.out.println(this.objK +": "+ this.objV);
    }


}
class GenericClassTest{
    public static void main(String[] args) {

        GenericClass<String> genericClass = new GenericClass<>("Ayse");
        GenericClass<Double> genericClass2 = new GenericClass<>(2.5);

        GenericClassTwo<Integer,String> genericClassTwo = new GenericClassTwo<>();
        genericClassTwo.setObjK(1);
        genericClassTwo.setObjV("Arife");
        genericClassTwo.print();


        print(Arrays.asList(1,2,3));
        print(Arrays.asList("a","b","c"));

        


    }

    public static <E> void print(List<E> list) {
        list.forEach(System.out::println);

    }
}