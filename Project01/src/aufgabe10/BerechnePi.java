package aufgabe10;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BerechnePi extends JFrame
{

    public BerechnePi()
    {
        super();
        this.setTitle("Wir zeichnen");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

        this.getContentPane().add(new Canvas());

        this.setSize(400, 300);
        this.setLocation(300,200);
        this.setVisible(true);
    }

    private class Canvas extends JPanel
    {
    	@Override
    	protected void paintComponent(Graphics g)
    	{
    	    super.paintComponent(g);       
    	    Graphics2D g2 = (Graphics2D)g;  
    	    						
    	    Shape arc3 = new Arc2D.Double(10.0, 10.0, 420.0, 420.0, 90.0, 90.0, Arc2D.OPEN);
    	    g2.setStroke(new BasicStroke(2.0f)); //pixel größe
    	//    g2.setColor(Color.BLACK);
    	    g2.draw(arc3);
    	    
    	    g2.drawRect(10, 10, 210, 210);
    	    
    	    int r = 210;
    	    int xm = 220;
    	    int ym = 220;
    	    
    	    double counter = 0;
    	    double gesamt = 5000;
    	    for(int i = 1; i <= gesamt; i++) {
    	    	int x = new Random().nextInt(211) + 10;
    	    	int y = new Random().nextInt(211) + 10;
    	    	
    	    	double value = Math.pow(x-xm, 2) + Math.pow(y-ym, 2);
    	    	
    	    	if (value <= Math.pow(r, 2)) {
    	    		g2.setColor(Color.RED);
    	    		counter++;
    	    	}
    	    	
    	    	else {
    	    		g2.setColor(Color.BLUE);
    	    	}
    	    	g2.drawOval(x, y, 2, 2);
    	    }
    	    double quotient = counter / gesamt;
    	    System.out.println("quotient: " + quotient);
    	    System.out.println("PI/4: " + Math.PI / 4);
    	    
    	}
    	
    	// PI = 3.14 
        // PI /4 = 0,785
    	// rp / allepunkte = ergebnis (quotient) -> PI/4
    	

    }

    public static void main(String[] args) 
    {
        new BerechnePi();
    }

}

