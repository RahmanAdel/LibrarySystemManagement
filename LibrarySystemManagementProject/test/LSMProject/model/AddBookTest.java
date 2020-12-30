/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSMProject.model;
import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author Adel_Rahman
 */
public class AddBookTest {
    AddBook a; 
    
    @Before 
        public void setUp() throws Exception{
        a = new AddBook();
    }
    
    @Test   
    public void testActionPerformed(){
        assertEquals(2,a.calculate_addbook(1,1));
} 
    
}
