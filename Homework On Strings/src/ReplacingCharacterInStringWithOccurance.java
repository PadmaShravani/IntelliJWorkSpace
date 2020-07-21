/**Q:
 i/p:madam
 o/p:m1d2m
 */
public class ReplacingCharacterInStringWithOccurance {
    public static void main(String[] args) {
        String s="Sahana";
        char c='a';
        String temp="";
        int count=1;
        char[] arr= s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(c==arr[i]){
                temp=temp+count;
                count++;
            }
            else{
                temp=temp+arr[i];
            }
        }
        System.out.println(temp);
    }
}
