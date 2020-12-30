/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSMproject.Controller;
import static org.junit.Assert.*;
import org.junit.*;
/**
 *
 * @author Adel_Rahman
 */


public class ForgotTest {
    Forgot f;
    
    @Before
    public void setUp() throws Exception{
        f = new Forgot();
     }
    
    @Test
    public void testActionPerformed(){
        assertEquals(2,f.calculate_forgot(1,1));
    }
    
}
