READ ME

HOW TO RUN THE BIGRAM TEST

  1. Compile the files using the following commands:
	javac Test.java
	javac UnsortedList.java
	javac SortedList.java
	javac Bigrams.java
	javac MostCommon.java
	javac bigramlist.java
  2. Create the text file you want to read:
	pico input.txt
	*Note: you can call input whatever you want, and you can either write
	whatever you want or copy and paste the text from another place
  3. Run the Test file:
	java Test (input.txt)
	*Note: the input file can be called anything, just make sure it's correct
	and an existing file

HOW I WROTE THE PROGRAM

The concept of taking and input file and transforming the information into a
readable output file was pretty fascinating to me, so perhaps I created too
many output files in this program, divided into too many classes that only have
one constructor method. If I had more time, I'd do this a little differently,
starting by putting more constructors into one class.  Nonetheless, I'll
break down how I managed the different classes in order to find the top ten
bigrams.

Test Class:

This class basically just read a command-line input text file and copied all the text,
without changing any information or the format, into a file called "inputfile.txt"
which can be referred to later. After that it implemented the constructor methods from
other classes to create different output files.  It also caught exceptions if the user typed the
wrong input.


UnsortedList Class:

This class accessed the inputfile and broke each word by word into character
arrays, and used the first and second element of the arrays to form bigrams. It
put this list of unsorted bigrams into a new file called "output.txt."


SortedList Class:

This class ordered the bigrams output file into alphabetical order by
comparing them to a master list of bigrams from aa-zz formed by the class
bigramlist.java. It then put this alphabetized list into "output2.java"

Bigrams Class:
This list counted the number of occurences of each bigram by comparing each
line with the next line,  and then created a list of the number of occurrences
next to each bigram in "output3.java" that looks almost like a 2d array/table.

MostCommon Class:
Using a sorting algorithm and two arrays, this class found the ten most
common bigrams and put them in "output4.java" with a row of number of
occurrences and a row of the bigrams associated with each number value.
It discards the bigrams that are not in the ten most commonly appearing,
and reads from the top of the alphabetized list to the bottom so in the case
of ties, bigrams further back in the list are more likely to make it to "the top ten."



Example: haha.txt
hahahaha that is funny

=>output.txt
ha
ah
ha
ah
ha
ah
ha
th
ha
at
is
fu
un
nn
ny

=>output2.txt
ah
ah
ah
at
fu
ha
ha
ha
ha
ha
is
nn
ny
th
un

=>output3.txt
3 ah
1 at
1 fu
5 ha
1 is
1 nn
1 ny
1 th

=>output4.txt
Occurrences: 	5	3	1	1	1	1	1	1	0	0	
Bigrams: 	ha	ah	th	ny	nn	is	fu	at	null	null	
