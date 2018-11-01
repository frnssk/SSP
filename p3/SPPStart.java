package p3;

import javax.swing.JFrame;

/**
 * The class to start the game Rock, Paper Scissors
 * This is where the main method is. 
 * @author fransisakeklund
 *
 */
public class SPPStart {
	//Main method for running the application
	public static void main( String[] args ) {
		SSPPlayer player = new SSPPlayer();
		SSPViewer viewer = new SSPViewer();
		SSPController controller = new SSPController(player, viewer); 
		SSPUserInput userInput = new SSPUserInput(controller);
		JFrame frame1 = new JFrame( "SSPViewer" ); 
		frame1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
		frame1.add( viewer );
		frame1.pack();
		frame1.setVisible( true );
		JFrame frame2 = new JFrame( "SSPUserInput" ); 
		frame2.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
		frame2.add( userInput );
		frame2.pack();
		frame2.setLocation(frame1.getX(), frame1.getWidth());
		frame2.setVisible( true ); 
	}

}
