package DotsAndBoxes;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class scoreBoard {
	public JFrame boardFrame = new JFrame();
	public JPanel board = new JPanel();
	public JButton okayButton = new JButton();
	
	
	public scoreBoard() {
		boardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		board.setBounds(0, 0, 300, 200);
		boardFrame.setSize(300, 200);
		okayButton.setText("Ok");
		board.add(okayButton);
		
		boardFrame.add(board);
		boardFrame.setVisible(true);
	}
}
