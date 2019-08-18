
package proyecto.pkgfinal.dl.grupo.pkg6;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon.*;

public class Bala
{
    int visible;
    int tipo;
    int x; 
    int va;
    int y;
    int vida;
    Rectangle rect;
    boolean disparo;
    int dx;
    int dy;
    int alto;
    int ancho;
    Image img;
    ImageIcon icono;
    public Bala(int x, int y)
    {
        this.x=x;
        this.y=y;
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
        if(disparo==true)
        {
             if(getY()==500)
             {
                 disparo=false;
             }
             this.y-=2;
        }else
        {
            if(dx== -5 && x>0)
            {
                if(disparo==false)this.x+=dx;
                if(y<490&&y>0)
                {
                    disparo=true;
                }else
                {
                    disparo=false;
                }
            }
            if(dx==5 && x< 1216-icono.getIconWidth())
            {
                if(disparo==false)this.x+=dx;
                if(y<490&&y>0)
                {
                    disparo=true;
                }else
                {
                    disparo=false;
                }
                
            }
        }
    }
    public void keyPressed(KeyEvent e)
    {
        int key=e.getKeyCode();
        if(key==KeyEvent.VK_UP)
        {
            dy=-2;
            disparo=true;
        }
        if(key==KeyEvent.VK_LEFT)
        {
            dx=-5;
            disparo=false;
        }
        if(key==KeyEvent.VK_RIGHT)
        {
           dx=5;
           disparo=false;
        }
    }
    public void keyReleased(KeyEvent e)
    {
        int key=e.getKeyCode();
        if(key==KeyEvent.VK_UP)
        {
            dy=0;
        }
        if(key==KeyEvent.VK_LEFT)
        {
            dx=0;
        }
        if(key==KeyEvent.VK_RIGHT)
        {
            dx=0;
        }
    }
     public void dibujar(Graphics g)
    {
        Graphics2D g2=(Graphics2D) g;
        if(getVisible()==1)g2.drawImage(getImage(),getX(),getY(),null);
        //g2.drawRect(getX(),getY(),getWidth()+5,getHeight());
    }
}
