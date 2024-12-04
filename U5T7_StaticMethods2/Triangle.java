package U5T7_StaticMethods2;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // C E
    // checks if triangle could have 3 equal sides based on perimeter
    public boolean possibleEquilateral() {
        if (Utility.isDivisibleBy3(perimeter())) {
            return true;
        } else {
            return false;
        }
    }

    // D B
    // returns information on the triangle object
    public String triangleInfo() {
        return "This is a " + triangleType(side1, side2, side3) + " triangle.\nPerimeter: " + perimeter(); 
    }

    // returns perimeter of triangle
    private int perimeter() {
        return side1 + side2 + side3;
    }

    // returns the type of triangle
    public static String triangleType(int side1, int side2, int side3) {
        if (side1 == side2 && side2 == side3) {
            return "equilateral";
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
