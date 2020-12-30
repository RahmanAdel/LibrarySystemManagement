/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSMProject.controller;
import static org.junit.Assert.*;
import org.junit.*;
/**
 *
 * @author Adel_Rahman
 */
public class Login_userTest {
    Login_user l;
    
    @Before 
    public void setUp() throws Exception{
        l = new Login_user();
    }
    
    @Test
    public void testActionPerformed(){
        assertEquals(2,l.calculate_login(1, 1));
    }
    
}
