General Usage notes:

This program can be used to compute the Halstead complexity using the operators and operands.
Operators:
My program considers the 38 basic operators along with for, if and while statements as the operators.
Operands:
My program considers the operands in expressions, the data types, literals, variable declarations and simple names as operands.

Implementation notes:

I have used a HashSet to store the distinct operators and operands and calculated the size of the set as the number of these operators and operands. I have used a simple counter to calculate the total occurrences of any of these operators and operands. The Test class is used to parse the files, loop through the directory to check each folder for files with the “.java” extension and a main method to calculate and print the halstead complexity metrics. The Visitor class is used to implement the ASTVisitor to go through the AST and check the various nodes for operators and operands.
The LibraryTest class is the JUnit class for unit testing.

Compilation notes:
To execute the program, open a terminal and navigate to the folder in which the folder containing the assignment is stored. Then issue the command: 

gradle execute

The build starts and after the daemon is initialized, it asks you to enter the path to the directory containing the test application to be used. I have stored mine within my folder, within src, under the name testapp. Type the path at which this testapp folder can be found and hit enter.

Gradle will build the project and print out the halstead complexity measures.

For the testing, execute the command 

gradle test

This will run the unit class to do the comparison.

Limitations of my implementation:

My implementation only takes in specific operators and operands to compute the Halstead complexity. It does not account for positive and negative numbers as separate numbers and counts them as one. The comments are also considered as a part of the code.
