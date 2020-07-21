package Task;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationExample {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name="Shravani Padma";
        String[] arr=name.split(" ");
        boolean isValid=false;
        Pattern pattern=Pattern.compile("^[A-Za-z]*$");
        for(String s:arr){
            Matcher matcher=pattern.matcher(s);
            if(matcher.matches()){
                System.out.println("inside matcher");
                isValid=true;
            }
            else{
                isValid=false;
            }
        }
        if(isValid){
            System.out.println("Entered correct details ");
        }
        else{
            System.out.println("Incorrect formate please check");
        }

    }


}
