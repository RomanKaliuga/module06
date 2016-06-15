package nightglyuk.gojavaonline.module4upd.task3;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Администратор on 14.06.2016.
 */
public class Runner {
    public static void main(String args[]){
        /** htfkbpfwbz jib,rb ddjlf */
        Scanner scanner= new Scanner(System.in);
        Line myLine = new Line();
        final String userInput=scanner.next();
        System.out.println("set coordinate x1");
        try {
            myLine.setPoint1x(Double.parseDouble(userInput));
        } catch (NumberFormatException ex){
            System.out.println("wrong type + " + ex.toString());
        }
        System.out.println("set coordinate y1");
        try {
            myLine.setPoint1x(Double.parseDouble(userInput));
        } catch (NumberFormatException ex){
            System.out.println("wrong type + " + ex.toString());
        }
        System.out.println("set coordinate x2");
        try {
            myLine.setPoint1x(Double.parseDouble(userInput));
        } catch (NumberFormatException ex){
            System.out.println("wrong type + " + ex.toString());
        }
        System.out.println("set coordinate y2");
        try {
            myLine.setPoint1x(Double.parseDouble(userInput));
        } catch (NumberFormatException ex){
            System.out.println("wrong type + " + ex.toString());
        }
    }
}
