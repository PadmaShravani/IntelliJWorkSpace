package Task;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("^[amn]$","m"));

//        String name="amn";
//        String[] arr=name.split(" ");
//        boolean isValid=false;
//        Pattern pattern=Pattern.compile("^(?=(?:[amn]){1})$");
//        for(String s:arr){
//            Matcher matcher=pattern.matcher(s);
//            if(matcher.matches()){
//                System.out.println("inside matcher");
//                isValid=true;
//            }
//            else{
//                isValid=false;
//            }
//        }
//        if(isValid){
//            System.out.println("Entered correct details ");
//        }
//        else{
//            System.out.println("Incorrect formate please check");
//        }

    }

}
