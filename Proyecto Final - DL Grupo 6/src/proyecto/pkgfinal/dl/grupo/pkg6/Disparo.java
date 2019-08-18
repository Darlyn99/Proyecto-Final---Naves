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
public class Disparo
{
    int visible;
    int tipo;
    int x; 
    int va;
    int y;
    int vida;
    Rectangle rect;
    int temp;
    int dx;
    int dy;
    int alto;
    int ancho;
    Image img;
    ImageIcon icono;
    public Disparo(int x, int y)
    {
        this.x=x;
        this.y=y;
        this.temp=temp;
        this.icono= new ImageIcon("image/bala.png");
        this.img=icono.getImage();
        this.ancho=icono.getIconWidth();
        this.alto=icono.getIconHeight();
        this.visible=1;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public int getX()
    {
     return x;
    }
    public int getY()
    {
     return y;
    }
    public void setTipo(int t)
    {
        this.tipo=t;
    }
    public int getTipo()
    {
     return tipo;
    }
     public void setWidth(int w)
    {
        this.ancho=w;
    }
    public int getWidth()
    {
     return ancho;
    }
     public void setHeight(int h)
    {
        this.alto=h;
    }
    public int getHeight()
    {
     return alto;
    } public void setVisible(int v)
    {
        this.visible=v;
    }
    public int getVisible()
    {
     return visible;
    }
     public void setImage(Image i)
    {
        this.img=i;
    }
    public Image getImage()
    {
     return img;
    }
     public void setIcon(ImageIcon ic)
    {
        this.icono=ic;
    }
    public ImageIcon getIcon()
    {
     return icono;
    }
    public Rectangle getRectangle()
    {
        return this.rect= new Rectangle(getX(),getY(),getWidth(),getHeight());
    }
    public boolean detectar(Rectangle r)
    {
            this.rect= new Rectangle(getX(),getY(),getWidth(),getHeight());
            return this.rect.intersects(r);
    }
    public void mover()
    {
      this.y+=2;
     if(this.temp<=1216-icono.getIconWidth())
     {
       this.x+=2;
       this.temp+=2;
     }else 
     {
        if (this.x>-50)
        {
            this.x-=2;
        }else
        {
            this.temp=0;
        }
     }
    }
     public void dibujar(Graphics g)
    {
        Graphics2D g2=(Graphics2D) g;
        if(getVisible()==1)g2.drawImage(getImage(),getX(),getY(),null);
        //g2.drawRect(getX(),getY(),getWidth()+5,getHeight());
    }
}