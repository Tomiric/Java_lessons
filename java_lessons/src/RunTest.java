import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class RunTest {
    @Before
    public void setUp(){

    }

    @Test
    public void method1(){
        String a = "abcde";
        String b = new String(a);
        assertTrue(a.equals(b));
        assertFalse(a == b);
        assertEquals(a, b);
    }



    @After
    public void tearDown(){

    }
}

