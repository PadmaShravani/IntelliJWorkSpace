import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> newList=new ArrayList<>();
        list.add(50);
        list.add(15);
        list.add(0);
        list.add(5);
        list.add(50);
        list.add(25);
       // newList.r
        for(int i=0;i<list.size();i++){
            if(newList.contains(list)){
                newList.add(i);
            }
        }
        Iterator<Integer> i=newList.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
