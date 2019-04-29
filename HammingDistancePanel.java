import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HammingDistancePanel extends JFrame{
	
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 700;
	
	private final class HammingDistPanel extends JPanel{
		
		
		
		
		
		//JPanel objects *************************************************************************************
		
		JPanel window = new JPanel(new GridLayout(7, 2));
		JPanel panel1 = new JPanel(new GridLayout(1, 2));
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel(new GridLayout(1,2));
		JPanel stationList = new JPanel();
		JPanel compare = new JPanel(new GridLayout(1, 2));
		JPanel distance = new JPanel(new GridLayout(1, 2));
		JPanel addStation = new JPanel(new GridLayout(1, 2));
		
		//JLabel objects **************************************************************************************
		JLabel hammingDist = new JLabel("Enter Hamming Dist: ");
		JLabel compareW = new JLabel("Compare With: ");
		
		JLabel dist0 = new JLabel("Distance 0 ");
		JLabel dist1 = new JLabel("Distance 1 ");
		JLabel dist2 = new JLabel("Distance 2 ");
		JLabel dist3 = new JLabel("Distance 3 ");
		JLabel dist4 = new JLabel("Distance 4 ");
		
		//JText objects ***************************************************************************************
		JTextField hammingDistNum = new JTextField();
		JTextField stationID = new JTextField();
		
		JTextField num0 = new JTextField();
		JTextField num1 = new JTextField();
		JTextField num2 = new JTextField();
		JTextField num3 = new JTextField();
		JTextField num4 = new JTextField();
		
		JTextField addStationID = new JTextField();
		
		//JButton objects **************************************************************************************
		
		
	}
	

}
