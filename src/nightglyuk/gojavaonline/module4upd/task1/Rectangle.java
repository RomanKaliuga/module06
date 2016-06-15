package nightglyuk.gojavaonline.module4upd.task1;


public class Rectangle extends Figure{
    double side1Size,side2Size;

    public double getSide1Size() {
        return side1Size;
    }

    public void setSide1Size(double side1Size) {
        this.side1Size = side1Size;
    }

    public double getSide2Size() {
        return side2Size;
    }

    public void setSide2Size(double side2Size) {
        this.side2Size = side2Size;
    }

    public double countSquare() {
        return side1Size*side2Size;
    }

}
