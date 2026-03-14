package edu.sdccd.cisc191;

public class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(String name, double l, double w) {
        super(name);
        if (l < 0 || w < 0 ) {
            throw new IllegalArgumentException("Can't have negative length or width.");
        }
        this.length = l;
        this.width = w;
    }
    @Override
    public double area() {
        return length * width;
    }
    @Override
    public double perimeter() {
        return (length + width) * 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rectangle)) {
            return false;
        }

        Rectangle other = (Rectangle) obj;

        return getName().equals(other.getName()) &&
                Double.compare(length, other.length) == 0 &&
                Double.compare(width, other.width) == 0;
    }
}
