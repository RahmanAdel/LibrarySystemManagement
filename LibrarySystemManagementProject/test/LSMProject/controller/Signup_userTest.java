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
public class Signup_userTest {
    Signup s; 
    
    @Before 
    public void setUp() throws Exception{
        s = new Signup();
    }
    
    @Test   
    public void testActionPerformed(){
    assertEquals(2,s.calculate_signup(1,1));
} 
}
