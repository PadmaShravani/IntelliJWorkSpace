import java.util.LinkedHashMap;
import java.util.Map;

// Q:getting unique values from given string?
//	narayanam :r==1,y=1
public class UniqueValuesInString {
    public static void main(String[] args) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        String name = "narayanam";
        char arr[] = name.toCharArray();
        for (Character c : arr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else
                map.put(c, 1);
        }

        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if(m.getValue()==1)
            System.out.print(m.getKey()+" -> "+m.getValue()+" ");
        }

        Map<String, Integer> mapS = new LinkedHashMap<>();
        String s = "hi hello how are u how are u today";
        String[] newS=s.split(" ");
        for(int i=0;i<newS.length;i++)
            System.out.print(newS[i]+" ");
        for (String x : newS) {
            if (mapS.containsKey(x)) {
                mapS.put(x, mapS.get(x) + 1);
            } else
                mapS.put(x, 1);
        }
        for (Map.Entry<String, Integer> m : mapS.entrySet()) {
            if(m.getValue()==1)
            System.out.print(m.getKey()+" -> "+m.getValue()+" ");
        }
    }

}
