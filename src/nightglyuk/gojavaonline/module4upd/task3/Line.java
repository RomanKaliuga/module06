package nightglyuk.gojavaonline.module4upd.task3;

public class Line {
    double point1x,point1y,point2x,point2y;
    double distance;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getPoint1x() {
        return point1x;
    }

    public void setPoint1x(double point1x) {
        this.point1x = point1x;
    }

    public double getPoint1y() {
        return point1y;
    }

    public void setPoint1y(double point1y) {
        this.point1y = point1y;
    }

    public double getPoint2x() {
        return point2x;
    }

    public void setPoint2x(double point2x) {
        this.point2x = point2x;
    }

    public double getPoint2y() {
        return point2y;
    }

    public void setPoint2y(double point2y) {
        this.point2y = point2y;
    }

    public double countTheAnswer(){
        return Math.pow(Math.pow(point1x-point2x,2)+Math.pow(point1y-point2y,2),1/2);
    }
}
