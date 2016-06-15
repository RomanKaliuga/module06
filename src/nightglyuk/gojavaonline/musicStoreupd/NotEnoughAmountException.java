package nightglyuk.gojavaonline.musicStoreupd;

/**
 * нехватка на складе
 */
public class NotEnoughAmountException extends Exception {
    private int amountValue;

    public int getAmountValue() {
        return amountValue;
    }

    public NotEnoughAmountException(int amountValue) {
        this.amountValue = amountValue;
    }
}
