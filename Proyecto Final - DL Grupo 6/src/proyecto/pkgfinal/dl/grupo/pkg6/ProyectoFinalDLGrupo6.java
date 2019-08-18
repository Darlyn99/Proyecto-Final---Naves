/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkgfinal.dl.grupo.pkg6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon.*;

public class ProyectoFinalDLGrupo6 extends JFrame
{
    Escenario e; 
    public ProyectoFinalDLGrupo6()
    {
        e = new Escenario();
        add(e);
        setSize(1216,700);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new ProyectoFinalDLGrupo6();
    }
}
