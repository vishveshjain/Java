import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  CMSC215PROJ3LastNameFirstName {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InputData inputData = new InputData();
            inputData.setVisible(true);
        });
    }
}

class InputData extends JFrame {
    private JTextField distanceField, gasolineCostField, gasMileageField;
    private JTextField hotelCostField, foodCostField, daysField, attractionsField;
    private JTextField resultField;
    private JComboBox<String> distanceUnit, gasolineCostUnit, gasMileageUnit;

    public InputData() {
        setTitle("Trip Cost Estimator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 350);
        setLayout(new GridLayout(9, 2, 5, 5));

        // Distance components
        add(new JLabel("Distance:"));
        distanceField = new JTextField("1000");
        add(distanceField);
        distanceUnit = new JComboBox<>(new String[]{"miles", "kilometers"});
        add(distanceUnit);

        // Gasoline Cost components
        add(new JLabel("Gasoline Cost:"));
        gasolineCostField = new JTextField("3.95");
        add(gasolineCostField);
        gasolineCostUnit = new JComboBox<>(new String[]{"$/gallon", "$/liter"});
        add(gasolineCostUnit);

        // Gas Mileage components
        add(new JLabel("Gas Mileage:"));
        gasMileageField = new JTextField("31");
        add(gasMileageField);
        gasMileageUnit = new JComboBox<>(new String[]{"miles/gallon", "kilometers/liter"});
        add(gasMileageUnit);

        // Other cost components
        add(new JLabel("Number Of Days:"));
        daysField = new JTextField("2");
        add(daysField);
        add(new JLabel("")); // Empty label for layout

        add(new JLabel("Hotel Cost:"));
        hotelCostField = new JTextField("150");
        add(hotelCostField);
        add(new JLabel("")); // Empty label for layout

        add(new JLabel("Food Cost:"));
        foodCostField = new JTextField("125");
        add(foodCostField);
        add(new JLabel("")); // Empty label for layout

        add(new JLabel("Attractions:"));
        attractionsField = new JTextField("78");
        add(attractionsField);
        add(new JLabel("")); // Empty label for layout

        // Calculate button
        add(new JLabel(""));
        JButton calculateButton = new JButton("Calculate");
        add(calculateButton);
        add(new JLabel("")); // Empty label for layout

        // Result field
        add(new JLabel("Total Trip Cost:"));
        resultField = new JTextField("$755.42");
        resultField.setEditable(false);
        add(resultField);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateTripCost();
            }
        });
    }

    private void calculateTripCost() {
        try {
            // Get input values
            double distance = Double.parseDouble(distanceField.getText());
            String distanceUnitStr = (String) distanceUnit.getSelectedItem();
            
            double gasolineCost = Double.parseDouble(gasolineCostField.getText());
            String gasolineCostUnitStr = (String) gasolineCostUnit.getSelectedItem();
            
            double gasMileage = Double.parseDouble(gasMileageField.getText());
            String gasMileageUnitStr = (String) gasMileageUnit.getSelectedItem();
            
            double hotelCost = Double.parseDouble(hotelCostField.getText());
            double foodCost = Double.parseDouble(foodCostField.getText());
            int days = Integer.parseInt(daysField.getText());
            double attractions = Double.parseDouble(attractionsField.getText());

            // Convert all units to miles and gallons for consistent calculation
            if (distanceUnitStr.equals("kilometers")) {
                distance = kilometersToMiles(distance);
            }
            
            if (gasolineCostUnitStr.equals("$/liter")) {
                gasolineCost = litersToGallons(gasolineCost);
            }
            
            if (gasMileageUnitStr.equals("kilometers/liter")) {
                gasMileage = kmPerLiterToMilesPerGallon(gasMileage);
            }

            // Create TripPost object and calculate cost
            TripPost trip = new TripPost(distance, gasolineCost, gasMileage, 
                                      hotelCost, foodCost, days, attractions);
            double totalCost = trip.calculateTotalCost();
            
            // Display result
            resultField.setText(String.format("$%.2f", totalCost));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers in all fields", 
                                        "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private double kilometersToMiles(double km) {
        return km * 0.621371;
    }

    private double litersToGallons(double liters) {
        return liters * 3.78541;
    }

    private double kmPerLiterToMilesPerGallon(double kmpl) {
        return kmpl * 2.35215;
    }
}

final class TripPost {
    private final double distance;
    private final double gasolineCost;
    private final double gasMileage;
    private final double hotelCost;
    private final double foodCost;
    private final int days;
    private final double attractions;

    public TripPost(double distance, double gasolineCost, double gasMileage, 
                   double hotelCost, double foodCost, int days, double attractions) {
        this.distance = distance;
        this.gasolineCost = gasolineCost;
        this.gasMileage = gasMileage;
        this.hotelCost = hotelCost;
        this.foodCost = foodCost;
        this.days = days;
        this.attractions = attractions;
    }

    public double calculateTotalCost() {
        double gasolineTotal = (distance / gasMileage) * gasolineCost;
        double lodgingFoodTotal = (hotelCost + foodCost) * days;
        return gasolineTotal + lodgingFoodTotal + attractions;
    }
}