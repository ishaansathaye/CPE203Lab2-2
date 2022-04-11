public class Rectangle {
    
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Point getTopLeft() {
        return this.topLeft;
    }

    public Point getBottomRight() {
        return this.bottomRight;
    }

    public double perimeter() {
        double side1 = Math.abs(this.topLeft.getX() - this.bottomRight.getX());
        double side2 = Math.abs(this.topLeft.getY() - this.bottomRight.getY());
        return 2*(side1+side2);
    }
}
