public class Util {
    public static String method(){
        return anotherMethod();
    }

    private static String anotherMethod() {
        throw new RuntimeException(); // logic was replaced with exception.
    }
}