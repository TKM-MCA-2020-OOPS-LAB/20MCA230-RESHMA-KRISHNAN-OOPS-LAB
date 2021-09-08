import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class shapes extends Applet implements ItemListener{
     Color clr;
     String shape;
     Choice c = new Choice();
     
 
     public void init(){
	      c.add("RECTANGLE");
	      c.add("TRIANGLE");
	      c.add("SQUARE");
	      c.add("CIRCLE");
	      add(c);
	
        c.addItemListener(this);
}


     @Override
     public void itemStateChanged(ItemEvent e){
         shape = c.getSelectedItem();
         repaint();
}


   public void paint(Graphics g){
          super.paint(g);
          clr=new Color(255,255,153);
          setBackground(clr);
          g.setColor(new Color(0,0,0));
          g.drawString("Select any shape",40,10);
          g.setColor(new Color(255,51,51));
          
          if (shape.equals("RECTANGLE")){
	          g.fillRect(50,50,330,120);
        }
	
          g.setColor(new Color(255,204,0));
          
          if (shape.equals("SQUARE")){
	          g.fillRect(50,50,100,100);
        }
	
          g.setColor(new Color(0,255,51));
	
          if (shape.equals("TRIANGLE")){
	          int x[] = {200,300,100};
   	        int y[] = {200,300,300};
  	        int n = 3;
	          g.fillPolygon(x, y, n);
        }
     
          g.setColor(new Color(0,0,255));
     
	        if (shape.equals("CIRCLE")){
	          g.fillOval(20, 120, 200, 160);
       }
   }
}
/* 
<applet code="shapes.class" width="500" height="500" border="2"> 
</applet> 
*/  

