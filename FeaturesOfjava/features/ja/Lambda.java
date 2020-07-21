package features.ja;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
       Game football=new Game(){
           @Override
           public void play() {
               System.out.println("Iam playing football");
           }
       };
       Game cricket=new Game(){
           @Override
           public void play() {
               System.out.println("From criket");
           }
       };
       Game race=()-> System.out.println("car race");
       Game boat=()-> System.out.println("Boat race");
       race.play();
       boat.play();
       football.play();
       cricket.play();

       List<String> players= Arrays.asList("Sahana","Shravani","Shaunak","Satish");
         for(String s:players){
             if(s.equals("Shaunak")){
                 System.out.println("Yes shaunak is present");
             }
         }
         players.stream()
                 .filter(i->i.equals("Shaunak"))
                 .forEach(System.out::println);


    }

}

interface Game{
     void play();
}