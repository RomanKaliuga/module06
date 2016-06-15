package nightglyuk.gojavaonline.musicStoreupd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 */
public class Runner {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        MusicStore myMusicStore = new MusicStore();
        /** инициализация магазина */
        System.out.println("input number of guitars");
        myMusicStore.instruments.get(0).setName("guitar");
        myMusicStore.instruments.get(0).setAmount(scanner.nextInt());

        System.out.println("input number of pianos");
        myMusicStore.instruments.get(1).setName("piano");
        myMusicStore.instruments.get(1).setAmount(scanner.nextInt());

        System.out.println("input number of trumpet");
        myMusicStore.instruments.get(2).setName("trumpet");
        myMusicStore.instruments.get(2).setAmount(scanner.nextInt());

        /** инициализация заказа*/
        Map order = new HashMap<String,Integer>();
        System.out.println("input number of instrument names");
        int instrumetAmount=scanner.nextInt();
        for (int i=0;i<instrumetAmount;i++) {
            System.out.println("input instrument name");
            String tempString = scanner.next();
            System.out.println("input amount of this instrument in order");
            int tempAmount=scanner.nextInt();
            if (tempAmount<=0) try {
                throw new NegativeAmountException(tempAmount);
            } catch (NegativeAmountException e) {
                System.out.println("you can't order less then 1 instrument");
            } else {
            if ((tempString!="piano")||(tempString!="trumpet")||(tempString!="guitar")) try {
                throw new WrongInstrumentException(tempString);
            } catch (WrongInstrumentException e) {
                System.out.println("there is no such instrument at the store");
            }else{
                order.put(tempString,tempAmount);
            }
            }
        }

    }
}
