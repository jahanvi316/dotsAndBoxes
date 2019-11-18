package DotsAndBoxes;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Player {
	public static int playerPoints = 0;
	public static int computerPoints = 0;
	public static boolean lastMove = false; //player went last = true; AI went last = false
	public List<Integer> boxesNotDrawn = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	

public void addPoint(int boxNum) {
	//int goalLength = boxesNotDrawn.size() - 1;
	//while(boxesNotDrawn.size() != goalLength) {
		//if(boxesNotDrawn.contains(boxNum)) {
	for (int i=0; i < boxesNotDrawn.size(); i++) {
		if (boxesNotDrawn.get(i) == boxNum) {
			if(lastMove) {			     //if player went last
				playerPoints++;    		 //add points to player score
			}
			else {
				computerPoints++;  		 //if computer went last, add points to computer score
			} 
//			int indexBoxNum = boxesNotDrawn.indexOf(boxNum);
			boxesNotDrawn.remove(i);     //remove it from array because drawn
			
			i = boxesNotDrawn.size();
		}
	}
				
		//}
		
	//}
}

public void move() {
	if (lastMove) { //if player went last, AI's turn
		System.out.println("AI's turn"); // test
		AILogic AItest = new AILogic();
		Board.endGame();
	}
}

}