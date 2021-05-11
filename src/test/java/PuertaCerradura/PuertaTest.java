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
public class PuertaTest
{
    
    public PuertaTest()
    {
    }

    /**
     * Test of cerradura method, of class Puerta.
     */
    @Test
    public void testCerradura()
    {
        System.out.println("cerradura");
        Integer indice = null;
        Puerta instance = null;
        Cerradura expResult = null;
        Cerradura result = instance.cerradura(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOpen method, of class Puerta.
     */
    @Test
    public void testIsOpen()
    {
        System.out.println("isOpen");
        Puerta instance = null;
        boolean expResult = false;
        boolean result = instance.isOpen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
