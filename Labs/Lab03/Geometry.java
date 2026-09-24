public class Geometry {
    public double area(double width, double height) {
        return width * height;
    }

    public double area(double side, boolean isSquare) {
        if (isSquare) {
            return side * side;
        } else {
            return area(side);
        }
    }
    
    public double area(double radius) {
        return Math.PI * radius * radius;
    }
    
    public double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return (base * height) / 2;
        } else {
            return area(base, height);
        }
    }
    
    

    
}
