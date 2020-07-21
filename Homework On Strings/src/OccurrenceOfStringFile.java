import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

//occurnces of each string in given file?
public class OccurrenceOfStringFile {
    public static void main(String[] args) throws IOException {

        Map<String, Integer> mapS = new LinkedHashMap<>();
        FileReader fr=new FileReader("C:\\Intelli J\\IntelliJ WorkSpace\\Homework On Strings\\src\\Data.txt");
        int i;
        String s="";
        char c=' ';
        while((i=fr.read())!=-1)
        {
           // System.out.print((char)i);
            s=s+(char)i;
        }
      //  s=Character.toString(c);
        String[] newS=s.split(" ");
        for(i=0;i<newS.length;i++)
            System.out.print(newS[i]+" ");
        for (String x : newS) {
            if (mapS.containsKey(x)) {
                mapS.put(x, mapS.get(x) + 1);
            } else
                mapS.put(x, 1);
        }
        for (Map.Entry<String, Integer> m : mapS.entrySet()) {
            System.out.print(m.getKey()+" -> "+m.getValue()+" ");
        }
    }
}
