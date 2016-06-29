package test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class ZeichenPanel extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Timer timer=new Timer(1, this);
	
	public ZeichenPanel() {
		timer.start();
	}
	
	public void drawRectangle(Graphics g) {
		g.drawRect(5, 5, 195, 195);
		
		g.drawLine(5, 5, 195, 195);
		g.drawLine(5, 195, 195, 5);
	}
	
	public void drawNet(Graphics g) {
		int ABSTAND = 5;
		int width = this.getWidth();
		int height = this.getHeight();
		
		for(int i = 0; i <= height; i += ABSTAND) {
			g.drawLine(0, i, width, i);
		}
		
		for(int i = 0; i <= width; i += ABSTAND) {
			g.drawLine(i, 0, i, height);
		}

	}
	
	public void drawRoomA(Graphics g) {
		int ABSTAND = (int)(Math.sin((double)System.currentTimeMillis() / 5000.0) * 10.0) + 10;
		
		//int ABSTAND = 5;
		int width = this.getWidth();
		int height = this.getHeight();
		
        for(int i = 0; i <= width; i += ABSTAND) {
			g.drawLine(i, 0, width - i, height);
		}
        
        for(int i = 0; i <= height; i += ABSTAND) {
			g.drawLine(0, i, width, height - i);
		}
	}
	
	public void drawRandomLines(Graphics g) {
		for(int i = 0; i < 10000; i++) {
			int r = (int)(Math.random() * 256);
			int ge = (int)(Math.random() * 256);
			int b = (int)(Math.random() * 256);

			g.setColor(new Color(r, ge, b));
			
			int x1 = (int)(Math.random() * this.getWidth());
			int y1 = (int)(Math.random() * this.getHeight());
			
			int x2 = (int)(Math.random() * this.getWidth());
			int y2 = (int)(Math.random() * this.getHeight());
			
			g.drawLine(x1, y1, x2, y2);
		}
	}
	
	public void drawCircles(Graphics g) {
		int ABSTAND = 10;
		
		for(int i = 0; i < 10; i++) {
			g.drawOval(this.getWidth()/2 - i * ABSTAND / 2,this.getHeight()/2 - i * ABSTAND / 2, i * ABSTAND, i * ABSTAND);
		}
	}

	public void drawRectangles(Graphics g) {
		int ABSTAND = 10;

		for(int i = 0; i < this.getWidth() / 20; i++) {
			g.drawRect(ABSTAND * i, ABSTAND * i, 10*i, 10*i);
        }
	}
	
	public void drawMathStuff(Graphics g) {
		double ANGLE = 45;
		int ABSTAND = 10;
		
		int width = this.getWidth();
		int height = this.getHeight();
		
		for(int i = 0; i < width / ABSTAND; i++) {
			int x2 = width/2 + i * ABSTAND;
			int y2 = height;
			
			if(y2 > height) {
				//y2 = height;
			}
			
			g.drawLine(i * ABSTAND, 0, x2, y2);
		}
	}
	
	public void drawFunction(Graphics g) {
        int width = this.getWidth();
		int height = this.getHeight();
		final int ABSTAND = 25;
		
		// x-Achse
		g.drawLine(0, height / 2, width, height / 2);
		for(int i = 0; i < width; i += ABSTAND) {
			g.drawLine(i, height / 2 - 2, i, height / 2 + 2);
			g.drawString(String.format("%d", (i-width/2)/ABSTAND), i, height/2 + 10);
		}
		
		// y-Achse
		g.drawLine(width/2, 0, width/2, height);
        for(int i = 0; i < height; i += ABSTAND) {
			g.drawLine(width / 2 - 2, i, width / 2 + 2, i);
			g.drawString(String.format("%d", (height/2-i)/ABSTAND), width / 2, i + 10);
		}
        
        double lastX = 0;
        double lastY = 0;
        
        // Plot
        for(double i = 0; i < width; i += 0.1) {
        	double x = i * ABSTAND;
        	double xf = x - width / 2;
        	double y = xf + height / 2;
        	g.drawLine((int)lastX, height - (int)lastY, (int)x, height - (int)y);
        	
        	lastX = x;
        	lastY = y;
        }
	}
	
	public void drawAlphabet(Graphics g) {
        int width = this.getWidth();
		final int ABSTAND = 20;
		
		int x = ABSTAND;
		int y = ABSTAND;
		
		for(int i = 65; i < 90; i++) {
			g.drawString("" + (char)i, x, y);
			
			x += ABSTAND;

			if(x >= width - ABSTAND) {
				x = ABSTAND;
				y += ABSTAND;
			}
		}
	}
	
    public void actionPerformed(ActionEvent ev){
        if(ev.getSource()==timer) {
            //repaint();
        }
    }
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//drawRectangle(g);
		//drawNet(g);
		//drawRoomA(g);
		//drawRandomLines(g);
		//drawCircles(g);
		//drawRectangles(g);
		//drawRectangles(g);
		//drawMathStuff(g);
		drawFunction(g);
		//drawAlphabet(g);
	}
}
