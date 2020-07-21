package features.ja;

import java.util.Arrays;
import java.util.Optional;

public class ReduceLearning {
    public static void main(String[] args) {
        String[] array = { "Geeks", "for", "Geeks" };

        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> String_combine = Arrays.stream(array)
                .reduce((str1, str2)
                        -> str1 + "-" + str2);
        System.out.println(String_combine);
String str="A is for apple ";
        String reversed = str. chars() . mapToObj(c -> (char)c) . reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);
        System.out.println(reversed);
    }
}
