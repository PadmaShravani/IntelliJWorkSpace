//@PrepareForTest(Util.class)
//public class UtilTest extends PowerMockTestCase {
//
//    @Test
//    public void should_prevent_invoking_of_private_method_but_return_result_of_it() throws Exception {
//
//        PowerMockito.mockStatic(Util.class);
//        PowerMockito.when(Util.class, "anotherMethod").thenReturn("abc");
//
//        String retrieved = Util.method();
//
//        assertNotNull(retrieved);
//        assertEquals(retrieved, "abc");
//    }
//}
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
////import org.mockito.Mockito;
//import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.modules.junit4.PowerMockRunner;
//
//@PrepareForTest(Util.class)
//@RunWith(PowerMockRunner.class)
//public class UtilTest {
//
//    //private Mockito PowerMockito;
//
//    @Test
//    public void testMethod() throws Exception {
//
//        PowerMockito.spy(Util.class);
//        PowerMockito.doReturn("abc").when(Util.class, "anotherMethod");
//
//        String retrieved = Util.method();
//
//        Assert.assertNotNull(retrieved);
//        Assert.assertEquals(retrieved, "abc");
//    }
//}