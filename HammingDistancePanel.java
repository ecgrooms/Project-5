import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HammingDistancePanel extends JFrame{
	
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 700;
	
	ArrayList<HammingDistance> stationList = new ArrayList<HammingDistance>();
	
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
		JButton showStation = new JButton("Show Station");
		JButton calHD = new JButton("Calculate HD");
		JButton addID = new JButton("Add Station");
		
		//******************************************************************************************************
		public HammingDistPanel(){
			
			
			//Add to Panel *********************************************************************
			window.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT - 300));
			window.add(panel1);
			window.add(panel2);
			window.add(panel3);
			window.add(stationList);
			window.add(compare);
			window.add(distance);
			window.add(addStation);
			
			this.add(window);
			
			}
			
			
			
			//Set ActionListeners on 3 buttons ****************************************************
			
			
			
			
			//JTextFields ***********************************************************************
			
			
		}
	
		
	//DefaultComboBoxModel to make combo box for station list *****************************
	private DefaultComboBoxModel<String> getComboBoxModel(List<HammingDistance> list)
	{
		ArrayList<String> station = new ArrayList<String>();
		
		for (HammingDistance l : list){
			station.add(l.toString());
		}
		
		String[] comboBoxModel = station.toArray(new String[station.size()]);
		
	    return new DefaultComboBoxModel<>(comboBoxModel);
		
	}
	

}
