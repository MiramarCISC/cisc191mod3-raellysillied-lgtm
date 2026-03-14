package edu.sdccd.cisc191;

public abstract class Shape implements Measurable, Comparable<Shape> {

    private String name;
    public Shape(String name){
        if (name == null || name.trim().isBlank()) {
            throw new IllegalArgumentException("Shape name is null or empty");
        }
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();

    public String describe() {
        return String.format(
                "%s - '%s' | Area = %.3f | Perimeter = %.3f",
                getClass().getSimpleName(), name, area(), perimeter()
        );
    }

    @Override
    public String toString() {
        return String.format(
                "%s - '%s' - %.3f",
                getClass().getSimpleName(), name, area()
        );
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Shape other) {
        return this.getName().compareTo(other.getName());
    }
}