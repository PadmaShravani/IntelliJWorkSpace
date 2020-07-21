import java.util.ArrayList;
import java.util.List;

/**Q:remove particular character from given String? */
public class ReplaceCharInString {
    public static void main(String[] args) {
        String name = "Shravani";
        //using string method
        String newName=name.replace('a','o');
        System.out.println("replace method "+newName);

        //using collection
        List<Character> list=new ArrayList<>();
        char c1='h';
        char replace='s';
        char[] arr=name.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==c1){
                list.add(replace);
            }
            else
                list.add(arr[i]);
        }
        for(Character c:list)
        System.out.print(c);
    }
}
