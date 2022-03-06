import com.jinisha.service.Palindrom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Java8 {

    public static void main(String[] args) {
        //lamda is instance of funtional interface

        //functional interface 1 method with abstract
        //fun replace with param
/* Comparator       Comparator<String> s=Comparator.comparing(Function.identity()).thenComparing()
        Runnable r=()->{
        };

        Comparator<String> w=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        }*/

        Consumer<Integer> p=s->System.out.print(s);
        //p.accept("I love prakhar");

        BiConsumer<String,String> w=(s1,s2)->System.out.println(s1+s2);
        w.accept("Jini","Prakhar");

        //Suppiler  return object

        Supplier<Palindrom> palindromSupplier=()->new Palindrom();
        System.out.println(palindromSupplier.get().getClass());
        Function<String, Integer> f1 = w1->Integer.parseInt(w1);
        Function<Integer, Integer> f2 = w1->w1+5;
        Function<String, Integer> convertToIntegerAndThenAddFive = f1.andThen(f2);
        System.out.println(f1.apply("4"));
       /* BiFunction<String, String, Integer> f2 = (w1, w2)-> {
            return Integer.parseInt(w1 + w2);
        };*/
        UnaryOperator<String> u1 = w1->String.valueOf(w1);
        BinaryOperator<String> b1 = (w1, w2)-> {
            return w1+w2;
        };

        List<String> l=new ArrayList<>();
        l.add("1");
        l.stream().map(f1).forEach(p);
        Predicate<String> predicate=(jini)->jini.equals("love");

        System.out.println(  predicate.test("prakhar"));


    }
}
