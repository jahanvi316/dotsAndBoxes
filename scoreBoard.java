package DotsAndBoxes;

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class scoreBoard {
	public JFrame boardFrame = new JFrame();
	public JPanel board = new JPanel();
	public JLabel playerPoints = new JLabel();
	public JLabel AIPoints = new JLabel();
	public JLabel winner = new JLabel();
	public JButton okayButton = new JButton();
	
	
	
	public scoreBoard() {
		boardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		board.setBounds(0, 0, 300, 200);
		boardFrame.setSize(300, 200);
		playerPoints.setText("Player: " + Player.playerPoints);
		AIPoints.setText("Computer:" +Player.computerPoints);
		playerPoints.setHorizontalAlignment(JLabel.CENTER);
		AIPoints.setHorizontalAlignment(JLabel.CENTER);

		board.add(playerPoints);
		board.add(AIPoints);
		if(Player.playerPoints > Player.computerPoints) {
			winner.setText("You win!");
		}
		if(Player.playerPoints < Player.computerPoints) {
			winner.setText("You lose!");
		}
		board.add(winner);
		okayButton.setText("Ok");
		board.add(okayButton);
		okayButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				okayButton.setVisible(false);
		        System.exit(0);
			}
		});
		
		
		boardFrame.add(board);
		boardFrame.setVisible(true);
		
		
	}
	

}