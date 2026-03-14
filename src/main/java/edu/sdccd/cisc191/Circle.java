package edu.sdccd.cisc191;

public class Circle extends Shape {
    private double radius;
    public Circle(String name, double radius) {
        super(name);
        if (radius < 0) {
            throw new IllegalArgumentException("Can't have a negative radius.");
        }
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Circle)) {
            return false;
        }

        Circle other = (Circle) obj;

        return getName().equals(other.getName()) && Double.compare(radius, other.radius) == 0;
    }
}
