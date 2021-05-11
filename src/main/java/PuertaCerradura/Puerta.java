/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuertaCerradura;

import java.util.ArrayList;
import java.util.List;

/**
 * Programación Basica 2 - Comision 2900
 *
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 */
public class Puerta
{

    private List<Cerradura> cerraduras;

    public Puerta(String password0, String password1, String password2)
    {
        cerraduras = new ArrayList<Cerradura>();
        cerraduras.add(new Cerradura(password0));
        cerraduras.add(new Cerradura(password1));
        cerraduras.add(new Cerradura(password2));
    }

    public Cerradura cerradura(Integer indice)
    {
        if ((indice > 0) && (indice < cerraduras.size()))
        {
            return cerraduras.get(indice);
        }
        else

        {
            return null;
        }
    }

    public Boolean isOpen()
    {
        Boolean open = true;
        for (Cerradura cerradura : cerraduras)
        {
            open = open && cerradura.isOpen();
        }

        return open;
    }

    public void close()
    {
        for (Cerradura cerradura : cerraduras)
        {
            cerradura.close();
        }
    }
    
    public Integer cerradurasSize()
    {
        return cerraduras.size();
    }

}
