######                         #         #
#     #   ######   ##   ####   ##       ## ######
#     #   #       #  #  #   #  # #     # # #
######    #####  #    # #    # #  #   #  # #####
#     #   #      ###### #    # #   # #   # #
#      #  #      #    # #   #  #    #    # #
#      #  ###### #    # ####   #         # ######

=========================================================
HOW TO RUN THE ELECTION SIMULATION
=========================================================

  1. Compile the files using the following commands:
     	javac Voter.java
	javac Election.java
	javac Simulation.java
	javac Test.java
  2. Run the Test file:
	java Test
  3. Watch the simulation take place.

=========================================================
HOW I WROTE THE PROGRAM
=========================================================

  First I made a rough outline of what was going into my classes to make the elections simulation.
  
  Classes:
  Voter: instance variables, method vote, get results
  Election: create one of each voter, each voting x times; 10,000 votes in total, get results
  Simulation: create election, get results
  Test: create election for part a and for part b - both use different instance variables

  In the Voter class I needed to model a voter's  behavior so I identified the instance variables, wrote a vote method where I compared a random math
  number to the voter's probability of attending and voting and returned the result of whether the vote counted.

  In the Election class,  I identified the instance variables, differentiating between the different types of voters and wrote the election method wherein
  I tallied the votes of the 10,000 voters in the district and compared the number of votes won by your candidate and the opposition to see who won that
  election, and then returned the result. I also created a method to reset the values for total votes of both parties in the case of new elections being
  held.

  In the Simulation class, I defined the different parameters of Part A and Part B that would be used in the Election and Voter class to calculate the 
  probabilities of attendance and voting, and I also set up the boolean that would run 10,000 elections, and return the total number of times your
  candidate wins in total in the 10,0000 election scenarios, and then returning the result.

  In the Test class, I just printed out the lines that would appear to anyone viewing the program, and producing the actual probability of your
  candidate winning as a result, which would be the number of times he won in 10,000 elections, divided by 10,000. And that is how I wrote the program.
