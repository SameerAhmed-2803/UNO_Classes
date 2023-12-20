public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void moveBy(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public double distance(Point2D other) {
        double distance = Math.sqrt(Math.pow(other.getX() - this.x, 2) + Math.pow(other.getY() - this.y, 2));
        return distance;
    }

    @Override
    public String toString() {
        return String.format("(%.01f,%.01f)", this.x, this.y);
    }
}
