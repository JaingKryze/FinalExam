public class CountWinsAndLosses
	{
	static int wins = 0;
	static int losses = 0;
	static int ties = 0;
	static int score = 0;

	public static int countWins()
		{
		if (FinalExam.winOrLoss == 1)
			{
			wins++;
			}
		System.out.println("Wins: " + wins);
		return wins;
		}

	public static int countLosses()
		{
		if (FinalExam.winOrLoss == 2)
			{
			losses++;
			}
		System.out.println("Losses: " + losses);
		return losses;
		}

	public static int countTies()
		{
		if (FinalExam.winOrLoss == 3)
			{
			ties++;
			}
		System.out.println("Ties: " + ties);
		return ties;
		}

	public static int evaluateScore()
		{
		score = (wins) - (losses);
		System.out.println("Score: " + score);
		return score;
		}
	}
