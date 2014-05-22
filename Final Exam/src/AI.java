import java.util.Random;

public class AI
	{
	static boolean checkTile;
	static int x = 0;
	static int y = 0;
	static int i = 0;
	static int j = 0;
	static int lineSum = 0;
	static boolean moveFound = false;

	public static String[][] computorSelector()
		{
		checkTile = false;
		moveFound = false;
		// check wins
		if (moveFound == false)
			{
			for (i = 0; i < 3; i++)
				{
				lineSum = 0;
				for (j = 0; j < 3; j++)
					{
					lineSum = lineSum + FinalExam.table[i][j];
					if (lineSum == 10)
						{
						for (j = 0; j < 3; j++)
							{
							if (FinalExam.tiles[i][j].equals(" "))
								{
								FinalExam.tiles[i][j] = FinalExam.xOrO2;
								setTableValue();
								moveFound = true;
								}
							}
						}
					}
				}
			}
		if (moveFound == false)
			{
			for (j = 0; j < 3; j++)
				{
				lineSum = 0;
				for (i = 0; i < 3; i++)
					{
					lineSum = lineSum + FinalExam.table[i][j];
					if (lineSum == 10)
						{
						for (i = 0; i < 3; i++)
							{
							if (FinalExam.tiles[i][j].equals(" "))
								{
								FinalExam.tiles[i][j] = FinalExam.xOrO2;
								setTableValue();
								moveFound = true;
								}
							}
						}
					}
				}
			}
		if (moveFound == false)
			{
			lineSum = 0;
			for (i = 0; i < 3; i++)
				{
				lineSum = lineSum + FinalExam.table[i][i];
				if (lineSum == 10)
					{
					for (i = 0; i < 3; i++)
						{
						if (FinalExam.tiles[i][i].equals(" "))
							{
							FinalExam.tiles[i][i] = FinalExam.xOrO2;
							setTableValue2();
							moveFound = true;
							}
						}
					}
				}
			}
		if (moveFound == false)
			{
			lineSum = 0;
			for (i = 0; i < 3; i++)
				{
				lineSum = lineSum + FinalExam.table[i][2 - i];
				if (lineSum == 10)
					{
					for (i = 0; i < 3; i++)
						{
						if (FinalExam.tiles[i][2 - i].equals(" "))
							{
							FinalExam.tiles[i][2 - i] = FinalExam.xOrO2;
							setTableValue3();
							moveFound = true;
							}
						}
					}
				}
			}
		// check for a block
		if (moveFound == false)
			{
			for (i = 0; i < 3; i++)
				{
				lineSum = 0;
				for (j = 0; j < 3; j++)
					{
					lineSum = lineSum + FinalExam.table[i][j];
					if (lineSum == 4)
						{
						for (j = 0; j < 3; j++)
							{
							if (FinalExam.tiles[i][j].equals(" "))
								{
								FinalExam.tiles[i][j] = FinalExam.xOrO2;
								setTableValue();
								moveFound = true;
								}
							}
						}
					}
				}
			}
		if (moveFound == false)
			{
			for (j = 0; j < 3; j++)
				{
				lineSum = 0;
				for (i = 0; i < 3; i++)
					{
					lineSum = lineSum + FinalExam.table[i][j];
					if (lineSum == 4)
						{
						for (i = 0; i < 3; i++)
							{
							if (FinalExam.tiles[i][j].equals(" "))
								{
								FinalExam.tiles[i][j] = FinalExam.xOrO2;
								setTableValue();
								moveFound = true;
								}
							}
						}
					}
				}
			}
		if (moveFound == false)
			{
			lineSum = 0;
			for (i = 0; i < 3; i++)
				{
				lineSum = lineSum + FinalExam.table[i][i];
				if (lineSum == 4)
					{
					for (i = 0; i < 3; i++)
						{
						if (FinalExam.tiles[i][i].equals(" "))
							{
							FinalExam.tiles[i][i] = FinalExam.xOrO2;
							setTableValue2();
							moveFound = true;
							}
						}
					}
				}
			}
		if (moveFound == false)
			{
			lineSum = 0;
			for (i = 0; i < 3; i++)
				{
				lineSum = lineSum + FinalExam.table[i][2 - i];
				if (lineSum == 4)
					{
					for (i = 0; i < 3; i++)
						{
						if (FinalExam.tiles[i][2 - i].equals(" "))
							{
							FinalExam.tiles[i][2 - i] = FinalExam.xOrO2;
							setTableValue3();
							moveFound = true;
							}
						}
					}
				}
			}
		if ((moveFound == false) && (FinalExam.tiles[1][1].equals(" ")))
			{
			FinalExam.tiles[1][1] = FinalExam.xOrO2;
			i = 1;
			j = 1;
			setTableValue();
			moveFound = true;
			}
		if (moveFound == false)
			{
			while (checkTile == false)
				{
				Random randomNumber = new Random();
				i = randomNumber.nextInt(3);
				Random randomNumber2 = new Random();
				j = randomNumber.nextInt(3);
				if (FinalExam.tiles[i][j].equals(" "))
					{
					FinalExam.tiles[i][j] = FinalExam.xOrO2;
					setTableValue();
					checkTile = true;
					}
				}
			}
		return FinalExam.tiles;
		}

	public static int[][] setTableValue()
		{
		FinalExam.table[i][j] = 5;
		return FinalExam.table;
		}

	public static int[][] setTableValue2()
		{
		FinalExam.table[i][i] = 5;
		return FinalExam.table;
		}

	public static int[][] setTableValue3()
		{
		FinalExam.table[i][2 - i] = 5;
		return FinalExam.table;
		}
	}
