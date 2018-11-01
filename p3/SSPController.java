package p3;
import java.awt.Color;
import javax.swing.*;

/*
 * Controller class have all the info on the game. Makes the calculations and returns 
 * values to the viewer class to update the scoreboard.
 */
public class SSPController extends JPanel {
	private SSPPlayer npc = new SSPPlayer();
	private SSPViewer view = new SSPViewer();
	private SSPUserInput usrInput;
	private int usrScore, npcScore;

	//Constructor taking SSPPlayer and SSPViewer 
	public SSPController(SSPPlayer player, SSPViewer view) {
		this.npc = player;
		this.view = view;
	}
	
	//Method used to create an object of the User Class
	public void setUserInput(SSPUserInput userInput) {
		this.usrInput = userInput;
	}


	/*
	 * Takes a String and sends to viewer. 
	 * Gets an input from Player and uses the String and player input to start game
	 */
	public void ChoiceUsr(String choice) {
		String npcStr = npc.newChoice();
		this.view.setChoiceUsr(choice, npcStr);
		this.startGame(choice, npcStr);

	}

	/*
	 * The method runs the game. 
	 * Check that the user input and the Player is not the same.
	 * If not it checks who gets points depending on choice 
	 * Updates the JLabels with points and showing the winner when someone reaches 3 points
	 */
	public void startGame(String usr, String npc) {
		String rock = "Sten";
		String scissor = "Sax";
		String bag = "Påse";

		if(!usr.equals(npc)) {
			if(usr.equals(rock) && npc.equals(scissor)) {
				usrScore++;
			} else if (usr.equals(scissor) && npc.equals(bag)) {
				usrScore++;
			} else if (usr.equals(bag) && npc.equals(rock)) {
				usrScore++;
			} else {
				npcScore++;
			}
		}

		view.setScore(usrScore, npcScore);
		
		//Determines who wins and turns the buttons of  
		if(usrScore >= 3) {
			this.view.setInfo("Grattis! Du vann!");
			this.view.setBackground(Color.GREEN);
			this.usrInput.setButtons(false);
		} else if (npcScore >= 3) {
			this.view.setInfo("Tyvärr, datorn vann.");
			this.view.setBackground(Color.RED);
			this.usrInput.setButtons(false);
		}
	}

	// Sets scores to 0 and resets the info panel and activates buttons
	public void newGame() {
		usrScore = 0;
		npcScore = 0;
		this.view.setScore(usrScore, npcScore);
		this.usrInput.setButtons(true);
		this.view.setChoiceUsr("", "");
		this.view.setInfo("Först till 3 vinner!");
		this.view.setBackground(null); //changes background color to default 
	}

}
