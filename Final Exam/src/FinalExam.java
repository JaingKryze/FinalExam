import java.util.Scanner;

public class FinalExam
	{
	static String tiles[][] = new String[3][3];
	static int table[][] = new int[3][3];
	static int winOrLoss;
	static String tileSelection;
	static String xOrO;
	static String xOrO2;
	static boolean tileCheck;
	static int playAgain = 1;
	static int gamesPlayed = 0;
	static int counter = 0;
	static String xOrO3;

	// throws InterruptedException fixes thread.sleep issue
	public static void main(String[] args) throws InterruptedException
		{
		chooseSide();
		setComputorSide();
		while (playAgain == 1)
			{
			resetValues();
			resetValues2();
			if (gamesPlayed % 2 == 0)
				{
				displayTable();
				}
			while ((winOrLoss == 0) && (gamesPlayed % 2 == 0))
				{
				System.out
						.println("Enter the letter and then number of the tile you wish to select (in caps no spaces).");
				tileCheck = false;
				while (tileCheck == false)
					{
					Scanner userInput1 = new Scanner(System.in);
					tileSelection = userInput1.nextLine();
					switch (tileSelection)
						{
						case "A1":
							{
							if (tiles[0][0].equals(" "))
								{
								tiles[0][0] = xOrO;
								table[0][0] = 2;
								tileCheck = true;
								} else
								{
								System.out
										.println("Error, please make a different selection.");
								}
							break;
							}
						case "A2":
							{
							if (tiles[0][1].equals(" "))
								{
								tiles[0][1] = xOrO;
								table[0][1] = 2;
								tileCheck = true;
								} else
								{
								System.out
										.println("Error, please make a different selection.");
								}
							break;
							}
						case "A3":
							{
							if (tiles[0][2].equals(" "))
								{
								tiles[0][2] = xOrO;
								table[0][2] = 2;
								tileCheck = true;
								} else
								{
								System.out
										.println("Error, please make a different selection.");
								}
							break;
							}
						case "B1":
							{
							if (tiles[1][0].equals(" "))
								{
								tiles[1][0] = xOrO;
								tileCheck = true;
								table[1][0] = 2;
								} else
								{
								System.out
										.println("Error, please make a different selection.");
								}
							break;
							}
						case "B2":
							{
							if (tiles[1][1].equals(" "))
								{
								tiles[1][1] = xOrO;
								tileCheck = true;
								table[1][1] = 2;
								} else
								{
								System.out
										.println("Error, please make a different selection.");
								}
							break;
							}
						case "B3":
							{
							if (tiles[1][2].equals(" "))
								{
								tiles[1][2] = xOrO;
								tileCheck = true;
								table[1][2] = 2;
								} else
								{
								System.out
										.println("Error, please make a different selection.");
								}
							break;
							}
						case "C1":
							{
							if (tiles[2][0].equals(" "))
								{
								tiles[2][0] = xOrO;
								tileCheck = true;
								table[2][0] = 2;
								} else
								{
								System.out
										.println("Error, please make a different selection.");
								}
							break;
							}
						case "C2":
							{
							if (tiles[2][1].equals(" "))
								{
								tiles[2][1] = xOrO;
								tileCheck = true;
								table[2][1] = 2;
								} else
								{
								System.out
										.println("Error, please make a different selection.");
								}
							break;
							}
						case "C3":
							{
							if (tiles[2][2].equals(" "))
								{
								tiles[2][2] = xOrO;
								tileCheck = true;
								table[2][2] = 2;
								} else
								{
								System.out
										.println("Error, please make a different selection.");
								}
							break;
							}
						}
					}
				displayTable();
				GameStatus.checkYourGameStatus();
				checkTie();
				if (winOrLoss == 0)
					{
					AI.computorSelector();
					displayTable();
					}
				GameStatus.checkYourGameStatus();
				checkTie();
				}
			while ((winOrLoss == 0) && (gamesPlayed % 2 != 0))
				{
				if (winOrLoss == 0)
					{
					AI.computorSelector();
					displayTable();
					}
				GameStatus.checkYourGameStatus();
				checkTie();
				System.out
						.println("Enter the letter and then number of the tile you wish to select (in caps no spaces).");
				tileCheck = false;
				while ((tileCheck == false) && (winOrLoss == 0))
					{
					Scanner userInput1 = new Scanner(System.in);
					tileSelection = userInput1.nextLine();
					switch (tileSelection)
						{
						case "A1":
							{
							if (tiles[0][0].equals(" "))
								{
								tiles[0][0] = xOrO;
								table[0][0] = 2;
								tileCheck = true;
								} else
								{
								System.out
										.println("Error, please make a different selection.");
								}
							break;
							}
						case "A2":
							{
							if (tiles[0][1].equals(" "))
								{
								tiles[0][1] = xOrO;
								table[0][1] = 2;
								tileCheck = true;
								} else
								{
								System.out
										.println("Error, please make a different selection.");
								}
							break;
							}
						case "A3":
							{
							if (tiles[0][2].equals(" "))
								{
								tiles[0][2] = xOrO;
								table[0][2] = 2;
								tileCheck = true;
								} else
								{
								System.out
										.println("Error, please make a different selection.");
								}
							break;
							}
						case "B1":
							{
							if (tiles[1][0].equals(" "))
								{
								tiles[1][0] = xOrO;
								tileCheck = true;
								table[1][0] = 2;
								} else
								{
								System.out
										.println("Error, please make a different selection.");
								}
							break;
							}
						case "B2":
							{
							if (tiles[1][1].equals(" "))
								{
								tiles[1][1] = xOrO;
								tileCheck = true;
								table[1][1] = 2;
								} else
								{
								System.out
										.println("Error, please make a different selection.");
								}
							break;
							}
						case "B3":
							{
							if (tiles[1][2].equals(" "))
								{
								tiles[1][2] = xOrO;
								tileCheck = true;
								table[1][2] = 2;
								} else
								{
								System.out
										.println("Error, please make a different selection.");
								}
							break;
							}
						case "C1":
							{
							if (tiles[2][0].equals(" "))
								{
								tiles[2][0] = xOrO;
								tileCheck = true;
								table[2][0] = 2;
								} else
								{
								System.out
										.println("Error, please make a different selection.");
								}
							break;
							}
						case "C2":
							{
							if (tiles[2][1].equals(" "))
								{
								tiles[2][1] = xOrO;
								tileCheck = true;
								table[2][1] = 2;
								} else
								{
								System.out
										.println("Error, please make a different selection.");
								}
							break;
							}
						case "C3":
							{
							if (tiles[2][2].equals(" "))
								{
								tiles[2][2] = xOrO;
								tileCheck = true;
								table[2][2] = 2;
								} else
								{
								System.out
										.println("Error, please make a different selection.");
								}
							break;
							}
						}
					}
				displayTable();
				GameStatus.checkYourGameStatus();
				checkTie();
				}
			// for no apparent reason "you win" will print twice if in the
			// GameStatus Class
			// the line will not run if inside the while loop above
			if (winOrLoss == 1)
				{
				System.out.println("You win!");
				}
			// this line also had to be moved for similar reasons please see the
			// checkTie method
			if (winOrLoss == 3)
				{
				System.out.println("Tie.");
				}
			System.out.println("Would you like to play again?");
			System.out.println("Enter 1 for yes or 2 for no.");
			Scanner userInput1 = new Scanner(System.in);
			playAgain = userInput1.nextInt();
			if ((playAgain != 1) && (playAgain != 2))
				{
				System.out.println("Error " + playAgain
						+ " will be assumed as no game over.");
				playAgain = 2;
				}
			CountWinsAndLosses.countWins();
			CountWinsAndLosses.countTies();
			CountWinsAndLosses.countLosses();
			CountWinsAndLosses.evaluateScore();
			gamesPlayed++;
			Thread.sleep(3000);
			}
		if (playAgain == 2)
			{
			DisplayGameOverImage.displayGameOver();
			}
		}

	public static String[][] resetValues()
		{
		for (int i = 0; i < 3; i++)
			{
			for (int j = 0; j < 3; j++)
				{
				tiles[i][j] = " ";
				}
			}
		winOrLoss = 0;
		counter = 0;
		return tiles;
		}

	public static int[][] resetValues2()
		{
		for (int i = 0; i < 3; i++)
			{
			for (int j = 0; j < 3; j++)
				{
				table[i][j] = 0;
				}
			}
		return table;
		}

	public static void displayTable()
		{
		System.out.println("    1 2 3");
		System.out.println("   -------");
		System.out.println("A. |" + tiles[0][0] + "|" + tiles[0][1] + "|"
				+ tiles[0][2] + "|");
		System.out.println("   -------");
		System.out.println("B. |" + tiles[1][0] + "|" + tiles[1][1] + "|"
				+ tiles[1][2] + "|");
		System.out.println("   -------");
		System.out.println("C. |" + tiles[2][0] + "|" + tiles[2][1] + "|"
				+ tiles[2][2] + "|");
		System.out.println("   -------");
		}

	public static String chooseSide()
		{
		System.out
				.println("Would you like to be 'X' or 'O'? (Please use caps and no spaces)");
		Scanner userInput1 = new Scanner(System.in);
		xOrO3 = userInput1.nextLine();
		if ((xOrO3.equals("X")) || (xOrO3.equals("O")))
			{
			xOrO = xOrO3;
			} else
			{
			System.out.println("ERROR! Your answer will be assumed as a X.");
			xOrO = "X";
			}
		return xOrO;
		}

	public static String setComputorSide()
		{
		switch (xOrO)
			{
			case "X":
				{
				xOrO2 = "O";
				break;
				}
			default:
				{
				xOrO2 = "X";
				}
			}
		return xOrO2;
		}

	public static int checkTie()
		{
		counter++;
		if ((counter == 9) && (winOrLoss == 0))
			{
			FinalExam.winOrLoss = 3;
			// this line will not print on the computers turn to go first
			// System.out.println("Tie.");
			}
		return counter;
		}
	}
