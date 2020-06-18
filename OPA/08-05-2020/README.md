# QUESTIONS

## JAVA

Create a class Player with below attributes:
playerId - int
skill - String
level - String 
points - int

 

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required. 

 

Create class Solution with the main method. 

Implement two static methods - findPointsForGivenSkill and getPlayerBasedOnLevel in Solution class.

 

findPointsForGivenSkill method:
This method will take two input parameters - array of Player objects and string parameter skill. 
The method will return the sum of the points attribute from player objects for the skill passed as parameter. 
If no player with the given skill is present in the array of player objects, then the method should return 0. 

 

getPlayerBasedOnLevel method:
This method will take two String parameters level and skill, along with the array of Player objects.
The method will return the player object, if the input String parameters matches with the level and skill attribute of the player object and its point attribute is greater than or equal to 20. If any of the conditions are not met, then the method should return null.

 

Note : No two player object would have the same value for skill and level attribute.
       All player object would have the points greater than 0.
       All the searches should be case insensitive.


These above mentioned static methods should be called from the main method. 

For findPointsForGivenSkill method - The main method should print the points as it is if the returned price is greater than 0, or it
should print "The given Skill is not available".

For getPlayerBasedOnLevel method - The main method should print the playerId of the returned player object. If the returned value is null
then it should print "No player is available with specified level, skill and eligibility points".

 

Before calling these static methods in main, use Scanner object to read the values of four Player objects referring attributes in the above mentioned attribute sequence. 
Next, read the value for skill and level.
Please consider the skill value read above as skill parameter for both the static methods.


Consider below sample input and output:
### Input:

101
cricket
Basic
20
102
cricket
Intermediate
25
111
football
Intermediate
50
113
baseball
Advanced
100
cricket
Intermediate

 

### Output:
45
102


## UNIX


Write a shell script to find the difference between sum of squares of Even and sum of the squares of Odd numbers in the given list.

 

Script should read the count of numbers to be considered as user input followed by set of numbers one by one and process the data accordingly towards the given requirement. Below sample input describes the order / type of the data, in which shell script should read the required  input data to process towards the given requirement .

 

Hint:

Use read statement of shell script to read the input,  as mentioned in sample input.

Loop through the count of input elements to read individual elements one by one , find out the number is Even or Odd and apply the relevant logic to find the difference between sum of squares of Even numbers and Odd numbers in the list of input

        

 

### Sample input  / Test case input format: 

1. The first line represents the count of numbers considered to calculate the difference of sum of squares of Even and Odd.

2. The second line contains the 1st number .

3. The third line contains the 2nd number and so on, will be repeated till the count(count read in point#a)  is reached .

 

Example:

If we want to provide 2, 3 4 and 5 as the input numbers  , then provide the input as

4

2

3

4

5

 

The first line of above input represents the total number of input values to be read.

 

The output for this  example will be as below;

-14

 

### Output explanation :

Even numbers in the sample input are: 2 and 4 ;  Sum of squares of Even numbers = 2*2 + 4*4=20

Odd numbers in the sample input are : 3 and 5 ; Sum of squares of Odd numbers = 3*3 + 5*5 =34

Sum of squares of Even numbers - Sum of squares of Odd numbers =  -14  (ie.. 20-34 )

 

### Output: 

-14

 

Note:

If sum of Squares of Even numbers is more than the sum of squares of odd numbers, then the output will be a positive number.​