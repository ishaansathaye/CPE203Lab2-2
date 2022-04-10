package src;

public class Circle {

    private Point center;
    private double radius;

    public Circle(Point center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter()
    {
        return this.center;
    }

    public double getRadius()
    {
        return this.radius;
    }
    
}
