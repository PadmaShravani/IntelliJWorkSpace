import java.util.ArrayList;
import java.util.List;

public class RemoveCharInString {
    public static void main(String[] args) {
        String name = "Shravani";

        List<Character> list=new ArrayList<>();
        char c1='h';
        char[] arr=name.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==c1){
            }
            else
                list.add(arr[i]);
        }
        for(Character c:list)
            System.out.print(c);

       String newS="";
        for(int i=0;i<arr.length;i++){
            if(arr[i]==c1){
            }
            else
                newS=newS+arr[i];
        }
        System.out.println();
            System.out.print(newS);
    }

}
