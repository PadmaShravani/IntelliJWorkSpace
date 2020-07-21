package features.ja;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface Test{
    public void test(List<Integer> lt);
}
public class TestLambda {

    public static void main(String args[]){

        List<Integer> lt = new ArrayList<Integer>();
        lt.add(10);
        lt.add(30);
        lt.add(5);

        Test t = i-> Collections.sort(i);
        t.test(lt);
        lt.stream().forEach(i->System.out.println(i));
        Integer id = 30;
        Predicate<Integer> p = i -> !i.equals(id);
        System.out.println(lt.stream().anyMatch(p));
       lt.stream().filter(p).forEach(i -> System.out.println(i) );
        lt.stream().distinct().limit(2).forEach(i -> System.out.println(i));
        System.out.println(lt.stream().allMatch(p));
       System.out.println(lt.stream().findAny());
        System.out.println(lt.stream().findFirst());
        System.out.println( lt.stream().mapToInt(i->i).sum());
        List<String> names = Arrays.asList("Smith", "Gourav", "Heather", "John", "Catania");
        Function<String, String> nameMappingFunction = String::toUpperCase;
        List<String> nameLength = names.stream().map(nameMappingFunction).collect(Collectors.toList());
        System.out.println(nameLength);
        String concatenatedString = names.stream().reduce(" ", (s, s2) -> s2+s);
        System.out.println(concatenatedString);
        System.out.println("Concat function" +names.stream().reduce(" ", String::concat));

    }

}
