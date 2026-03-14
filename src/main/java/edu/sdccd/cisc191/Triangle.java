package edu.sdccd.cisc191;

public class Triangle extends Shape {
    private double s1;
    private double s2;
    private double s3;
    public Triangle(String name, double s1, double s2, double s3) {
        super(name);
        if (s1 < 0 || s2 < 0 || s3 < 0) {
            throw new IllegalArgumentException("Can't have a negative side.");
        }
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    @Override
    public double area() { // This uses Heron's formula to find the area
        double sPerm = perimeter() / 2;
        double area = Math.sqrt(sPerm * (sPerm - s1) * (sPerm - s2) * (sPerm - s3));
        return area;
    }
    @Override
    public double perimeter() {
        return (s1 + s2 + s3);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triangle)) {
            return false;
        }

        Triangle other = (Triangle) obj;

        return getName().equals(other.getName()) &&
                Double.compare(s1, other.s1) == 0 &&
                Double.compare(s2, other.s2) == 0 &&
                Double.compare(s3, other.s3) == 0;
    }
}
