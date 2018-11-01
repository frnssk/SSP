package p3;
import java.util.Random;

/*
 * Class for creating an NPC player. Sends the NPC player choice to the controller. 
 */
public class SSPPlayer {
	//declares private variables
	private Random rand = new Random();
	private int nbr;

	//Creates a String with "Sten", "Sax" or "Påse", depending on a random number.
	public String newChoice () {
		nbr = rand.nextInt(3);
		String res="";
		switch(nbr){
			case 0:
				res = "Sten";
				break;
			case 1:
				res = "Sax";
				break;
			case 2:
				res = "Påse";
				break;
		}
		return res;
	}

}
