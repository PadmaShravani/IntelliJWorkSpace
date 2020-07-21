import java.util.ArrayList;
import java.util.List;

public class SumTest1 {

    // CREATE AND POPULATE A STATIC JAVA LIST
    static final List<Integer> nums = new ArrayList<Integer>() {{
        add(1);
        add(2);
        add(3);
    }};
 static
 {
     List<String> list =new ArrayList<>();
 list.add("shravani");

 }
    public static void main(String[] args) {
        int total = sum(nums);
        System.out.println("Sum: " + total);
    }

    public static int sum(List<Integer> ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }

}
