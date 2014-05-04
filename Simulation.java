//******************************
//
// Simulation class
//
//make and run conditions for election a
//make and run conditions for election b
//
//get who is elected value and each time add to timeselected
//return timesyourcandidateiselected value
//
//******************************

public class Simulation
{
	private Election newElection;
	private int timesElected;

    public Simulation(int conditions)
    	{	
    		{ // sets up probability variables according to Part A or Part B
    		if (conditions == 1) // Part A
    		newElection = new Election(0.73, 0.85, 0.75, 0.15, 0.4, 0.53, 10000);
    		else if (conditions == 2) // Part B
    		newElection = new Election(0.72, 0.85, 0.75, 0.15, 0.35, 0.52, 10000);
    		}
    	
    	timesElected = 0;
    	
    	for (int i = 0; i <= 10000; i++) // runs the elections ten thousand times
    		{
    		newElection.run(0);
    		int elected = newElection.getElected();
    		if (elected == 1)
    		timesElected++;
    		newElection.resetElection();
    		}
    	}
    
    public int getTimesElected() // returns result of number of times elected
    	{
    	return timesElected;
    	}
}
