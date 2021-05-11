/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuertaCerradura;

/**
 * Programación Basica 2 - Comision 2900
 *
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 */
public class Cerradura
{

    private Boolean status;
    private String password;

    public Cerradura(String password)
    {
        setPassword(password);
        status = true;
    }

    // PROPIEDADES ===========================
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
        // close();
    }

    public Boolean isOpen()
    {
        return status;
    }

    // METODOS ==================================
    public void open(String password)
    {
        if (this.password.equals(password))
        {
            status = true;
        }

    }

    public void close()
    {
        status = false;
    }

}
