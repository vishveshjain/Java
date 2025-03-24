# Trip Cost Estimator

This project is a Java application designed to estimate the cost of a road trip through a user-friendly GUI interface.

## Features
- **Input Fields**: Enter distance, gasoline cost, gas mileage, number of days, hotel cost, food cost, and attractions cost.
- **Combo Boxes**: Select units for distance, gasoline cost, and gas mileage (miles/kilometers, dollars per gallon/liter, and miles per gallon/kilometers per liter).
- **Calculate Button**: Computes and displays the total trip cost in the output field.

## Classes
1. **InputData**: Defines the GUI interface for the application.
2. **TripPost**: An immutable class for trip cost calculations.

## Formula
- **Gasoline Cost**: 

\[(distance / gas mileage) × gasoline cost\]


- **Total Trip Cost**: 

\[Gasoline Cost + ((Hotel Cost + Food Cost) × Number of Days) + Attractions Cost\]



## Deliverables
1. **Java File**:
   - Contains all source code for the project with appropriate comments.
   - Naming convention: `CMSC215PROJ3[LastName][FirstNameInitial].java`

2. **Documentation File**:
   - UML Class Diagram (includes `InputData` and `TripPost` classes).
   - Test Plan with test cases.
   - Lessons Learned from the project.

## Example Output
- **Input Values**:
  - Distance: 1000 miles
  - Gasoline Cost: $3.95/gal
  - Gas Mileage: 31 miles/gallon
  - Number of Days: 2
  - Hotel Cost: $150/day
  - Food Cost: $125/day
  - Attractions Cost: $78
- **Calculation**:
  - Gasoline Cost: $127.42
  - Total Trip Cost: $755.42

## Lessons Learned
Through this project, key learnings included:
- Design and implementation of GUI applications.
- Handling different measurement units in calculations.
- Writing and documenting robust, maintainable code.
