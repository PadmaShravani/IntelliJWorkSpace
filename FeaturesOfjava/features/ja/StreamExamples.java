package features.ja;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamExamples {
    public static void main(String[] args) {
         List<String> names= Arrays.asList("Shravani","Sai","padma");
         for(String s:names){
             if(!s.equals("Sai")){
                 System.out.println(s);
             }
         }
names.stream()
        .filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return !s.equals("padma");
            }
        }).forEach(s-> System.out.println(s));

        names.stream()
                .filter(s -> !s.equals("padma")).forEach(System.out::println);

//        names.stream()
//                .filter()

        names.stream().sorted()
                .forEach(System.out::println);


        List<Integer> l=Arrays.asList(1,5,7,6);
        int s=l.stream().mapToInt(i->i).sum();
        System.out.println(s);
    }

}
