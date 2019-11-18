package DotsAndBoxes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JPanel implements MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static ArrayList<Integer> linesDrawn = new ArrayList<Integer>();
	public static int box1SidesDrawn = 0;
	public static int box2SidesDrawn = 0;
	public static int box3SidesDrawn = 0;
	public static int box4SidesDrawn = 0;
	public static int box5SidesDrawn = 0;
	public static int box6SidesDrawn = 0;
	public static int box7SidesDrawn = 0;
	public static int box8SidesDrawn = 0;
	public static int box9SidesDrawn = 0;
	public static int totalBoxesDrawn = 0;
	public static boolean box1Checked = false;
	public static boolean box2Checked = false;
	public static boolean box3Checked = false;
	public static boolean box4Checked = false;
	public static boolean box5Checked = false;
	public static boolean box6Checked = false;
	public static boolean box7Checked = false;
	public static boolean box8Checked = false;
	public static boolean box9Checked = false;
	static Player testPlayer = new Player();
	
	JFrame frame = new JFrame();
	
	/*frame.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent windowEvent){
           System.exit(0);
        }
     )); */
	
	
	
	  public static JPanel board = new JPanel(new GridLayout()) {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g) {

			// g.drawLine(x1, y1, x2, y2);
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(5));
			g2.setColor(Color.GRAY);



			// box 1
			g2.drawLine(50, 50, 50, 150);
			g2.drawLine(50, 50, 150, 50);
			g2.drawLine(150, 50, 150, 150);
			g2.drawLine(150, 150, 50, 150);

			// box 2
			g2.drawLine(150, 50, 250, 50);
			g2.drawLine(250, 50, 250, 150);
			g2.drawLine(150, 50, 150, 150); // repeat
			g2.drawLine(150, 150, 250, 150);

			// box 3
			g2.drawLine(250, 50, 350, 50);
			g2.drawLine(350, 50, 350, 150);
			g2.drawLine(250, 150, 350, 150);
			g2.drawLine(250, 50, 250, 150); // repeat

			// box 4
			g2.drawLine(50, 150, 150, 150); // repeat
			g2.drawLine(50, 150, 50, 250);
			g2.drawLine(150, 150, 150, 250);
			g2.drawLine(50, 250, 150, 250);

			// box 5
			g2.drawLine(150, 150, 150, 250); // repeat
			g2.drawLine(150, 150, 250, 150); // repeat
			g2.drawLine(150, 250, 250, 250);
			g2.drawLine(250, 150, 250, 250);

			// box 6
			g2.drawLine(250, 150, 350, 150); // repeat
			g2.drawLine(250, 150, 250, 250); // repeat
			g2.drawLine(350, 150, 350, 250); // repeat
			g2.drawLine(250, 250, 350, 250);

			// box 7
			g2.drawLine(50, 250, 150, 250); // repeat
			g2.drawLine(50, 250, 50, 350);
			g2.drawLine(50, 350, 150, 350);
			g2.drawLine(150, 250, 150, 350);

			// box 8
			g2.drawLine(150, 250, 250, 250); // repeat
			g2.drawLine(150, 250, 150, 350); // repeat
			g2.drawLine(250, 250, 250, 350);
			g2.drawLine(150, 350, 250, 350);

			// box 9
			g2.drawLine(250, 250, 350, 250); // repeat
			g2.drawLine(250, 250, 250, 350); // repeat
			g2.drawLine(350, 250, 350, 350);
			g2.drawLine(250, 350, 350, 350);
			

			
		};
	};
	

	public class MouseEventListener extends JPanel implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if(!testPlayer.lastMove) {
				int x = e.getX();
				int y = e.getY();
				try {
					line(x, y, Color.BLUE);
				} catch (InterruptedException e1) {
	//				JDialog message = new JDialog(message, "Error");
	//		    	message.add("This is not a valid line. Sorry, try again.", message);
	//		    	message.setVisible(true);
	
	//				JOptionPane.showMessageDialog(frame,
	//		    		    "This is not a valid line. Sorry, try again.",
	//		    		    "Error",
	//		    		    JOptionPane.ERROR_MESSAGE);
				
				}
			  }
			
			}
			
		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		public void mouseHover(MouseEvent e) {
			// int x = e.getX();
			// int y = e.getY();
			// Line(x, y, Color.BLACK);
		}
	}

	public Board() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		board.setBounds(0, 0, 500, 500);
		final MouseEventListener clicky = new MouseEventListener();
		board.addMouseListener(clicky);
		frame.setSize(500, 500);

		frame.add(board);
		frame.setVisible(true);
	}

	public void line(int x, int y, Color lineColor) throws InterruptedException {
		int xStart = 0;
		int xEnd = 0;
		int yStart = 0;
		int yEnd = 0;

		if ((x >= 45 && x <= 55) || (x >= 145 && x <= 155) || (x >= 245 && x <= 255) || (x >= 345 && x <= 355)) {
			xStart = x / 100;
			xStart *= 100;
			xStart += 50;
			xEnd = xStart;

			/* y value */
			if (y > 50 && y < 150) {
				yStart = 50;
				yEnd = 150;
			} else {
				if (y > 150 && y < 250) {
					yStart = 150;
					yEnd = 250;
				} else {
					if (y > 250 && y < 350) {
						yStart = 250;
						yEnd = 350;
					}
				}
			}
		} else {
			if ((y >= 45 && y <= 55) || (y >= 145 && y <= 155) || (y >= 245 && y <= 255) || (y >= 345 && y <= 355)) {
				yStart = y / 100;
				yStart *= 100;
				yStart += 50;
				yEnd = yStart;
			}

			/* x value */
			if (x > 50 && x < 150) {
				xStart = 50;
				xEnd = 150;
			} else {
				if (x > 150 && x < 250) {
					xStart = 150;
					xEnd = 250;
				} else {
					if (x > 250 && x < 350) {
						xStart = 250;
						xEnd = 350;
					}
				}
			}
		}
		if (xStart == 0 || xEnd == 0 || yStart == 0 || yEnd == 0) {
			JOptionPane.showMessageDialog(frame, "This is not a valid line. Sorry, try again.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

		else {
			Graphics2D g = (Graphics2D) board.getGraphics();
			g.setStroke(new BasicStroke(5));
			g.setColor(lineColor);
			int lineNum = lineNumber(xStart, yStart, xEnd, yEnd);
			if (!linesDrawn.contains(lineNum)) {  //if line is not already in the list, add lineNum
				g.drawLine(xStart, yStart, xEnd, yEnd); 
				linesDrawn.add(lineNum);	
				testPlayer.lastMove = true;
				testPlayer.move();
				endGame();
			}
			else {
				JOptionPane.showMessageDialog(frame, "This is already a line.", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
			System.out.println("ArrayList : " + linesDrawn);
			System.out.println("end game? " + endGame());
			System.out.println("Player: " + Player.playerPoints);
			System.out.println("Computer: " + Player.computerPoints);
			//endGame();
			
		}
	}
	
	public static void AIDraw(int xStart, int yStart, int xEnd, int yEnd) {
		Graphics2D g = (Graphics2D) board.getGraphics();
		g.setStroke(new BasicStroke(5));
		g.setColor(Color.red);
		g.drawLine(xStart, yStart, xEnd, yEnd);
	}

	public int lineNumber(int xStart, int yStart, int xEnd, int yEnd) {          //method to label all the lines possible
		if (xStart == 50 && yStart == 50) {
			if (xEnd == 150 && yEnd == 50) {
				return 1;
			} else {
				if (xEnd == 50 && yEnd == 150) {
					return 13;
				} else {
					return -1;
				}
			}
		} else {
			if (xStart == 150 && yStart == 50) {
				if (xEnd == 250 && yEnd == 50) {
					return 2;
				} else {
					if (xEnd == 150 && yEnd == 150) {
						return 14;
					} else {
						return -1;
					}
				}
			} else {
				if (xStart == 250 && yStart == 50) {
					if (xEnd == 350 && yEnd == 50) {
						return 3;
					} else {
						if (xEnd == 250 && yEnd == 150) {
							return 15;
						} else {
							return -1;
						}
					}
				} else {
					if (xStart == 50 && yStart == 150) {
						if (xEnd == 150 && yEnd == 150) {
							return 4;
						} else {
							if (xEnd == 50 && yEnd == 250) {
								return 17;
							} else {
								return -1;
							}
						}
					} else {
						if (xStart == 150 && yStart == 150) {
							if (xEnd == 250 && yEnd == 150) {
								return 5;
							} else {
								if (xEnd == 150 && yEnd == 250) {
									return 18;
								} else {
									return -1;
								}
							}
						} else {
							if (xStart == 250 && yStart == 150) {
								if (xEnd == 350 && yEnd == 150) {
									return 6;
								} else {
									if (xEnd == 250 && yEnd == 250) {
										return 19;
									} else {
										return -1;
									}
								}
							} else {
								if (xStart == 50 && yStart == 250) {
									if (xEnd == 150 && yEnd == 250) {
										return 7;
									} else {
										if (xEnd == 50 && yEnd == 350) {
											return 21;
										} else {
											return -1;
										}
									}
								} else {
									if (xStart == 150 && yStart == 250) {
										if (xEnd == 250 && yEnd == 250) {
											return 8;
										} else {
											if (xEnd == 150 && yEnd == 350) {
												return 22;
											} else {
												return -1;
											}
										}
									} else {
										if (xStart == 250 && yStart == 250) {
											if (xEnd == 350 && yEnd == 250) {
												return 9;
											} else {
												if (xEnd == 250 && yEnd == 350) {
													return 23;
												} else {
													return -1;
												}
											}
										} else {
											if (xStart == 350 && xEnd == 350) {
												if (yStart == 50) {
													if (yEnd == 150) {
														return 16;
													} else {
														return -1;
													}
												} else {
													if (yStart == 150) {
														if (yEnd == 250) {
															return 20;
														} else {
															return -1;
														}
													} else {
														if (yStart == 250) {
															if (yEnd == 350) {
																return 24;
															} else {
																return -1;
															}
														} else {
															return -1;
														}
													}
												}
											} else {
												if (yStart == 350 && yEnd == 350) {
													if(xStart == 50) {
														if (xEnd == 150) {
															return 10;
														}
														else {
															return -1;
														}
													}
													else {
														if(xStart == 150) {
															if (xEnd == 250) {
																return 11;
															}
															else {
																return -1;
															}
														}
														else {
															if(xStart == 250) {
																if (xEnd == 350) {
																	return 12;
																}
																else {
																	return -1;
																}
															}
														}
													}
												}
												else {
													return -1;
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
		return -1;
	}

	public static int xStart(int lineNum) {				//method that returns the xStart coordinate via the line number
		if(lineNum == 1 || lineNum == 4 || lineNum == 7 || lineNum == 10 || lineNum == 13 || lineNum == 17 || lineNum == 21) {
			return 50;
		}
		else {
			if(lineNum == 2 || lineNum == 5 || lineNum == 8 || lineNum == 11 || lineNum == 14 || lineNum == 18 || lineNum == 22) {
				return 150;
			}
			else {
				if(lineNum == 3 || lineNum == 6 || lineNum == 9 || lineNum == 12 || lineNum == 15 || lineNum == 19 || lineNum == 23) {
					return 250;
				}
				else {
					if(lineNum == 16 || lineNum == 20 || lineNum == 24) {
						return 350;
					}
					else {
						return -1;
					}
				}
			}
		}
	}

	public static int yStart(int lineNum) {				//method that returns the yStart coordinate via the line number
		if(lineNum == 1 || lineNum == 2 || lineNum == 3 || lineNum == 13 || lineNum == 14 || lineNum == 15 || lineNum == 16) {
			return 50;
		}
		else {
			if(lineNum == 4 || lineNum == 5 || lineNum == 6 || lineNum == 17 || lineNum == 18 || lineNum == 19 || lineNum == 20) {
				return 150;
			}
			else {
				if(lineNum == 7 || lineNum == 8 || lineNum == 9 || lineNum == 21 || lineNum == 22 || lineNum == 23 || lineNum == 24) {
					return 250;
				}
				else {
					if(lineNum == 10 || lineNum == 11 || lineNum == 12) {
						return 350;
					}
					else {
						return -1;
					}
				}
			}
		}
	}

	public static int xEnd(int lineNum) {				//method that returns the xEnd coordinate via the line number
		if(lineNum == 13 || lineNum == 17 || lineNum == 21) {
			return 50;
		}
		else {
			if(lineNum == 1 || lineNum == 4 || lineNum == 7 || lineNum == 10 || lineNum == 14 || lineNum == 18 || lineNum == 22) {
				return 150;
			}
			else {
				if(lineNum == 2 || lineNum == 5 || lineNum == 8 || lineNum == 11 || lineNum == 15 || lineNum == 19 || lineNum == 23) {
					return 250;
				}
				else {
					if(lineNum == 3|| lineNum == 6 || lineNum == 9 || lineNum == 12 || lineNum == 16 || lineNum == 20 || lineNum == 24) {
						return 350;
					}
					else {
						return -1;
					}
				}
			}
		}
	}

	public static int yEnd(int lineNum) {				//method that returns the yEnd coordinate via the line number
		if(lineNum == 1 || lineNum == 2 || lineNum == 3) {
			return 50;
		}
		else {
			if(lineNum == 4 || lineNum == 5 || lineNum == 6 || lineNum == 13 || lineNum == 14 || lineNum == 15 || lineNum == 16) {
				return 150;
			}
			else {
				if(lineNum == 7 || lineNum == 8 || lineNum == 9 || lineNum == 17 || lineNum == 18 || lineNum == 19 || lineNum == 20) {
					return 250;
				}
				else {
					if(lineNum == 10 || lineNum == 11 || lineNum == 12 || lineNum == 21 || lineNum == 22 || lineNum == 23 || lineNum == 24) {
						return 350;
					}
					else {
						return -1;
					}
				}
			}
		}
	}
	
	public static boolean box1Drawn() { 					//Sides 1, 13, 14, 4
		Boolean a = false;
		Boolean b = false;
		Boolean c = false;
		Boolean d = false;
		for (int i = 0; i < linesDrawn.size(); i++) {
			if (linesDrawn.get(i) == 1) {
				a = true;
			}
			if (linesDrawn.get(i) == 13) {
				b = true;
			}
			if (linesDrawn.get(i) == 14) {
				c = true;
			}
			if (linesDrawn.get(i) == 4) {
				d = true;
			}
		}
		if (a && b && c && d) {
			testPlayer.addPoint(1);
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean box2Drawn() { 					//Sides 2, 14, 15, 5
		Boolean a = false;
		Boolean b = false;
		Boolean c = false;
		Boolean d = false;
		for (int i = 0; i < linesDrawn.size(); i++) {
			if (linesDrawn.get(i) == 2) {
				a = true;
			}
			if (linesDrawn.get(i) == 15) {
				b = true;
			}
			if (linesDrawn.get(i) == 14) {
				c = true;
			}
			if (linesDrawn.get(i) == 5) {
				d = true;
			}
		}
		if (a && b && c && d) {
			testPlayer.addPoint(2);
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean box3Drawn() { 					//Sides 3, 15, 16, 6
		Boolean a = false;
		Boolean b = false;
		Boolean c = false;
		Boolean d = false;
		for (int i = 0; i < linesDrawn.size(); i++) {
			if (linesDrawn.get(i) == 3) {
				a = true;
			}
			if (linesDrawn.get(i) == 15) {
				b = true;
			}
			if (linesDrawn.get(i) == 16) {
				c = true;
			}
			if (linesDrawn.get(i) == 6) {
				d = true;
			}
		}
		if (a && b && c && d) {
			testPlayer.addPoint(3);
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean box4Drawn() { 					//Sides 4, 17, 18, 7
		Boolean a = false;
		Boolean b = false;
		Boolean c = false;
		Boolean d = false;
		for (int i = 0; i < linesDrawn.size(); i++) {
			if (linesDrawn.get(i) == 17) {
				a = true;
			}
			if (linesDrawn.get(i) == 18) {
				b = true;
			}
			if (linesDrawn.get(i) == 7) {
				c = true;
			}
			if (linesDrawn.get(i) == 4) {
				d = true;
			}
		}
		if (a && b && c && d) {
			testPlayer.addPoint(4);
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean box5Drawn() { 					//Sides 5, 18, 19, 8
		Boolean a = false;
		Boolean b = false;
		Boolean c = false;
		Boolean d = false;
		for (int i = 0; i < linesDrawn.size(); i++) {
			if (linesDrawn.get(i) == 5) {
				a = true;
			}
			if (linesDrawn.get(i) == 18) {
				b = true;
			}
			if (linesDrawn.get(i) == 19) {
				c = true;
			}
			if (linesDrawn.get(i) == 8) {
				d = true;
			}
		}
		if (a && b && c && d) {
			testPlayer.addPoint(5);
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean box6Drawn() { 					//Sides 6, 19, 20, 9
		Boolean a = false;
		Boolean b = false;
		Boolean c = false;
		Boolean d = false;
		for (int i = 0; i < linesDrawn.size(); i++) {
			if (linesDrawn.get(i) == 6) {
				a = true;
			}
			if (linesDrawn.get(i) == 19) {
				b = true;
			}
			if (linesDrawn.get(i) == 20) {
				c = true;
			}
			if (linesDrawn.get(i) == 9) {
				d = true;
			}
		}
		if (a && b && c && d) {
			testPlayer.addPoint(6);
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean box7Drawn() { 					//Sides 7, 21, 22, 10
		Boolean a = false;
		Boolean b = false;
		Boolean c = false;
		Boolean d = false;
		for (int i = 0; i < linesDrawn.size(); i++) {
			if (linesDrawn.get(i) == 7) {
				a = true;
			}
			if (linesDrawn.get(i) == 21) {
				b = true;
			}
			if (linesDrawn.get(i) == 22) {
				c = true;
			}
			if (linesDrawn.get(i) == 10) {
				d = true;
			}
		}
		if (a && b && c && d) {
			testPlayer.addPoint(7);
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean box8Drawn() { 					//Sides 8, 22, 23, 11
		Boolean a = false;
		Boolean b = false;
		Boolean c = false;
		Boolean d = false;
		for (int i = 0; i < linesDrawn.size(); i++) {
			if (linesDrawn.get(i) == 8) {
				a = true;
			}
			if (linesDrawn.get(i) == 22) {
				b = true;
			}
			if (linesDrawn.get(i) == 23) {
				c = true;
			}
			if (linesDrawn.get(i) == 11) {
				d = true;
			}
		}
		if (a && b && c && d) {
			testPlayer.addPoint(8);
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean box9Drawn() { 					//Sides 9, 23, 24, 12
		Boolean a = false;
		Boolean b = false;
		Boolean c = false;
		Boolean d = false;
		for (int i = 0; i < linesDrawn.size(); i++) {
			if (linesDrawn.get(i) == 9) {
				a = true;
			}
			if (linesDrawn.get(i) == 23) {
				b = true;
			}
			if (linesDrawn.get(i) == 24) {
				c = true;
			}
			if (linesDrawn.get(i) == 12) {
				d = true;
			}
		}
		if (a && b && c && d) {
			testPlayer.addPoint(9);
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int box1numSides() {				//Sides 1, 13, 14, 4
		box1SidesDrawn = 0;
		for (int i = 0; i < linesDrawn.size(); i++) {
			if (linesDrawn.get(i) == 1) {
				box1SidesDrawn++;
			}
			if (linesDrawn.get(i) == 13) {
				box1SidesDrawn++;
			}
			if (linesDrawn.get(i) == 14) {
				box1SidesDrawn++;
			}
			if (linesDrawn.get(i) == 4) {
				box1SidesDrawn++;
			}
		}
		return box1SidesDrawn;
	}
	
	public static int box2numSides() {				//Sides 2, 14, 15, 5
		box2SidesDrawn = 0;
		for (int i = 0; i < linesDrawn.size(); i++) {
			if (linesDrawn.get(i) == 2) {
				box2SidesDrawn++;
			}
			if (linesDrawn.get(i) == 14) {
				box2SidesDrawn++;
			}
			if (linesDrawn.get(i) == 15) {
				box2SidesDrawn++;
			}
			if (linesDrawn.get(i) == 5) {
				box2SidesDrawn++;
			}
		}
		return box2SidesDrawn;
	}
	
	public static int box3numSides() {				//Sides 3, 15, 16, 6
		box3SidesDrawn = 0;
		for (int i = 0; i < linesDrawn.size(); i++) {
			if (linesDrawn.get(i) == 3) {
				box3SidesDrawn++;
			}
			if (linesDrawn.get(i) == 15) {
				box3SidesDrawn++;
			}
			if (linesDrawn.get(i) == 16) {
				box3SidesDrawn++;
			}
			if (linesDrawn.get(i) == 6) {
				box3SidesDrawn++;
			}
		}
		return box3SidesDrawn;
	}
	
	public static int box4numSides() {				//Sides 4, 17, 18, 7
		box4SidesDrawn = 0;
		for (int i = 0; i < linesDrawn.size(); i++) {
			if (linesDrawn.get(i) == 4) {
				box4SidesDrawn++;
			}
			if (linesDrawn.get(i) == 17) {
				box4SidesDrawn++;
			}
			if (linesDrawn.get(i) == 18) {
				box4SidesDrawn++;
			}
			if (linesDrawn.get(i) == 7) {
				box4SidesDrawn++;
			}
		}
		return box4SidesDrawn;
	}
	
	public static int box5numSides() {				//Sides 5, 18, 19, 8
		box5SidesDrawn = 0;
		for (int i = 0; i < linesDrawn.size(); i++) {
			if (linesDrawn.get(i) == 5) {
				box5SidesDrawn++;
			}
			if (linesDrawn.get(i) == 18) {
				box5SidesDrawn++;
			}
			if (linesDrawn.get(i) == 19) {
				box5SidesDrawn++;
			}
			if (linesDrawn.get(i) == 8) {
				box5SidesDrawn++;
			}
		}
		return box5SidesDrawn;
	}
	
	public static int box6numSides() {				//Sides 6, 19, 20, 9
		box6SidesDrawn = 0;
		for (int i = 0; i < linesDrawn.size(); i++) {
			if (linesDrawn.get(i) == 6) {
				box6SidesDrawn++;
			}
			if (linesDrawn.get(i) == 19) {
				box6SidesDrawn++;
			}
			if (linesDrawn.get(i) == 20) {
				box6SidesDrawn++;
			}
			if (linesDrawn.get(i) == 9) {
				box6SidesDrawn++;
			}
		}
		return box6SidesDrawn;
	}
	
	public static int box7numSides() {				//Sides 7, 21, 22, 10
		box7SidesDrawn = 0;
		for (int i = 0; i < linesDrawn.size(); i++) {
			if (linesDrawn.get(i) == 7) {
				box7SidesDrawn++;
			}
			if (linesDrawn.get(i) == 21) {
				box7SidesDrawn++;
			}
			if (linesDrawn.get(i) == 22) {
				box7SidesDrawn++;
			}
			if (linesDrawn.get(i) == 10) {
				box7SidesDrawn++;
			}
		}
		return box7SidesDrawn;
	}
	
	public static int box8numSides() {				//Sides 8, 22, 23, 11
		box8SidesDrawn = 0;
		for (int i = 0; i < linesDrawn.size(); i++) {
			if (linesDrawn.get(i) == 8) {
				box8SidesDrawn++;
			}
			if (linesDrawn.get(i) == 22) {
				box8SidesDrawn++;
			}
			if (linesDrawn.get(i) == 23) {
				box8SidesDrawn++;
			}
			if (linesDrawn.get(i) == 11) {
				box8SidesDrawn++;
			}
		}
		return box8SidesDrawn;
	}
	
	public static int box9numSides() {				//Sides 9, 23, 24, 12
		box9SidesDrawn = 0;
		for (int i = 0; i < linesDrawn.size(); i++) {
			if (linesDrawn.get(i) == 9) {
				box9SidesDrawn++;
			}
			if (linesDrawn.get(i) == 23) {
				box9SidesDrawn++;
			}
			if (linesDrawn.get(i) == 24) {
				box9SidesDrawn++;
			}
			if (linesDrawn.get(i) == 12) {
				box9SidesDrawn++;
			}
		}
		return box9SidesDrawn;
	}
	

	public static boolean endGame() {
		if (box1Drawn() && !box1Checked) {
			totalBoxesDrawn++;
			box1Checked = true;
		}
		if (box2Drawn() && !box2Checked) {
			totalBoxesDrawn++;
			box2Checked = true;
		}
		if (box3Drawn() && !box3Checked) {
			totalBoxesDrawn++;
			box3Checked = true;
		}
		if (box4Drawn() && !box4Checked) {
			totalBoxesDrawn++;
			box4Checked = true;
		}
		if (box5Drawn() && !box5Checked) {
			totalBoxesDrawn++;
			box5Checked = true;
		}
		if (box6Drawn() && !box6Checked) {
			totalBoxesDrawn++;
			box6Checked = true;
		}
		if (box7Drawn() && !box7Checked) {
			totalBoxesDrawn++;
			box7Checked = true;
		}
		if (box8Drawn() && !box8Checked) {
			totalBoxesDrawn++;
			box8Checked = true;
		}
		if (box9Drawn() && !box9Checked) {
			totalBoxesDrawn++;
			box9Checked = true;
		}
		
		Player.lastMove = false;
		
		//System.out.println("Box 9: " + box9Drawn());
		if (totalBoxesDrawn == 9) { //if all boxes are drawn
			System.out.println("Game finished");
			scoreBoard finalScoreBoard = new scoreBoard();
			return true;
		}
		else {
			testPlayer.move(); //if game hasn't ended, AI moves
			return false;
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}