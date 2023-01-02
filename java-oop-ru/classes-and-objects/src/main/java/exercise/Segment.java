package exercise;


// BEGIN
public class Segment {
    private Point beginPoint;
    private Point endPoint;

    public Segment(Point point1, Point point2) {
        beginPoint = point1;
        endPoint = point2;
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {
        return new Point((beginPoint.getX() + endPoint.getX()) / 2, (beginPoint.getY() + endPoint.getY()) / 2);
    }
}
// END
