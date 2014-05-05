READ ME

HOW TO RUN THE GAME

  1. Compile the files using the following commands:
     	javac Game.java
	javac GameTest.java
	javac Player.java
  2. Run the GameTest file:
	java GameTest
  3. Play the game according to the instructions. 

RULES OF THE GAME

  The rules of the game should show up when the game starts, but basically it works
  like this: Two players simultaneously declare "one" or "two". Player 1 wins if
  the sum of the two declared number is odd and Player 2 wins otherwise. In either
  case the loser in obliged to pay the winner in dollars the sum of the two 
  declared numbers.

HOW I WROTE THE GAME

  In the programming assignment prompt, there were a number of requirements. So
  I'll describe how I designed the code to satisfy all the conditions. I
  numbered off the requirements so every time one comes up in my explanation
  I'll number it.

  Test class:
  I started by creating a public test class that I called GameTest. I included
  some start-up text to pop up with the beginning of the game, which included 
  the rules of the game. I set up instanciation of a new game that would link
  to the game class. I also wrote a while loop for a quitting option that
  asked the user at the end of each round if another round should be played 
  (5). This is the starting class and also the simplest one to write.

  Game class:
  First I identified all the variables and made them private, i.e. Players,
  their total winnins/losings, and the sum of their declarations. The sequence
  of the game is as follows: the computer program asks the user if they want
  to play against the computer or, allow the computer to play against itself (1).
  If a human was playing, it would ask the user whether he wanted to declare 1
  or 2.

  I identified within the game a threshold variable t for each computer 
  player that is between 0 and 1, in this case computer Player 1 had t=0.75 and 
  Player 2 had t=0.5. What this means is that when the computer generates a 
  random number between 0 and 1, if the number is greater than t the computer
  will declare 2 and if the number is lesser than t the computer will declare
  1. If both players are computers then Player 1 has higher odds of declaring
  1 because its threshold variable is relatively high, while Player 2 has a
  50% chance of choosing 1 or 2 due to a different t value (2).

  I added the sum up, if it were odd, I reported the amount of money Player 1
  wins from Player 2 and the amount of money Player 2 lost in that round;
  or the other way around if the sum were even and Player 1 lost. At the end of
  each round I also identified how much money the losing player owed the 
  winning player in total so far in the game (4). That's the basic structure
  of the game class.

  Player class:
  In the player class, I differentiated between human and computer gameplay.
  If a human is playing, then he only has the options of declaring 1 or 2, no
  more and no less, so I restricted the input values by prompting the user to
  give a new number if he didn't choose one of the two options of 1 and 2.

  Next I described the computer gameplay which would create a random value
  between 0 and 1, and depending on the threshold variable identified in the
  game class after finding out how many computer players there are, the 
  computer player would declare either 1 or 2. I thought of just adding 1 to
  the random double produced by Math.random for the computer player and
  rounding it to the nearest integer but the assignment suggested we use
  threshold values, and different ones in fact for two computer players.

  At the end of my player class I found the sum of the declarations which
  would be the input used in my game class. And that's my program!

