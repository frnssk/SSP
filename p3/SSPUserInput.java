package p3;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

/*
 * Class for user input. Creates the buttons and sends input to controller class
 */
public class SSPUserInput extends JPanel implements ActionListener {
	private JPanel panel1 = new JPanel(new GridLayout(1,3));
	private JPanel panel2 = new JPanel(new GridLayout(1,1));
	private SSPController controller;
	//Creates buttons
	private JButton btnRock = new JButton("Sten");
	private JButton btnScissor = new JButton("Sax");
	private JButton btnBag = new JButton("Påse");
	private JButton btnNewGame = new JButton("Nytt spel");
	private JButton btnExit = new JButton("Avsluta");
	
	//Constructor for the UserInput class
	public SSPUserInput(SSPController controller) { 
		this.controller = controller;
		this.controller.setUserInput( this );

		//Activates the buttons by calling the button method
		Buttons();
	}

	//Creates the layout for the buttons
	private void Buttons() {
		setLayout(new BorderLayout() );
		setPreferredSize(new Dimension(250,200));
		
		panel1.setPreferredSize(new Dimension(0, 40));
		btnExit.setPreferredSize(new Dimension(0, 40));
		panel1.add(btnRock);
		panel1.add(btnScissor);
		panel1.add(btnBag);
		
		panel2.add(btnNewGame);
		
		add(btnExit, BorderLayout.SOUTH);
		add(panel2, BorderLayout.CENTER);
		add(panel1, BorderLayout.NORTH);
		
		btnRock.addActionListener(this);
		btnScissor.addActionListener(this);
		btnBag.addActionListener(this);
		btnNewGame.addActionListener(this);
		btnExit.addActionListener(this);
	}
	
	//Connects the buttons to the function
	public void actionPerformed(ActionEvent e) {
		String choice ="";
		if(e.getSource() == btnRock) {
			//Add the value "Sten" to the string "choice"
			choice += "Sten";
			controller.ChoiceUsr(choice);
		} else if (e.getSource() == btnScissor) {
			//Add the value "Sax" to the string "choice"
			choice += "Sax";
			controller.ChoiceUsr(choice);
		} else if (e.getSource() == btnBag) {
			//Add the value "Påse" to the string "choice"
			choice += "Påse";
			controller.ChoiceUsr(choice);
		} else if (e.getSource() == btnNewGame) {
			//Calls the method New Game if buttons New Game is pressed
			controller.newGame();
		} else if(e.getSource() == btnExit) {
			//Exits the game
			System.exit(0);
		}
	}
	
	//Used to set buttons true or false
	public void setButtons(boolean stop) {
		this.btnRock.setEnabled(stop);
		this.btnScissor.setEnabled(stop);
		this.btnBag.setEnabled(stop);
	}
	
}

