package telsuko.com;

public class LambdaDemo1 {
    public static void main(String[] args) {
    VehicalI obj;//Reference of interface
    obj=new Jeep();//object of implimentation class
    obj.vehicalType();
    }
}
 interface VehicalI{
    void vehicalType();
 }

 class Jeep implements VehicalI{

     @Override
     public void vehicalType() {
         System.out.println("Jeep");
     }
 }
