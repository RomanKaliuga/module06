package nightglyuk.gojavaonline.module4upd.task2;

public class Temperature {
    public double amountOfDegrees;
    public boolean isFarenheit;

    public void setAmountOfDegrees(double amountOfDegrees) {
        this.amountOfDegrees = amountOfDegrees;}


        /** true - температура в фаренгейтах,false - в цельсиях */

    double trancfereMethod() {
        if (isFarenheit) {
            amountOfDegrees = 9 / 5 * amountOfDegrees + 32;

            isFarenheit = false;
        } else {
            amountOfDegrees = 5 / 9 * (amountOfDegrees - 32);
            isFarenheit = true;
        }
        return amountOfDegrees;
    }
   }
