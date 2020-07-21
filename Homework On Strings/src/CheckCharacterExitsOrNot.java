import java.util.ArrayList;
import java.util.List;

//Q:check whether character is exists or not in given string?
public class CheckCharacterExitsOrNot {
    public static void main(String[] args) {
        String name="Sahana";
        char c='a';
        CharSequence cs="h";
        boolean flag=false;
        char[] arr=name.toCharArray();
       //Using character sequence
        if(name.contains(cs))
            System.out.println("Character exits charsequence contains way");
        else
            System.out.println("doest has char charsequence contains way");

        //Using collections contains method
        List<Character> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        if(list.contains(c)){
            System.out.println("charater exits contains method");
        }
        else
            System.out.println("doest not exits contains method");

      //Normal way to check

        for(int i=0;i<arr.length;i++){
            if(arr[i]==c) {
                flag = true;
                break;
            }
            else
                flag=false;
        }
        if(flag){
            System.out.println("character exits normal way");
        }
        else
            System.out.println("character does not exits normal way");
    }


}
