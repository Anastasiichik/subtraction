package subtraction;
import org.junit.*;
import static org.junit.Assert.*;
/**
 * @author Anastasia
 */
public class TestSubtr {
    @Test(expected = Exception.class)
    public void testSub(){
        subtr val1 = new subtr(2);
        subtr val2 = new subtr(2);
        subtr exp = new subtr(0);
        subtr res = val1.sub(val2);    
        
        assertEquals(res,exp);
        assertEquals(new subtr(2).sub(new subtr(3)),new subtr(-1));
        assertNotNull(val1);
        assertNotNull(val2);
       
    }
}
