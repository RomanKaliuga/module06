package nightglyuk.gojavaonline.musicStoreupd;

/**
 * ошибка названия инструмента
 */
public class WrongInstrumentException extends Exception {
    public String instrumentName;

    public String getInstrumentName() {
        return instrumentName;
    }

    public WrongInstrumentException(String instrumentName) {
        this.instrumentName = instrumentName;
    }
}
