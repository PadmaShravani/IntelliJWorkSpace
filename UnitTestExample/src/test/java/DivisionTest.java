import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DivisionTest {
    @Test
    public void divTest(){
        int exp=2;
        Division d=new Division();
        int actual=0;
        try {
          actual=  d.div(4,2);

        } catch (ArithmeticException e) {
            Assert.fail("Test failed : " + "error check");
        }

        assertEquals(exp,actual);

    }
}
