package nightglyuk.gojavaonline.module4upd.task1;

    public class Triangle extends Figure{
        double side1Size,side2Size,side3Size;
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

        public double getSide3Size() {
            return side3Size;
        }

        public void setSide3Size(double side3Size) {
            this.side3Size = side3Size;
        }

        public double countSquare(){
            return 1/4*Math.pow((side1Size+side2Size+side3Size)*(side1Size+side2Size-side3Size)*(side1Size+side3Size-side2Size)*(side3Size+side2Size-side1Size),1/2);
        }

    }
