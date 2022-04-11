import java.util.*;

public class Polygon {

    List<Point> points;

    public Polygon(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return this.points;
    }

    public double perimeter() {
        double polyPerimeter = 0.0;
        for (int i = 0; i < this.points.size(); i++) {
            if (i == this.points.size()-1) {
                polyPerimeter += Math.sqrt(Math.pow(this.points.get(i).getX() - this.points.get(0).getX(), 2) + Math.pow(this.points.get(i).getY() - this.points.get(0).getY(), 2));
            } else {
                polyPerimeter += Math.sqrt(Math.pow(this.points.get(i).getX() - this.points.get(i+1).getX(), 2) + Math.pow(this.points.get(i).getY() - this.points.get(i+1).getY(), 2));
            }
        }
        return polyPerimeter;
    }
    
}
