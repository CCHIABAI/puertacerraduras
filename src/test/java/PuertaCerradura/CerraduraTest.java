/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuertaCerradura;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 */
public class CerraduraTest
{

    public CerraduraTest()
    {
    }

    /**
     * Test of getPassword method, of class Cerradura.
     */
    @Test
    public void testGetPassword()
    {
        String password = "123";
        Cerradura instance = new Cerradura(password);
        String result = instance.getPassword();
        assertEquals(password, result);
    }

    /**
     * Test of setPassword method, of class Cerradura.
     */
    @Test
    public void testSetPassword()
    {
        String password = "123";
        Cerradura instance = new Cerradura("321");
        instance.setPassword(password);
        String result = instance.getPassword();
        assertEquals(password, result);
        assertNotEquals("321", result);
    }

    /**
     * Test of isOpen method, of class Cerradura.
     */
    @Test
    public void testIsOpen()
    {
        String password = "123";
        Cerradura instance = new Cerradura(password);
        assertTrue(instance.isOpen()); 
        instance.close();
        assertFalse(instance.isOpen()); // Close
    }

    /**
     * Test of open method, of class Cerradura.
     */
    @Test
    public void testOpen()
    {
        String password = "123";
        Cerradura instance = new Cerradura(password);
        assertTrue(instance.isOpen()); 
        instance.open(password);
    //    assertFalse(instance.isOpen()); // Close
    }

    /**
     * Test of close method, of class Cerradura.
     */
    @Test
    public void testClose()
    {
        String password = "123";
        Cerradura instance = new Cerradura(password);
        instance.close();
        assertFalse(instance.isOpen()); // Close
        instance.open(password);
        assertTrue(instance.isOpen());  // Open
    }

}
