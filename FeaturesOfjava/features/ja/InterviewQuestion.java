package features.ja;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class InterviewQuestion {
static {
   final List<String> values = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
   final List<String> data = values.stream().filter(str ->str.startsWith("m") && str.endsWith("z")).collect(Collectors.toList());
    for (final String str : data) {
        System.out.println("for");
        System.out.println(str);
    }
    System.out.println("hello");
}

    public static void main(String[] args) {

    }
}
