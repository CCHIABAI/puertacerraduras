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
        Puerta instance = new Puerta("1", "2", "3");
        Cerradura cerradura0 = instance.cerradura(0);
        Cerradura cerradura1 = instance.cerradura(1);
        Cerradura cerradura2 = instance.cerradura(2);

        // Checkear que las 3 cerraduras fue4ron creadas -----------------
        Boolean expResult = (cerradura0 != null) && (cerradura1 != null) && (cerradura2 != null);
        
    }

    /**
     * Test of isOpen method, of class Puerta.
     */
    @Test
    public void testIsOpen()
    {
        Puerta instance = new Puerta("1", "2", "3");
        Cerradura cerradura0 = instance.cerradura(0);
        Cerradura cerradura1 = instance.cerradura(1);
        Cerradura cerradura2 = instance.cerradura(2);

        cerradura0.open("1");
        assertFalse(instance.isOpen());
        cerradura0.open("2");
        assertFalse(instance.isOpen());
        cerradura0.open("3");
        assertTrue(instance.isOpen());
    }

    /**
     * Test of close method, of class Puerta.
     */
    @Test
    public void testClose()
    {
        Puerta instance = new Puerta("1", "2", "3");
        Cerradura cerradura0 = instance.cerradura(0);
        Cerradura cerradura1 = instance.cerradura(1);
        Cerradura cerradura2 = instance.cerradura(2);

        cerradura0.open("1");
        assertFalse(instance.isOpen());
        cerradura0.open("2");
        assertFalse(instance.isOpen());
        cerradura0.open("3");
        assertTrue(instance.isOpen());

        instance.close();
        assertFalse(instance.isOpen());
    }

    /**
     * Test of cerradurasSize method, of class Puerta.
     */
    @Test
    public void testCerradurasSize()
    {
        Puerta instance = new Puerta("1", "2", "3");
        Integer expResult = 3;
        Integer result = instance.cerradurasSize();
        assertEquals(expResult, result);
    }

}
