import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class house extends Applet implements MouseListener{
	int a, b;
	public void init() {
		addMouseListener(this);
		}
	public void paint (Graphics g) {
		
		int x[]= {200,300,400};
		int y[]= {200,20,200};
		
		g.setColor(Color.ORANGE);
		g.fillPolygon(x,y,3);
		g.setColor(Color.YELLOW);
		g.fillRect(200, 200, 200, 275);
		g.setColor(Color.BLUE);
		g.fillRect(275, 275, 50, 200);
		
		if(a>269 && a<321 && b>275 && b<470) {
            g.setColor(Color.RED);
            g.fillRect(275, 275, 50, 200);
        }
		
	}
	public void mouseEntered(MouseEvent e) {

    }
    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
    	  a=e.getX();
        b=e.getY();

        repaint();

    }

    public void mouseReleased(MouseEvent e) {

    }
    
    @Override
    public void mouseExited(MouseEvent e) {

    }


}
/*
<applet code = "house.class" border ="2" height ="500" width="500" >
	
</applet>
*/
