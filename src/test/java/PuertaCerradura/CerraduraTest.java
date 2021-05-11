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
        System.out.println("getPassword");
        Cerradura instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Cerradura.
     */
    @Test
    public void testSetPassword()
    {
        System.out.println("setPassword");
        String password = "";
        Cerradura instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOpen method, of class Cerradura.
     */
    @Test
    public void testIsOpen()
    {
        System.out.println("isOpen");
        Cerradura instance = null;
        Boolean expResult = null;
        Boolean result = instance.isOpen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of open method, of class Cerradura.
     */
    @Test
    public void testOpen()
    {
        System.out.println("open");
        String password = "";
        Cerradura instance = null;
        instance.open(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class Cerradura.
     */
    @Test
    public void testClose()
    {
        System.out.println("close");
        Cerradura instance = null;
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
