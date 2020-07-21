import java.util.ArrayList;
import java.util.List;

public class StaticListInput {
    static List<Integer> list = new ArrayList<>();
//    list.add(1),
//    list.add(2);

        {
        list.add(5);
        list.add(10);

    }
    public static void main(String[] args) {
        StaticListInput in=new StaticListInput();
//        list.add(15);
//        list.add(20);
        for(Integer i:in.list)
        System.out.println(i);
    }
}
