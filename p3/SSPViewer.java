package p3;
import javax.swing.*;
import java.awt.*; 

/*
 * Class for the window showing the score and choices. 
 */
public class SSPViewer extends JPanel{
	//declares private variables
	private JPanel panel = new JPanel(new GridLayout(3,2));
	private JLabel info = new JLabel("Först till 3 vinner!");
	private JLabel usr = new JLabel("Human");
	private JLabel npc = new JLabel("Computer");
	private JLabel scrUsr = new JLabel("0");
	private JLabel scrNpc = new JLabel("0");
	private JLabel choiceUsr = new JLabel();
	private JLabel choiceNpc = new JLabel();

	//Constructor that creates a window showing current score and choice.
	public SSPViewer() {
		setLayout(new BorderLayout() );
		setPreferredSize(new Dimension(250, 200));
		
		//uses center() method to center all text in the cell
		center();
		
		//add all the JLabels to the GridLayout
		panel.add(usr);
		panel.add(npc);
		panel.add(scrUsr);
		panel.add(scrNpc);
		panel.add(choiceUsr);
		panel.add(choiceNpc);
		
		//add info JLabel and Grid Layout to the Border Layout
		add(info, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);

	}
	
	//Method that is used to center text in all JLabel
	public void center() {
		info.setHorizontalAlignment(SwingConstants.CENTER);
		info.setVerticalAlignment(SwingConstants.CENTER);
		usr.setHorizontalAlignment(SwingConstants.CENTER);
		usr.setVerticalAlignment(SwingConstants.CENTER);
		npc.setHorizontalAlignment(SwingConstants.CENTER);
		npc.setVerticalAlignment(SwingConstants.CENTER);
		scrUsr.setHorizontalAlignment(SwingConstants.CENTER);
		scrUsr.setVerticalAlignment(SwingConstants.CENTER);
		scrNpc.setHorizontalAlignment(SwingConstants.CENTER);
		scrNpc.setVerticalAlignment(SwingConstants.CENTER);
		choiceUsr.setHorizontalAlignment(SwingConstants.CENTER);
		choiceUsr.setVerticalAlignment(SwingConstants.CENTER);
		choiceNpc.setHorizontalAlignment(SwingConstants.CENTER);
		choiceNpc.setVerticalAlignment(SwingConstants.CENTER);
	}
	
	//Takes 2 Strings and updates labels for showing user choice and computer choice
	public void setChoiceUsr(String choice, String cpu) {
		this.choiceUsr.setText(choice);
		this.choiceNpc.setText(cpu);
	}
	
	//Takes 2 ints and updates labels showing current score 
	public void setScore(int uScore, int cScore) {
		String uRes = "" + uScore;
		String cRes = "" + cScore;
		this.scrUsr.setText(uRes);
		this.scrNpc.setText(cRes);
	}

	//Takes a String and uptdates the info label
	public void setInfo(String info) {
		this.info.setText(info);
	}
}