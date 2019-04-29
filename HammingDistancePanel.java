import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HammingDistancePanel extends JFrame{
	
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 700;
	
	private final class HammingDistPanel extends JPanel{
		
		
		
		
		
		/*
		 * JPanel objects
		 * 
		 */
		
		JPanel window = new JPanel(new GridLayout(7, 2));
		JPanel panel1 = new JPanel(new GridLayout(1, 2));
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel(new GridLayout(1,2));
		JPanel stationList = new JPanel();
		JPanel compare = new JPanel(new GridLayout(1, 2));
		JPanel distance = new JPanel(new GridLayout(1, 2));
		JPanel addStation = new JPanel(new GridLayout(1, 2));
		
	}
	

}
