import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumTest
{
    @Test
    public void testAdd()
    {
        int expected=100;
        //create an object to ur class
        Sum s=new Sum();
        //call original method on top of ur object
        int actual = s.add(10,90);
        assertEquals(expected, actual);

    }
}