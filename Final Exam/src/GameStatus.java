public class GameStatus
	{
	public static int checkYourGameStatus()
		{
		if (((FinalExam.tiles[0][0].equals(FinalExam.xOrO))
				&& (FinalExam.tiles[0][1].equals(FinalExam.xOrO)) && (FinalExam.tiles[0][2]
					.equals(FinalExam.xOrO)))
				|| ((FinalExam.tiles[1][0].equals(FinalExam.xOrO))
						&& (FinalExam.tiles[1][1].equals(FinalExam.xOrO)) && (FinalExam.tiles[1][2]
							.equals(FinalExam.xOrO)))
				|| ((FinalExam.tiles[2][0].equals(FinalExam.xOrO))
						&& (FinalExam.tiles[2][1].equals(FinalExam.xOrO)) && (FinalExam.tiles[2][2]
							.equals(FinalExam.xOrO)))
				|| ((FinalExam.tiles[0][0].equals(FinalExam.xOrO))
						&& (FinalExam.tiles[1][0].equals(FinalExam.xOrO)) && (FinalExam.tiles[2][0]
							.equals(FinalExam.xOrO)))
				|| ((FinalExam.tiles[0][1].equals(FinalExam.xOrO))
						&& (FinalExam.tiles[1][1].equals(FinalExam.xOrO)) && (FinalExam.tiles[2][1]
							.equals(FinalExam.xOrO)))
				|| ((FinalExam.tiles[0][2].equals(FinalExam.xOrO))
						&& (FinalExam.tiles[1][2].equals(FinalExam.xOrO)) && (FinalExam.tiles[2][2]
							.equals(FinalExam.xOrO)))
				|| ((FinalExam.tiles[0][0].equals(FinalExam.xOrO))
						&& (FinalExam.tiles[1][1].equals(FinalExam.xOrO)) && (FinalExam.tiles[2][2]
							.equals(FinalExam.xOrO)))
				|| ((FinalExam.tiles[0][2].equals(FinalExam.xOrO))
						&& (FinalExam.tiles[1][1].equals(FinalExam.xOrO)) && (FinalExam.tiles[2][0]
							.equals(FinalExam.xOrO))))
			{
			FinalExam.winOrLoss = 1;
			// System.out.println("You win!");
			} else if (((FinalExam.tiles[0][0].equals(FinalExam.xOrO2))
				&& (FinalExam.tiles[0][1].equals(FinalExam.xOrO2)) && (FinalExam.tiles[0][2]
					.equals(FinalExam.xOrO2)))
				|| ((FinalExam.tiles[1][0].equals(FinalExam.xOrO2))
						&& (FinalExam.tiles[1][1].equals(FinalExam.xOrO2)) && (FinalExam.tiles[1][2]
							.equals(FinalExam.xOrO2)))
				|| ((FinalExam.tiles[2][0].equals(FinalExam.xOrO2))
						&& (FinalExam.tiles[2][1].equals(FinalExam.xOrO2)) && (FinalExam.tiles[2][2]
							.equals(FinalExam.xOrO2)))
				|| ((FinalExam.tiles[0][0].equals(FinalExam.xOrO2))
						&& (FinalExam.tiles[1][0].equals(FinalExam.xOrO2)) && (FinalExam.tiles[2][0]
							.equals(FinalExam.xOrO2)))
				|| ((FinalExam.tiles[0][1].equals(FinalExam.xOrO2))
						&& (FinalExam.tiles[1][1].equals(FinalExam.xOrO2)) && (FinalExam.tiles[2][1]
							.equals(FinalExam.xOrO2)))
				|| ((FinalExam.tiles[0][2].equals(FinalExam.xOrO2))
						&& (FinalExam.tiles[1][2].equals(FinalExam.xOrO2)) && (FinalExam.tiles[2][2]
							.equals(FinalExam.xOrO2)))
				|| ((FinalExam.tiles[0][0].equals(FinalExam.xOrO2))
						&& (FinalExam.tiles[1][1].equals(FinalExam.xOrO2)) && (FinalExam.tiles[2][2]
							.equals(FinalExam.xOrO2)))
				|| ((FinalExam.tiles[0][2].equals(FinalExam.xOrO2))
						&& (FinalExam.tiles[1][1].equals(FinalExam.xOrO2)) && (FinalExam.tiles[2][0]
							.equals(FinalExam.xOrO2))))
			{
			FinalExam.winOrLoss = 2;
			System.out.println("You lose.");
			}
		return FinalExam.winOrLoss;
		}
	}
