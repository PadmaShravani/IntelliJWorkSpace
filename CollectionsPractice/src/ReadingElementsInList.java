import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Reading elementsusing iterator
public class ReadingElementsInList {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(50);
        list.add(25);
        list.add(80);
        list.add(55);
        Iterator<Integer> i=list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


    }
}
