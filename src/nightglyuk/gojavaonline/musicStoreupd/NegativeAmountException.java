package nightglyuk.gojavaonline.musicStoreupd;

/**
 * ошибка указания колличества заказанных инструментов
 */
public class NegativeAmountException extends Exception{

    private int amountValue;

    public int getAmountValue() {
        return amountValue;
    }

    public NegativeAmountException(int amountValue) {

        this.amountValue = amountValue;
    }


}
