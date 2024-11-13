import java.util.Arrays;
import java.util.Comparator;

// Class representing an item in the knapsack
class Item {
    double weight, value, ratio;

    // Constructor to initialize the item with weight and value
    Item(double weight, double value) {
        this.weight = weight;
        this.value = value;
        this.ratio = value / weight; // Calculate value-to-weight ratio
    }
}

public class FractionalKnapsack {

    // Method to calculate the maximum value that can be carried in the knapsack
    public static double getMaxValue(Item[] items, double capacity) {

        // Sort items by their value-to-weight ratio in descending order
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return Double.compare(o2.ratio, o1.ratio); // Sort by descending order of ratio
            }
        });

        // Variable to store the total value of items in the knapsack
        double totalValue = 0.0;

        // Iterate through the sorted items
        for (Item item : items) {
            // If the entire item can fit into the knapsack
            if (capacity - item.weight >= 0) {
                capacity -= item.weight;  // Reduce the capacity
                totalValue += item.value; // Add the full value of the item
            } else {
                // If only part of the item can be added, take the fraction of it
                totalValue += item.value * (capacity / item.weight);
                break; // No more capacity left
            }
        }

        // Return the total value accumulated in the knapsack
        return totalValue;
    }

    // Main method to test the Fractional Knapsack problem
    public static void main(String[] args) {
        // Array of items with specified weights and values
        Item[] items = {
            new Item(10, 60),  // Item 1: weight = 10, value = 60
            new Item(20, 100), // Item 2: weight = 20, value = 100
            new Item(30, 120)  // Item 3: weight = 30, value = 120
        };

        // Knapsack capacity
        double capacity = 50.0;

        // Calculate the maximum value that can be carried and print the result
        double maxValue = getMaxValue(items, capacity);
        System.out.println("Maximum value in knapsack: " + maxValue);
    }
}
