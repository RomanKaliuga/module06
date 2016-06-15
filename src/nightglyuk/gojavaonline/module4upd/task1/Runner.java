package nightglyuk.gojavaonline.module4upd.task1;


import java.util.Scanner;

public class Runner {
    public static void main(String args[]){
        int caseCounter=0;
        /** выбор типа фигуры для подсчёта */
        Scanner scanner= new Scanner(System.in);
        final String userInput=scanner.next();
        System.out.println("press: 1, to work with circle,2 to work with rectangle,3 to work with triangle");
        try {
            caseCounter = Integer.parseInt(userInput);
        }catch (NumberFormatException ex){
            System.out.println("wrong input format!");
        }
        /** инициализация фигур*/
        switch (caseCounter){
            case 1: Circle myCircle= new Circle();
                System.out.println("set circle Radius");
                    try {
                        myCircle.setRadius(scanner.nextDouble());
                    }catch (NumberFormatException ex){
                        System.out.println("wrong input format!");
                    }
                    myCircle.countSquare();
            case 2: Rectangle myRectangle= new Rectangle();
                    System.out.println("set side1 size");
                try {
                    myRectangle.setSide1Size(scanner.nextDouble());
                }catch (NumberFormatException ex){
                    System.out.println("wrong input format!");
                }
                System.out.println("set side2 size");
                try {
                    myRectangle.setSide2Size(scanner.nextDouble());
                }catch (NumberFormatException ex){
                    System.out.println("wrong input format!");
                }
                    myRectangle.countSquare();
            case 3: Triangle myTriangle= new Triangle();
                System.out.println("set side1 size");
                try {
                    myTriangle.setSide1Size(scanner.nextDouble());
                }catch (NumberFormatException ex){
                    System.out.println("wrong input format!");
                }
                System.out.println("set side2 size");
                try {
                    myTriangle.setSide2Size(scanner.nextDouble());
                }catch (NumberFormatException ex){
                    System.out.println("wrong input format!");
                }
                System.out.println("set side3 size");
                try {
                    myTriangle.setSide3Size(scanner.nextDouble());
                }catch (NumberFormatException ex){
                    System.out.println("wrong input format!");
                }
                    myTriangle.countSquare();
            default:    System.out.println("there is no option with this number!");
        }

    }
}
