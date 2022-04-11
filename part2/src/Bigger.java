public class Bigger{
    
    public static double whichIsBigger(Circle circle, Rectangle rectangle, Polygon polygon){
        double circlePerimeter = circle.perimeter();
        double rectanglePerimeter = rectangle.perimeter();
        double polygonPerimeter = polygon.perimeter();
        if (circlePerimeter > rectanglePerimeter && circlePerimeter > polygonPerimeter) {
            return circlePerimeter;
        } else if (rectanglePerimeter > circlePerimeter && rectanglePerimeter > polygonPerimeter) {
            return rectanglePerimeter;
        } else {
            return polygonPerimeter;
        }
    }
}
