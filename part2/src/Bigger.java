package src;

public class Bigger{
    
    public static double whichIsBigger(Circle circle, Rectangle rectangle, Polygon polygon){
        double circlePerimeter = Util.perimeter(circle);
        double rectanglePerimeter = Util.perimeter(rectangle);
        double polygonPerimeter = Util.perimeter(polygon);
        if (circlePerimeter > rectanglePerimeter && circlePerimeter > polygonPerimeter) {
            return circlePerimeter;
        } else if (rectanglePerimeter > circlePerimeter && rectanglePerimeter > polygonPerimeter) {
            return rectanglePerimeter;
        } else {
            return polygonPerimeter;
        }
    }
}
