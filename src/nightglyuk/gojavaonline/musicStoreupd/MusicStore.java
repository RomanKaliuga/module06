package nightglyuk.gojavaonline.musicStoreupd;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicStore {
    public List<Instrument> instruments;
    public List<Instrument> prepareInstruments(Map<String, Integer> order) {
        for (int i = 0; i < instruments.size(); i++) {
            for (Map.Entry<String, Integer> entry : order.entrySet()) {
                if ((entry.getKey() == this.instruments.get(i).getName()) && (entry.getValue() > this.instruments.get(i).getAmount()))
                    try {
                        throw new NotEnoughAmountException(entry.getValue());
                    } catch (NotEnoughAmountException e) {
                        System.out.println("not enough" + entry.getKey() + "instruments at the store");
                    }
                else {
                    this.instruments.get(i).setAmount(this.instruments.get(i).getAmount() - entry.getValue());
                }

            }
        }
        return this.instruments;
    }
}


