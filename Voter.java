
// ******************************
// 	Models a Voter
// 
// -instance variables: pa, pv, whotheyarevotingfor
// -method vote
// 	random int compared to pa
// 	random int compared to pv
// 	result=whotheyarevotingfor
// 	method return result(whotheyarevotingfor)
// 
// ******************************


public class Voter
{	// instance variables
	private double pAttend; // probability of attending
	private double pVote; // probability of voting for your camp
	private int voteCount; // whether their vote counts to your candidate's total votes
	
	public Voter(double pA, double pV)
		{
		pAttend = pA;
		pVote = pV;
		voteCount = 0; // initially voter has not yet voted
		}
	
	// method vote, comparing random number to pA and pV - equivalent to threshold values
	public void vote()
		{
		if(Math.random() > pAttend)
		voteCount = 0;
		else
			{
			if(Math.random() > pVote)
			voteCount = 2;
			else
			voteCount = 1;
			}
		}
	
	// method return result of whether vote to be counted for candidate's total votes
	public int getVote()
		{
		return voteCount;
		}
}
