import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class HammingDistanceWindow extends JFrame{
		
		private static final int FRAME_WIDTH = 600;
		private static final int FRAME_HEIGHT = 700;
		
		ArrayList<String> stationIDList = new ArrayList<String>();
		
		
		
		public class HammingDistPanel extends JPanel{
				
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			//JPanel objects *************************************************************************************
			JPanel b = new JPanel();
			JPanel window;
			JPanel panel1 = new JPanel(new GridLayout(1, 1));
			JPanel panel2 = new JPanel();
			JPanel panel3 = new JPanel();
			JPanel stationList = new JPanel(new GridLayout(1, 1));
			JPanel compare = new JPanel(new GridLayout(1, 2));
			JPanel cal = new JPanel();
			JPanel distance = new JPanel(new GridLayout(5, 2));
			JPanel addStation = new JPanel();
			
			//JLabel objects **************************************************************************************
			JLabel hammingDist = new JLabel("Enter Hamming Dist: ");
			JLabel compareW = new JLabel("Compare With: ");
			
			JLabel dist0 = new JLabel("Distance 0 ");
			JLabel dist1 = new JLabel("Distance 1 ");
			JLabel dist2 = new JLabel("Distance 2 ");
			JLabel dist3 = new JLabel("Distance 3 ");
			JLabel dist4 = new JLabel("Distance 4 ");
			
			//JText objects ***************************************************************************************
			JTextField hammingDistNum = new JTextField(1);
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
			public HammingDistPanel() {
				this.setLayout(new GridLayout(1, 1));
				
				window = new JPanel(new GridLayout(8, 2));
				window.setSize(1000, 500);
				this.add(window, BorderLayout.WEST);
				this.add(b, BorderLayout.EAST);

				//Add to Panel *********************************************************************
				window.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT - 300));
				window.add(panel1);
				window.add(panel2);
				window.add(panel3);
				window.add(stationList);
				window.add(compare);
				window.add(cal);
				window.add(distance);
				window.add(addStation);
							
				panel1.add(hammingDist);
				panel1.add(hammingDistNum);
				
				//dummies
				JSlider slider = new JSlider(1, 4);
				slider.setMinorTickSpacing(1);
				slider.setPaintTicks(true);
				slider.setPaintLabels(true);
				slider.getValue();
				panel2.add(slider);
				
				panel3.add(showStation, BorderLayout.WEST);
				showStation.setLayout(new FlowLayout(FlowLayout.LEFT));
				
				stationList.add(stationID);
				
				compare.add(compareW);
				
				cal.add(calHD);
				
				distance.add(dist0);
				distance.add(num0);
				distance.add(dist1);
				distance.add(num1);
				distance.add(dist2);
				distance.add(num2);
				distance.add(dist3);
				distance.add(num3);
				distance.add(dist4);
				distance.add(num4);
				
				addStation.add(addID);
				addStation.add(addStationID);
				addID.setLayout(new FlowLayout(FlowLayout.LEFT));
				addStationID.setLayout(new FlowLayout(FlowLayout.RIGHT));
				
				
							
				//Set ActionListeners on 3 buttons ****************************************************
				showStation.addActionListener( (e) -> {
					
				}
				);
				
				calHD.addActionListener( (e) -> {
					
					
				}
				);
				
				addID.addActionListener( (e) -> {
					stationIDList.add(stationID.getText());
				}
				);
				
				
				
				}
				
				
				
				
				
				
				
				
				//JTextFields ***********************************************************************
				
				
			}
		
			
		//DefaultComboBoxModel to make combo box for station list *****************************
		private DefaultComboBoxModel<String> getComboBoxModel(List<HammingDistance> list)
		{
			for (HammingDistance l : list){
				stationIDList.add(l.toString());
			}
			
			String[] comboBoxModel = stationIDList.toArray(new String[stationIDList.size()]);
			
		    return new DefaultComboBoxModel<>(comboBoxModel);
			
		}
		
		public HammingDistanceWindow() {
			super();
			this.setVisible(true);
			this.setSize(500, 700);
			this.setLayout(new GridLayout(1,2));
			HammingDistPanel a = new HammingDistPanel();
			this.add(a);
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new HammingDistanceWindow();
			

		}

}
