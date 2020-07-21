package telsuko.com;

public class LambdaDemo3 {


    public static void main(String[] args) {
    VehicalI3 obj;//Reference of interface
         obj=()->{
             System.out.println("Jeep3");
         };
    obj.vehicalType();
    CarI obj2;
    obj2=(numOfSeats)->System.out.println("car has "+numOfSeats+" wheels");

    //or
        obj2=numOfSeats-> System.out.println("car has "+numOfSeats+" wheels");

    obj2.seats(4);
    }
}

interface VehicalI3{
   void vehicalType();

}
interface CarI{
    void seats(int numOfSeats);
}