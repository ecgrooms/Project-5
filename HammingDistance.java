import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HammingDistance {
	
	private String station1;
	private String station2;
	
	ArrayList<String> stid = new ArrayList<String>();
	
	public HammingDistance(String name1, String name2) throws IOException {
		
		read("Mesonet.txt");
		
		station1 = name1;
		station2 = name2;
		
		toString();
	}

	public void read(String filename) throws IOException
    {
		
    	// Use a buffered Reader on the file:
		filename = "Mesonet.txt";
    	BufferedReader br = new BufferedReader(new FileReader(filename));
        String letters;
        letters = br.readLine();
        letters = br.readLine();
        letters = br.readLine();
        
        while(letters != null) {
			
        	String words = letters.substring(1, 5);
			letters = br.readLine();
			stid.add(words);
			
		}
        
        br.close();
        
    }
	
	// calculate the nodes between two selected STID
	public int calculate2STIDNodes(String stid1, String stid2){
		
		int nodes = 0;
		for(int i = 0; i < 4; i++) {
				
			if( stid1.charAt(i) != stid2.charAt(i) ) {
				nodes++;
			}
			
		}
		
		return nodes;
		
	}
	
	
	
	//calculate all STID nodes
	int[] results;
	
	public int[] calculateAllSTIDNodes(String city) {
		
		int dist1 = 0;
		int dist2 = 0;
		int dist3 = 0;
		int dist4 = 0;
		
		for(int i = 0; i < stid.size(); i++) {
			
			if(calculate2STIDNodes(stid.get(i), city) == 1) {
				dist1++;
			}
			else if(calculate2STIDNodes(stid.get(i), city) == 2) {
				dist2++;
			}
			else if(calculate2STIDNodes(stid.get(i), city) == 3) {
				dist3++;
			}
			else if(calculate2STIDNodes(stid.get(i), city) == 4) {
				dist4++;
			}
					
			
		}
		
		dist4 = dist4 - 1;
		results = new int[] {dist1, dist2, dist3, dist4};
		
		return results;
	}

}
