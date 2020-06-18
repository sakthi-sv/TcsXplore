# QUESTIONS

## JAVA

Create a class Movie with the below attributes:
movieId - int
director - String
rating - int 
budget - int

 

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

 

Create class Solution with the main method. 

Implement two static methods - findAvgBudgetByDirector and getMovieByRatingBudget in Solution class.

 

#### findAvgBudgetByDirector method:
This method will take two input parameters - array of Movie objects and string parameter director. 
The method will return the average of the budget attribute from Movie objects directed by the director passed as parameter. 
If no movie with the given director is present in the array of movie objects, then the method should return 0. 

 

#### getMovieByRatingBudget method:
This method will take two int parameters rating and budget, along with the array of movie objects.
The method will return the movie object, if the input parameters rating and budget, matches with the rating and budget attribute of the movie object respectively.

Also check if rating is a factor of budget (eg: 3 is a factor of 12 because 3 divides 12 without leaving a remainder).
If any of the conditions are not met, then the method should return null.

 

Note : No two movie object would have the same value for rating and budget attributes.
          All the searches should be case insensitive.
          The budget mentioned are in crores and in INR.
       

These above mentioned static methods should be called from the main method. 

For findAvgBudgetByDirector method - The main method should print the average budget as it is if the returned value is greater than 0, or it
should print "Sorry - The given director has not yet directed any movie".

 

For getMovieByRatingBudget method - The main method should print the movieId of the returned movie object. If the returned value is null
then it should print "Sorry - No movie is available with the specified rating and budget requirement".

 

Before calling these static methods in main, use Scanner object to read the values of four
Movie objects referring attributes in the above mentioned attribute sequence. 
Next, read the value for director, rating and budget.


Consider below sample input and output:


### Input:


1101
ratham
4
100
1201
shankar
5
500
1301
shankar
3
50
1401
ratham
5
300
ratham
5
300

​

### Output:


200
1401

## UNIX

Student details are stored in following format:

 

Roll no,Name,Score1,Score2

 

Write the unix command to display the roll no and the name of all the students whose total score is greater than 100. The student details are to be displayed sorted in descending order of the the total score.

 

The total score is to be calculated as follows :

Total score = Score1 + Score2

 

The student details are provided as command line argument when the file containing your command will run. Use appropriate command line argument($1,$2 etc.) to access the details.

 

Note : The Roll No and Name are to be displayed with a space as the delimiter.

 

For more details, please refer to the sample input and output below.

 

Input Format    words in the box used for tom Testing.

Input data (From Test case input or from Custom input field ) will be supplied to the shell script through commandline argument.

You just need to use the appropriate commandline argument in the shell script to read the content into a file and process the file towards the given requirement.

 

To test your code with custom input option the respective checkbox needs to be enabled to enter the line of words in the text field .

 

Instructions to read from custom input text field:

​

1. The first line contains the header line as displayed above in the question(Roll No, Name,Score1,Score2)

2. The next line contains the Roll No, Name, Score1 and Score2 for the first student separated by comma.

3. The subsequent lines contains the details of the rest of the students provided one by one as mentioned in Point 2.

 

For more details, refer to the sample Input format.

 

 

### Sample test case

​

### Test case Input

​

Roll No,Name,Score1,Score2

123,Hari,87,78

367,Madhav,40,50

400,Naina,99,87

567,Amy,35,68

812,Ravi,58,98

​

### Test case output

​

400 Naina

123 Hari

812 Ravi

567 Amy