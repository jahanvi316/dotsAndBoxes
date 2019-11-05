package DotsAndBoxes;

import java.util.ArrayList;
import java.util.Arrays;

public class Player {
	public int playerPoints = 0;
	public int computerPoints = 0;
	public boolean lastMove = false; //player went last = true; AI went last = false
	public ArrayList<Integer> boxesNotDrawn = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	

public void addPoint(int boxNum) {
	while(boxesNotDrawn.size() != 0) {
		for (int i = 0; i < boxesNotDrawn.size(); i++) {
		if (boxesNotDrawn.get(i) == boxNum) {
			if(!lastMove) {			     //if player went last
				playerPoints++;    		 //add points to player score
			}
			else {
				computerPoints++;  		 //if computer went last, add points to computer score
			} 
			boxesNotDrawn.remove(i);     //remove it from array because drawn
		}
		}
	}
	System.out.println("Player: " + playerPoints);
	System.out.println("Computer: " + computerPoints);
}

public void move() {
	if (lastMove) { //if player went last, AI's turn
		System.out.println("AI's turn"); // test
		lastMove = false;
	}
}

}