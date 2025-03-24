CMSC 215 Intermediate Programming  
Programming Project 3  
The third programming project involves writing a program that produces a road trip cost 
estimator with a GUI interface. The required GUI is shown below,  
The java program must contain a main () method. The program class [public class (Java 
filename)] must have the same name as the java file name. Standard programing practice locates 
the main () method at the end of the program.   
The text fields above the Calculate button are the input fields and the one below is the output 
field. The output field should not be editable. Three of the input fields have combo boxes to 
their right, which allow the data to be input as described below:   
• The distance can be entered in either miles or kilometers.   
• The gasoline cost can be input in either dollars per gallon or dollars per liter.   
• The gas mileage can be input as either miles per gallon or kilometers per liter.   
The necessary calculations are as follows.   
gasoline cost = (distance/gas milage) * gasoline cost   
total trip cost = gasoline cost + (hotel cost + food cost) * number of days + attractions   
Your program should consist of two classes. The first-class, InputData, should define the GUI 
illustrated above. The second class, TripPost, should be an immutable class that has at a 
minimum a constructor that creates a trip cost object and a method that computes and returns the 
total trip cost.   
Output   
Blackbox [Using above example entries]: >   
gasoline cost = (distance/gas milage) * gasoline cost  
gasoline cost = (1000/31) * gasoline cost   gasoline 
cost = (32.258) * gasoline cost gasoline cost = 
(32.258) * 3.95   
gasoline cost = 127.42    
total trip cost = gasoline cost + (hotel cost + food cost) * number of days + attractions  
total trip cost = gasoline cost + (150 * 125) * number of days + attractions  total trip 
cost = gasoline cost + 275 * number of days + attractions total trip cost = gasoline 
cost + 275 * 2 + attractions  total trip cost = gasoline cost + 550 + attractions  
total trip cost = 127.42 + 550 + 78 total trip cost = 755.42    
DELIVERABLES     
You are to submit two files.   
1. The first file is a single java program file that contains all the source code for the project.   
Attach not more than one java file. NO ZIP FILES. The java file should contain only source 
code with appropriate comments and nothing else. If you elect to use a package the java file 
should be in a folder whose name is the package name. The program file should include a 
comment block at the top containing your name, the project name, the date, and a short 
description of the program.    
The java file and the program name in the java program should use the naming convention 
of CMSC215PROJ3[Last Name] [First Name Initial].java.   
2. The second file is a Word document (PDF is also acceptable) that contains the 
documentation for the project, which should include the following:   
a. A UML class diagram that includes all classes you wrote. Do not include predefined 
classes.   
b. A test plan that includes test cases that you have created indicating what aspects of the 
program each one is testing.   
c. A short paragraph on lessons learned from the project.   
d. Each of the above elements is tagged and the content inserted into that element.   
UML Diagrams   
[Insert the various UML diagrams here.]   
Test Plan  
[Insert the various test Plan tables here.]   
[Insert a few screen shot Windows would be helpful.]   
Lessons Learned   
[Insert the paragraph(s) that identified the various lessons learned in research. deign, 
coding, and documentation.]   
e. The documentation name should use the naming convention of CMSC215PROJ3[Last 
Name] [First Name Initial].docx. A pdf file is acceptable. It should be a single file.   
