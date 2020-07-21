public class Riverse {
    //int num=123;
    int temp=0;
    public void riv(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-1];
            arr[arr.length-1]=temp;

        }
        for(int a:arr)
        System.out.println(a);
    }
}
