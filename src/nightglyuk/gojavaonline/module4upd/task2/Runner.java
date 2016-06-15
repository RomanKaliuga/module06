package nightglyuk.gojavaonline.module4upd.task2;

import java.util.Scanner;

/**
 * обработка температуры
 */
public class Runner {
    public static void main(String args[]){
        int caseCounter=0;
        Temperature myTemperature = new Temperature();
        Scanner scanner= new Scanner(System.in);
        final String userInput=scanner.next();
        System.out.println("press: 1, to set temperature in Farenheit or anything else to set in Celsium");
        if (scanner.nextInt()==1) {
            myTemperature.isFarenheit=true;
        }
        System.out.print("set Temperature Value");
        try {
            myTemperature.setAmountOfDegrees(scanner.nextDouble());
        }catch (NumberFormatException ex){
            System.out.println("wrong input format!");
        }
        /** перевод температуры */
        if (myTemperature.isFarenheit){
            System.out.println("temperature in Farenheit=" + myTemperature.amountOfDegrees);
            myTemperature.trancfereMethod();
            System.out.println("temperature in Celsium=" + myTemperature.amountOfDegrees);
        }else{
            System.out.println("temperature in Celsium=" + myTemperature.amountOfDegrees);
            myTemperature.trancfereMethod();
            System.out.println("temperature in Farenheit=" + myTemperature.amountOfDegrees);
        }
    }
}
