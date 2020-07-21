package telsuko.com;

public class LambdaDemo2 {
    public static void main(String[] args) {
    VehicalI2 obj;//Reference of interface
         obj=new VehicalI2() {
             @Override
             public void vehicalType() {
                 System.out.println("Jeep2");
             }
         };
    obj.vehicalType();
    }
}

interface VehicalI2{
   void vehicalType();
}

// class Jeep2 implements VehicalI2{
//
//     @Override
//     public void vehicalType() {
//                  System.out.println("Jeep2");
//     }
