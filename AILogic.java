package DotsAndBoxes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AILogic {
	ArrayList<Integer> linesNotDrawn = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24));
	ArrayList<Integer> threeSidesDrawn = new ArrayList<Integer>();
	ArrayList<Integer> twoSidesDrawn = new ArrayList<Integer>();
	ArrayList<Integer> oneSideDrawn = new ArrayList<Integer>();
	ArrayList<Integer> noSidesDrawn = new ArrayList<Integer>();
	
	public AILogic() {
		makeLinesNotDrawn();
		System.out.println("lines not drawn: " + linesNotDrawn);
		sidesDrawn(); //method to calculate number to sides drawn of each box to add to the appropriate array list
		drawLine(pickBox());
		//Player.lastMove = false;
	}
	
	public void makeLinesNotDrawn() {     //method to update linesNotDrawn, to remove once it has been drawn
	   for (int j = 0; j < Board.linesDrawn.size(); j++) {
	       for(int i = 0; i < linesNotDrawn.size(); i++) {
    		   if (linesNotDrawn.get(i) == Board.linesDrawn.get(j)) {
    			   linesNotDrawn.remove(i);
    		   }
    	   }
       }     
	}
	
	public void sidesDrawn() {
		/*call methods to initialize box#SidesDrawn variables <# as in box numbers from 1 to 9>*/
		Board.box1SidesDrawn = Board.box1numSides();
		Board.box2SidesDrawn = Board.box2numSides();
		Board.box3SidesDrawn = Board.box3numSides();
		Board.box4SidesDrawn = Board.box4numSides();
		Board.box5SidesDrawn = Board.box5numSides();
		Board.box6SidesDrawn = Board.box6numSides();
		Board.box7SidesDrawn = Board.box7numSides();
		Board.box8SidesDrawn = Board.box8numSides();
		Board.box9SidesDrawn = Board.box9numSides();
		
		/* classifying box 1 */
		if(Board.box1SidesDrawn == 0) {
			noSidesDrawn.add(1);
		}
		else {
			if(Board.box1SidesDrawn == 1) {
				oneSideDrawn.add(1);
			}
			else {
				if(Board.box1SidesDrawn == 2) {
					twoSidesDrawn.add(1);
				}
				else {
					if(Board.box1SidesDrawn == 3) {
						threeSidesDrawn.add(1);
					}
				}
			}
		}
		
		/* classifying box 2 */
		if(Board.box2SidesDrawn == 0) {
			noSidesDrawn.add(2);
		}
		else {
			if(Board.box2SidesDrawn == 1) {
				oneSideDrawn.add(2);
			}
			else {
				if(Board.box2SidesDrawn == 2) {
					twoSidesDrawn.add(2);
				}
				else {
					if(Board.box2SidesDrawn == 3) {
						threeSidesDrawn.add(2);
					}
				}
			}
		}
		
		
		/* classifying box 3 */
		if(Board.box3SidesDrawn == 0) {
			noSidesDrawn.add(3);
		}
		else {
			if(Board.box3SidesDrawn == 1) {
				oneSideDrawn.add(3);
			}
			else {
				if(Board.box3SidesDrawn == 2) {
					twoSidesDrawn.add(3);
				}
				else {
					if(Board.box3SidesDrawn == 3) {
						threeSidesDrawn.add(3);
					}
				}
			}
		}
		
		/* classifying box 4 */
		if(Board.box4SidesDrawn == 0) {
			noSidesDrawn.add(4);
		}
		else {
			if(Board.box4SidesDrawn == 1) {
				oneSideDrawn.add(4);
			}
			else {
				if(Board.box4SidesDrawn == 2) {
					twoSidesDrawn.add(4);
				}
				else {
					if(Board.box4SidesDrawn == 3) {
						threeSidesDrawn.add(4);
					}
				}
			}
		}
		
		/* classifying box 5 */
		if(Board.box5SidesDrawn == 0) {
			noSidesDrawn.add(5);
		}
		else {
			if(Board.box5SidesDrawn == 1) {
				oneSideDrawn.add(5);
			}
			else {
				if(Board.box5SidesDrawn == 2) {
					twoSidesDrawn.add(5);
				}
				else {
					if(Board.box5SidesDrawn == 3) {
						threeSidesDrawn.add(5);
					}
				}
			}
		}
		
		
		/* classifying box 6 */
		if(Board.box6SidesDrawn == 0) {
			noSidesDrawn.add(6);
		}
		else {
			if(Board.box6SidesDrawn == 1) {
				oneSideDrawn.add(6);
			}
			else {
				if(Board.box6SidesDrawn == 2) {
					twoSidesDrawn.add(6);
				}
				else {
					if(Board.box6SidesDrawn == 3) {
						threeSidesDrawn.add(6);
					}
				}
			}
		}
		
		/* classifying box 7 */
		if(Board.box7SidesDrawn == 0) {
			noSidesDrawn.add(7);
		}
		else {
			if(Board.box7SidesDrawn == 1) {
				oneSideDrawn.add(7);
			}
			else {
				if(Board.box7SidesDrawn == 2) {
					twoSidesDrawn.add(7);
				}
				else {
					if(Board.box7SidesDrawn == 3) {
						threeSidesDrawn.add(7);
					}
				}
			}
		}
		
		
		/* classifying box 8 */
		if(Board.box8SidesDrawn == 0) {
			noSidesDrawn.add(8);
		}
		else {
			if(Board.box8SidesDrawn == 1) {
				oneSideDrawn.add(8);
			}
			else {
				if(Board.box8SidesDrawn == 2) {
					twoSidesDrawn.add(8);
				}
				else {
					if(Board.box8SidesDrawn == 3) {
						threeSidesDrawn.add(8);
					}
				}
			}
		}
		
		
		/* classifying box 9 */
		if(Board.box9SidesDrawn == 0) {
			noSidesDrawn.add(9);
		}
		else {
			if(Board.box9SidesDrawn == 1) {
				oneSideDrawn.add(9);
			}
			else {
				if(Board.box9SidesDrawn == 2) {
					twoSidesDrawn.add(9);
				}
				else {
					if(Board.box9SidesDrawn == 3) {
						threeSidesDrawn.add(9);
					}
				}
			}
		}
	}
	
	public int pickBox() { //method to chose which box to draw in
		int randomBoxNum;
		if(threeSidesDrawn.size() > 0) { //if three sides done, draw those first
			randomBoxNum = (int)(Math.random() * threeSidesDrawn.size());  //randomly pick one of the boxes that have 3 sides
			randomBoxNum = threeSidesDrawn.get(randomBoxNum);
			System.out.println("The random box number is "+ randomBoxNum);
		}
		else {
			if(noSidesDrawn.size() > 0 && oneSideDrawn.size() > 0) { //if there are both 0 and 1 sided squares 
				//choose randomly to draw on a 0 sided square or 1 sided square; avoid 2 sided squares
				int coinFlip = (int)Math.round(Math.random()); // randomly chooses 0 or 1
				System.out.println("coin flip: " + coinFlip);
				if(coinFlip == 1) {
					randomBoxNum = (int)(Math.random() * oneSideDrawn.size());  //randomly pick one of the boxes that have 1 side
					randomBoxNum = oneSideDrawn.get(randomBoxNum);
					System.out.println("The random box number is "+ randomBoxNum);
				}
				else {
					randomBoxNum = (int)(Math.random() * noSidesDrawn.size());  //randomly pick one of the boxes that have no sides
					randomBoxNum = noSidesDrawn.get(randomBoxNum);
					System.out.println("The random box number is "+ randomBoxNum);
				}
			}
			else { 
				if (noSidesDrawn.size() > 0) { // if there are only no sided squares, not one sided squares
					randomBoxNum = (int)(Math.random() * noSidesDrawn.size());  //randomly pick one of the boxes that have no sides
					randomBoxNum = noSidesDrawn.get(randomBoxNum);
					System.out.println("The random box number is "+ randomBoxNum);
				}
				else {
					if(oneSideDrawn.size() > 0) { //if there are only one sided squares, not no sided squares
						randomBoxNum = (int)(Math.random() * oneSideDrawn.size());  //randomly pick one of the boxes that have 1 side
						randomBoxNum = oneSideDrawn.get(randomBoxNum);
						System.out.println("The random box number is "+ randomBoxNum);
					}
					else {
						//if there are no boxes with 0, 1, or 3 sides, draw a line of a 2 sided box
						randomBoxNum = (int)(Math.random() * twoSidesDrawn.size()); //randomly pick one of the boxes that have 2 sides
						randomBoxNum = twoSidesDrawn.get(randomBoxNum);
						System.out.println("The random box number is "+ randomBoxNum);
					}
				}
			}
		}
		return randomBoxNum;
		
	}
	
	public void drawLine(int boxNum) {
		ArrayList<Integer> lineChoices = new ArrayList<Integer>();
		/* using the box number, add the lines not draw that are in the box to the available choices */
		if(boxNum == 1) {
			for(int i = 0; i < linesNotDrawn.size(); i++) {
				if(linesNotDrawn.get(i) == 1 || linesNotDrawn.get(i) == 13 || linesNotDrawn.get(i) ==  14 || linesNotDrawn.get(i) == 4) {
					lineChoices.add(linesNotDrawn.get(i));
				}
			}
		}
		else {
			if(boxNum == 2) {
				for(int i = 0; i < linesNotDrawn.size(); i++) {
					if(linesNotDrawn.get(i) == 2 || linesNotDrawn.get(i) == 14 || linesNotDrawn.get(i) ==  15 || linesNotDrawn.get(i) == 5) {
						lineChoices.add(linesNotDrawn.get(i));
					}
				}
			}
			else {
				if(boxNum == 3) {
					for(int i = 0; i < linesNotDrawn.size(); i++) {
						if(linesNotDrawn.get(i) == 3 || linesNotDrawn.get(i) == 15 || linesNotDrawn.get(i) ==  16 || linesNotDrawn.get(i) == 6) {
							lineChoices.add(linesNotDrawn.get(i));
						}
					}
				}
				else {
					if(boxNum == 4) {
						for(int i = 0; i < linesNotDrawn.size(); i++) {
							if(linesNotDrawn.get(i) == 4 || linesNotDrawn.get(i) == 17 || linesNotDrawn.get(i) ==  18 || linesNotDrawn.get(i) == 7) {
								lineChoices.add(linesNotDrawn.get(i));
							}
						}
					}
					else {
						if(boxNum == 5) {
							for(int i = 0; i < linesNotDrawn.size(); i++) {
								if(linesNotDrawn.get(i) == 5 || linesNotDrawn.get(i) == 18 || linesNotDrawn.get(i) ==  19 || linesNotDrawn.get(i) == 8) {
									lineChoices.add(linesNotDrawn.get(i));
								}
							}
						}
						else {
							if(boxNum == 6) {
								for(int i = 0; i < linesNotDrawn.size(); i++) {
									if(linesNotDrawn.get(i) == 6 || linesNotDrawn.get(i) == 19 || linesNotDrawn.get(i) ==  20 || linesNotDrawn.get(i) == 9) {
										lineChoices.add(linesNotDrawn.get(i));
									}
								}
							}
							else {
								if(boxNum == 7) {
									for(int i = 0; i < linesNotDrawn.size(); i++) {
										if(linesNotDrawn.get(i) == 7 || linesNotDrawn.get(i) == 21 || linesNotDrawn.get(i) ==  22 || linesNotDrawn.get(i) == 10) {
											lineChoices.add(linesNotDrawn.get(i));
										}
									}
								}
								else {
									if(boxNum == 8) {
										for(int i = 0; i < linesNotDrawn.size(); i++) {
											if(linesNotDrawn.get(i) == 8 || linesNotDrawn.get(i) == 22 || linesNotDrawn.get(i) ==  23 || linesNotDrawn.get(i) == 11) {
												lineChoices.add(linesNotDrawn.get(i));
											}
										}
									}
									else {
										if(boxNum == 9) {
											for(int i = 0; i < linesNotDrawn.size(); i++) {
												if(linesNotDrawn.get(i) == 9 || linesNotDrawn.get(i) == 23 || linesNotDrawn.get(i) ==  24 || linesNotDrawn.get(i) == 12) {
													lineChoices.add(linesNotDrawn.get(i));
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		int lineChoicesSize = lineChoices.size();
		int randomChoice = (int) (Math.random() * lineChoicesSize);
		int finalChoice = lineChoices.get(randomChoice);
		System.out.println("final choice: " + finalChoice);
		int xStart = Board.xStart(finalChoice);
		int yStart = Board.yStart(finalChoice);
		int xEnd = Board.xEnd(finalChoice);
		int yEnd = Board.yEnd(finalChoice);
		Board.AIDraw(xStart, yStart, xEnd, yEnd);
		Board.linesDrawn.add(finalChoice);
		//Board.endGame();
		Player.lastMove = false;
	}

	

	
}
