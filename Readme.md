[![Build Status](https://travis-ci.com/StratfordHS-APCS/lab-04-array-vs-arraylist-username.svg?token=L8ZuTUsXtxKqevAPVWLC&branch=master)](https://travis-ci.com/StratfordHS-APCS/lab-04-array-vs-arraylist-username)

# Lab 04 - Arrays vs. ArrayLists

## Lab Goal
This lab was designed to give you a chance to practice using both arrays and ArrayLists.  The differences between the two will be highlighted since you will be performing the same operations with each.

## Instructions
In the class ```UseArrays``` complete the following methods:
* ```allPrimesUpTo()``` - This accepts 1 parameter ```max```.  It returns an array containing all of the prime numbers from 2 through ```max```.  It may be helpful, but is not required, to make a helper method that will tell you if a number you send it is prime or not.  Note: You must grow the array one element at a time.  You cannot pre-calculate how much space you will need.
* ```squareEachElement()``` - This accepts an int array as a parameter.  Square each element in the array that is passed and store the results in an array.  Return the new array.
* ```removeElement()``` - Accepts 2 parameters, list and element.  You need to remove element number "element" from the array and return the new array.  The final array should be the correct size for the amount of data; one smaller than the original array.
* ```printArray()``` - Using an enhanced for loop, print the array one element at a time.
* ```main()``` - You may make any changes you wish to this method to demonstrate that your methods work.  Any changes here will not affect whether your code passes or fails the tests.

In the class ```UseArrayLists``` complete the following methods:
* ```allPrimesUpTo()``` - This accepts 1 parameter ```max```.  It returns an ArrayList of Integers containing all of the prime numbers from 2 through ```max```.  It may be helpful, but is not required, to make a helper method that will tell you if a number you send it is prime or not.
* ```squareEachElement()``` - This accepts an ArrayList of Integers as a parameter.  Square each element in the List that is passed and store the results in an ArrayList of Integers.  Return the new ArrayList.
* ```removeElement()``` - Accepts 2 parameters, list and element.  You need to remove element number "element" from the ArrayList and return the new ArrayList.
* ```printList()``` - Using an enhanced for loop, print the ArrayList one element at a time.
* ```main()``` - You may make any changes you wish to this method to demonstrate that your methods work.  Any changes here will not affect whether your code passes or fails the tests.

**Important** - Do not modify the original array or ArrayList that is passed to the function.  We will see how to do this in class.

Make sure you add a javadoc comment on each method.  You'll need to include a ```@param``` tag for each method that accepts a parameter.

## Sample Output
```Getting all prime numbers through 30...
[ 2 3 5 7 11 13 17 19 23 29 ]

Squaring all of the primes...
[ 4 9 25 49 121 169 289 361 529 841 ]

Removing the prime number in location 4...
[ 2 3 5 7 13 17 19 23 29 ]
```

## Helpful Resources
* [Arrays](http://greenteapress.com/thinkjava6/html/thinkjava6009.html)
* [ArrayLists](https://www.tutorialspoint.com/java/java_arraylist_class.htm)

## Notes
* Checkstyle config link is http://www.daveavis.com/cs/checkstyle_SHS.xml
* After cloning your repo from GitHub you can open your code in BlueJ by double clicking on the **package** file.
* Edit the first line of the Readme.md file and put your username in both locations that say "username".  This is necessary if you want the badge at the top of the instructions to show red or green based on your most recent commit.

## Grading
* 10 - ```UseArrays.allPrimesUpTo()```
* 10 - ```UseArrays.squareEachElement()```
* 10 - ```UseArrays.removeElement()```
* 10 - ```UseArrays.printArray()```
* 10 - ```UseArrayLists.allPrimesUpTo()```
* 10 - ```UseArrayLists.squareEachElement()```
* 10 - ```UseArrayLists.removeElement()```
* 10 - ```UseArrayLists.printArray()```
* 10 - Modifies arrays and ArrayLists non-destructively.
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
