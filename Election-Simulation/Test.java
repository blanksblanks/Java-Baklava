// ******************************
// 
// Test class for Election
// 
// get the results of 10,0000  elections and divide by 10,000 to get probability for part a and part b
// print out the results
// 
// 
// ******************************

public class Test
{	
	public static void main(String[] args)
		{
		System.out.println("Welcome to the Elections Simulator!");
		System.out.println("Please be patient, the simulator takes a while to process...");
		Simulation simulationA = new Simulation(1);
		System.out.println("The probability of you winning under the initial conditions is " + ((simulationA.getTimesElected())/10000.0) + ".");
		System.out.println("The simulator is computing the next set of results... hold your horses...");
		Simulation simulationB = new Simulation(2);
		System.out.println("The probability of you winning in the case of your opponent's evil plans against your campaign bearing fruit is " + ((simulationB.getTimesElected())/10000.0) + "."  );
		}   
}
