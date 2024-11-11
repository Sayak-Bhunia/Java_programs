// Grandparent class
class Box {
    protected double height;
    protected double width;
    protected double length;

    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    // Method to calculate the volume of the box
    public double volume() {
        return height * width * length;
    }

    @Override
    public String toString() {
        return "Box dimensions: " + height + " x " + width + " x " + length;
    }
}

// Parent class
class BoxWithWeight extends Box {
    protected double weight;

    public BoxWithWeight(double height, double width, double length, double weight) {
        // Calling the constructor of the Box class
        super(height, width, length);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + ", Weight: " + weight + " kg";
    }
}

// Child class
class BoxWithShippingCost extends BoxWithWeight {
    private double[] weightLimits;
    private double[] costPerUnitVolume;

    // Constructor to initialize Box with weight and shipping cost chart
    public BoxWithShippingCost(double height, double width, double length, double weight,
                                double[] weightLimits, double[] costPerUnitVolume) {
        super(height, width, length, weight);
        this.weightLimits = weightLimits;
        this.costPerUnitVolume = costPerUnitVolume;
    }

    // Method to calculate shipping cost based on weight and volume
    public double calculateShippingCost() {
        double volume = volume();
        double cost = -1; // Default to -1 if no shipping cost is found for the weight

        // Iterate through weight limits and calculate the shipping cost
        for (int i = 0; i < weightLimits.length; i++) {
            if (weight <= weightLimits[i]) {
                cost = costPerUnitVolume[i] * volume; // Cost = cost per unit volume * volume
                break;
            }
        }

        return cost >= 0 ? cost : -1; // Return -1 if no applicable cost found
    }

    @Override
    public String toString() {
        double shippingCost = calculateShippingCost();
        return super.toString() + ", Shipping Cost: " + (shippingCost >= 0 ? shippingCost : "Not available for this weight");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Shipping cost chart (weight limit -> cost per unit volume)
        double[] weightLimits = {5, 10, 20}; // kg
        double[] costPerUnitVolume = {0.02, 0.015, 0.01}; // Cost per cubic meter for weight limits

        // Create a BoxWithShippingCost object
        BoxWithShippingCost box = new BoxWithShippingCost(2, 3, 4, 7, weightLimits, costPerUnitVolume);

        // Output the details
        System.out.println(box);
    }
}
