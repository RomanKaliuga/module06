package nightglyuk.gojavaonline.module4upd.task1;


public class Circle extends Figure {
    public double radius;

    public double getRadius() {
        return radius;
    }

    public  void setRadius(double radius) {
        this.radius = radius;
    }


    double countSquare() {

        return 3.14 * Math.pow(radius, 2);
    }
}
