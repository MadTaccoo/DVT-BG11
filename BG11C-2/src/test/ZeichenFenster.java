package test;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ZeichenFenster extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel panel;
	
	public ZeichenFenster() {
		panel = new ZeichenPanel();
		panel.setPreferredSize(new Dimension(200, 200));
		this.add(panel);
	}

	public static void main(String[] args) {
		ZeichenFenster zf = new ZeichenFenster();
		zf.setTitle("Zeichenfenster");
		zf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		zf.pack();
		zf.setVisible(true);
	}

}
