package src;

public class Util {
    
    public static double perimeter(Circle circle) {
        return 2*Math.PI*circle.getRadius();
    }

    public static double perimeter(Rectangle rectangle) {
        double side1 = Math.abs(rectangle.getTopLeft().getX() - rectangle.getBottomRight().getX());
        double side2 = Math.abs(rectangle.getTopLeft().getY() - rectangle.getBottomRight().getY());
        return 2*(side1+side2);
    }

    public static double perimeter(Polygon polygon) {
        double polyPerimeter = 0.0;
        for (int i = 0; i < polygon.getPoints().size(); i++) {
            if (i == polygon.getPoints().size()-1) {
                polyPerimeter += Math.sqrt(Math.pow(polygon.getPoints().get(i).getX() - polygon.getPoints().get(0).getX(), 2) + Math.pow(polygon.getPoints().get(i).getY() - polygon.getPoints().get(0).getY(), 2));
            } else {
                polyPerimeter += Math.sqrt(Math.pow(polygon.getPoints().get(i).getX() - polygon.getPoints().get(i+1).getX(), 2) + Math.pow(polygon.getPoints().get(i).getY() - polygon.getPoints().get(i+1).getY(), 2));
            }
        }
        return polyPerimeter;
    }
        
}
