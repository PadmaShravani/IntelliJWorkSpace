package features.ja;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<Integer> primeNum= Arrays.asList(5,7,11,13);
        List<Integer> oddNum=Arrays.asList(1,3,5);
        List<Integer> evenNum=Arrays.asList(2,4,6,8);

        List<List<Integer>> listOfList=Arrays.asList(primeNum,oddNum,evenNum);
        System.out.println("listOflist is "+listOfList);

        List<Integer> list=listOfList.stream().flatMap(l->l.stream()).collect(Collectors.toList());
        System.out.println(list);


    }

}
