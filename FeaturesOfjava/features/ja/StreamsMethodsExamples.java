package features.ja;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsMethodsExamples {
    public static void main(String[] args) {
//        List<Integer> numbers= Arrays.asList(1,7,9,6,10);
//        List<Integer> square=numbers.stream().map(x->x*x).collect(Collectors.toList());
//        System.out.println(square);
//
//        List<String> names=Arrays.asList("Shravani","Satish","Shaunak","Sahana");
//        List<String>result=names.stream().filter(i->i.endsWith("k")).collect(Collectors.toList());
//        System.out.println(result);

        List<Integer> list=Arrays.asList(2,3,4,5);
        int even=list.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println("reduce "+even);

        List<String> names2=Arrays.asList("java8","Core java","multiThreading");
        List<String> res=names2.stream().sorted().collect(Collectors.toList());
        System.out.println(res);
//        numbers.stream().map(i->i+i).forEach(j-> System.out.println(j));
//        numbers.stream().filter(n->n>6).forEach(s-> System.out.println(s));

        List<String> alphabets=Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
        List<String> filterData=alphabets.stream().filter(str->str.startsWith("m") && str.endsWith("z")).collect(Collectors.toList());
        for(String s:filterData) {
            System.out.println("for");
            System.out.println(s);
        }


        System.out.println(filterData);
        System.out.println("vni");

        //IntStream.rangeClosed('m','z').forEach(c-> System.out.println((char)c));



    }





}
