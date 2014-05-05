// ******************************
// 	Election Class
// 
// -instance variables
// -public Election
// 	- make 3 electors(urfriend, urenemy, swing)
// 	-set the beginning howmanyfriendlyvotes=0
// 	-set howmanyenemyvotes=0
// -method election
// 	-voter urfriend votes like 2353236 times
// 	-voter urenemy votes like 12345 times
// 	-voter swing votes like 2335623 times
// 	add one to howmanyfriendlyvotes every time your camp gets a vote
// 	add one to howmanyenemyvotes every time your enemy gets a vote
// -reset howmanyfriendly- and -enemyvotes
// -method return who is elected
// 
// ******************************

public class Election
{	// instance variables
	private Voter friendlyVoter;
	private Voter enemyVoter;
	private Voter swingVoter;
	private int friends;
	private int enemies;
	private int swings;
	private int totalFriendlyVotes;
	private int totalEnemyVotes;
	private int totalVotes;
	private int elected; // if your candidate wins, i.e. has more votes, he is elected
	
	public Election(double pAFriend, double pVFriend, double pAEnemy, double pVEnemy, double pASwing, double pVSwing, int total)
		{
		totalVotes = total;
		friends = (int) Math.round(0.35*totalVotes);
		enemies = (int) Math.round(0.35*totalVotes);
		swings = (int) Math.round(0.30*totalVotes);
		friendlyVoter = new Voter(pAFriend, pVFriend);
		enemyVoter = new Voter(pAEnemy, pVEnemy);
		swingVoter = new Voter(pASwing, pVSwing);
		elected = 0;
		totalFriendlyVotes = 0;
		totalEnemyVotes = 0;
		}
	
	// runs elections where all the voters from the three camps vote
	public void run(int vote)
		{	
		for(int i = 0; i <= friends; i++)
			{
			friendlyVoter.vote();
			vote = friendlyVoter.getVote();
			if (vote == 1)
			totalFriendlyVotes++;
			else if (vote == 2)
			totalEnemyVotes++;
			}
		
		for(int i = 0; i <= enemies; i++)
			{
			enemyVoter.vote();
			vote = enemyVoter.getVote();
			if (vote == 1)
			totalFriendlyVotes++;
			else if (vote == 2)
			totalEnemyVotes++;
			}
		
		for(int i = 0; i <= swings; i++)
			{
			swingVoter.vote();
			vote = swingVoter.getVote();
			if (vote == 1)
			totalFriendlyVotes++;
			else if (vote == 2)
			totalEnemyVotes++;
		}
		
	// election results shows whether your candidate is elected
		if ( (totalFriendlyVotes) > totalEnemyVotes)
		elected = 1;
		else
		elected = 0;
		}
	
	public void resetElection()
	{
		totalFriendlyVotes = 0;
		totalEnemyVotes = 0;
	}
	
	// returns election results
	public int getElected()
	{
	return elected;
	}
}
