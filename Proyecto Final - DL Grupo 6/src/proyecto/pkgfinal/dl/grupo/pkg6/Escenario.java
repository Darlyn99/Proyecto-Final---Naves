
package proyecto.pkgfinal.dl.grupo.pkg6;

import javax.swing.*;
import java.awt.*;
import java.awt.Component.*;
import java.awt.event.*;
import javax.swing.ImageIcon.*;
import java.util.Random;
import javax.swing.Timer.*;
import java.awt.event.KeyEvent;

public class Escenario extends JPanel implements ActionListener,KeyListener
{
   ImageIcon icono;
   Image fondo;
   Naves naves[];
   Nave na;
   Timer t;
   Random rm;
   Bala bala;
   Disparo disparo[];
   Font letra;
   int puntos;
   public Escenario()
   {
        icono= new ImageIcon("image/space.png");
        fondo=icono.getImage();
        na= new Nave(100,500,3);
        naves = new Naves[16];
        disparo= new Disparo [3];
        rm= new Random();
        bala= new Bala(na.getX()+50,na.getY());
        letra= new Font("Times New Roman",Font.BOLD,50);
        int x=50;
       naves[0]= new Naves(900,0);
       naves[1]= new Naves(750,0);
       naves[2]= new Naves(600,0);
       naves[3]= new Naves(450,0);
       naves[4]= new Naves(300,0);
       naves[5]= new Naves(150,0);
       naves[6]= new Naves(0,0);
       naves[7]= new Naves(820,100);
       naves[8]= new Naves(675,100);
       naves[9]= new Naves(525,100);
       naves[10]= new Naves(375,100);
       naves[11]= new Naves(225,100);
       naves[12]= new Naves(75,100);
       naves[13]= new Naves(600,200);
       naves[14]= new Naves(450,200);
       naves[15]= new Naves(300,200);
       //disparo[0]=new Disparo(600+50,200);
       //disparo[1]=new Disparo(450+50,200);
       //disparo[2]=new Disparo(350,200);
        t=new Timer(5,null);
        t.addActionListener(this);
        t.start();
        addKeyListener(this);
        setSize(1216,760);
        setFocusable(true);
        setVisible(true);
   }
   public void paint(Graphics g)
   {
        super.paint(g);
        Graphics2D g2= (Graphics2D) g;
        g2.drawImage(this.fondo,0,0,this);
        g2.drawString("Vidas: "+na.getVida()+"\nPuntuacion: "+puntos,100,100);
        g2.setColor(Color.red);
        g2.setFont(letra);
        na.dibujar(g);
        for(int i=0;i<naves.length;i++)
        {
            naves[i].dibujar(g);
        }
            bala.dibujar(g);
        
        repaint();
   }
   public void actionPerformed(ActionEvent ev)
   {
        na.mover();
        bala.mover();
        if(bala.getY()==0)
        {
            bala.setY(na.getY());
                bala.setX(na.getX()+50);
        }
        for(int i=0;i<naves.length;i++)
        {
            naves[i].mover();
           // disparo[0].mover();
            //disparo[2].mover();
            //disparo[1].mover();
            //if(disparo[i].detectar(na.getRectangle()))
            //{
              //  disparo[i].setVisible(0);
                //if(na.getVida()==0)
                //{
                 //   System.exit(0);
                //}else
                //{
                  //  na.setVida(na.getVida()-1);
                    //naves[i].setY(2000);
               // }
           // }
        }
        for(int i=0;i<naves.length;i++)
        {
            if(bala.detectar(naves[i].getRectangle()))
            {
                naves[i].setVisible(0);
                naves[i].setY(2000);
                bala.setY(na.getY());
                bala.setX(na.getX()+50);
                puntos=puntos+20;
                
                
            }
        }
   }
   public void keyPressed(KeyEvent ev)
   {
        na.keyPressed(ev); 
        bala.keyPressed(ev); 
   }
   public void keyReleased(KeyEvent ev)
   {
        na.keyReleased(ev); 
        bala.keyReleased(ev); 
   }
   public void keyTyped(KeyEvent ev)
   {
     
   }
}   